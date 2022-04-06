package com.lixuemin.hdfs;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.util.StringUtils;


/**
 *
 **/
public class HDFSDemo1 {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        System.out.println(StringUtils.simpleHostname("hdfs://1.1.1.1:9000"));
        Configuration config = new Configuration();
        URI uri = new URI("hdfs://1.1.1.1:9000");
        FileSystem fs = FileSystem.get(uri, config, "hadoop");
        Path path = new Path("./test.txt");
        FileStatus fileStatus = fs.getFileLinkStatus(path);
    }
}
