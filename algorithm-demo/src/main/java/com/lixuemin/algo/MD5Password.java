package com.lixuemin.algo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class MD5Password {
    public static void main(String[] args) {
        File file = new File("D:\\weakpass.txt");
        BufferedReader reader = null;
        String temp = null;
        List<String> listMD5 = new ArrayList<>();
        String md5Temp = null;
        try {
            int line = 1;
            reader = new BufferedReader(new FileReader(file));
            while ((temp = reader.readLine()) != null) {
                md5Temp = EncryptUtils.MD5Encode(temp);
                listMD5.add(md5Temp);
                System.out.println(md5Temp);
                line++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //System.out.println(listMD5);
            if (reader != null) {
                try {
                    reader.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
