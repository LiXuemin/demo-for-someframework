package com.lixuemin.hdfs;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.util.StringUtils;


/**
 *
 **/
public class HDFSDemo1 {
    public static final String HADOOP_URI = "hdfs://192.168.54.145:8020";
    public static void main1(String[] args) throws URISyntaxException, IOException, InterruptedException {
        Configuration conf = new Configuration();
        String localDir = "F:\\test.txt";
        String hdfsDir = HADOOP_URI + "/ods";
        try{
            Path localPath = new Path(localDir);
            Path hdfsPath = new Path(hdfsDir);
            FileSystem hdfs = FileSystem.get(URI.create(HADOOP_URI), conf);
            if(!hdfs.exists(hdfsPath)){
                hdfs.mkdirs(hdfsPath);
            }
            hdfs.copyFromLocalFile(localPath, hdfsPath);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String s = "abc";
        System.out.println(s.charAt(0)-'a');
        Map<Character, Integer> map = new HashMap<>();
        //map.computeIfAbsent(s.charAt(0), )
    }
}
