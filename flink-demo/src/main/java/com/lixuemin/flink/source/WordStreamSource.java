package com.lixuemin.flink.source;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.apache.flink.streaming.api.functions.source.SourceFunction;


public class WordStreamSource implements SourceFunction<String> {
    private boolean running = true;

    private final Random random = new Random();

    @Override
    public void run(SourceContext<String> sourceContext) throws Exception {
        while (running) {
            List<String> list = new ArrayList<>();
            list.add("world");
            list.add("flink");
            list.add("steam");
            list.add("batch");
            list.add("table");
            list.add("sql");
            list.add("hello");
            int size = list.size();
            int i = random.nextInt(size);
            sourceContext.collect(list.get(i));
            Thread.sleep(1000);
        }
    }

    @Override
    public void cancel() {
        running = false;
    }
}
