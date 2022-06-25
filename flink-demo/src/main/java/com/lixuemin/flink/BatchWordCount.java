package com.lixuemin.flink;

import com.lixuemin.flink.operator.flatmap.LineSplitter;
import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.tuple.Tuple2;

/**
 * 简单的wordcount
 * DataSet API 处理有界数据流
 * */
public class BatchWordCount {
    public static void main(String[] args) throws Exception {
        ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();
        DataSet<String> text = env.fromElements("Flink batch demo", "batch demo", "demo");
        DataSet<Tuple2<String,Integer>> ds = text.flatMap(new LineSplitter())
            .groupBy(0)
            .sum(1);
        ds.print();
    }


}
