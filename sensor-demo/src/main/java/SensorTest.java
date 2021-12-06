import com.sensorsdata.analytics.javasdk.ISensorsAnalytics;
import com.sensorsdata.analytics.javasdk.SensorsAnalytics;
import com.sensorsdata.analytics.javasdk.bean.EventRecord;
import com.sensorsdata.analytics.javasdk.bean.UserRecord;
import com.sensorsdata.analytics.javasdk.consumer.DebugConsumer;
import com.sensorsdata.analytics.javasdk.exceptions.InvalidArgumentException;


/**
 *
 **/
public class SensorTest {
    public static void main(String[] args) throws InvalidArgumentException {
        String serverUrl = "";
        ISensorsAnalytics sa = new SensorsAnalytics(new DebugConsumer(serverUrl,true));
        UserRecord userRecord = UserRecord.builder().setDistinctId("sdff-123-1231").addProperty("userName","lixuemin").build();
        EventRecord eventRecord = EventRecord.builder().setDistinctId("sdff-123-1231")。
        sa.profileSet(userRecord);
        sa.itemSet();
    }
}
