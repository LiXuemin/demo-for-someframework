import com.sensorsdata.analytics.javasdk.ISensorsAnalytics;
import com.sensorsdata.analytics.javasdk.SensorsAnalytics;
import com.sensorsdata.analytics.javasdk.bean.EventRecord;
import com.sensorsdata.analytics.javasdk.bean.ItemRecord;
import com.sensorsdata.analytics.javasdk.bean.UserRecord;
import com.sensorsdata.analytics.javasdk.consumer.ConsoleConsumer;
import com.sensorsdata.analytics.javasdk.consumer.DebugConsumer;
import com.sensorsdata.analytics.javasdk.exceptions.InvalidArgumentException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;


/**
 *
 **/
public class SensorTest {
    public static void main(String[] args) throws InvalidArgumentException {
        // 将数据输出到标准输出
        final Writer writer = new PrintWriter(System.out);
// 使用 ConsoleConsumer 初始化 SensorsAnalytics
        final SensorsAnalytics sa = new SensorsAnalytics(new ConsoleConsumer(writer));
        UserRecord userRecord = UserRecord.builder().setDistinctId("sdff-123-1231").isLoginId(false).addProperty("userName","lixuemin").build();
        EventRecord eventRecord = EventRecord.builder().setDistinctId("sdff-123-1231").isLoginId(false).setEventName("PageView").build();
        ItemRecord itemRecord = ItemRecord.builder().setItemId("").build();
        sa.profileSet(userRecord);
        //sa.itemSet();
        sa.trackSignUp("sdff-123-1231", "32313232");
        sa.flush();
    }
}
