package com.lixuemin.flink;

import com.lixuemin.flink.operator.flatmap.LineSplitter;
import com.lixuemin.flink.source.WordStreamSource;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.windowing.time.Time;

/**
 * 使用时间窗口，每隔指定时间计算期间word count
 * */
public class StreamWindowWordCount {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        final DataStream<Tuple2<String, Integer>> ds = env.addSource(new WordStreamSource())
            .flatMap(new LineSplitter())
            .keyBy(0)
            //每5s输出一次，source每秒发送一个，正常每次输出的sum之和是5.
            //但是第一次输出可能不是5
            .timeWindow(Time.seconds(5))
            .sum(1);
        ds.print("----------");

        env.execute("WordCountWindow");
    }
}
