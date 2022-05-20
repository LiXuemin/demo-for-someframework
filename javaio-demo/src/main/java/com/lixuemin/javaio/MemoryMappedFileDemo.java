package com.lixuemin.javaio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;


/**
 *
 **/
public class MemoryMappedFileDemo {
    private static FileChannel channel;

    public static void main(String[] args) {
        File file = new File("F:\\test.txt");
        try {
            //throws java.nio.channels.NonWritableChannelException
            //final FileChannel channel = new FileInputStream(file).getChannel();
            final FileChannel channel = new RandomAccessFile(file, "rw").getChannel();
            final MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, file.length());
            buffer.put("lixueminwudidwu".getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
