package com.lixuemin.flink;

import com.lixuemin.flink.operator.flatmap.LineSplitter;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;


/**
 * word count
 * DataStream API 处理无界数据流
 * */
public class StreamWordCount {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        DataStream<Tuple2<String, Integer>> dataStream = env.addSource(new WordStreamSource())
            .flatMap(new LineSplitter())
            .keyBy(0)
            .sum(1);
        dataStream.print();

        //flink是懒加载，必须调用execute()才会执行
        env.execute("WordCount");
    }
}
