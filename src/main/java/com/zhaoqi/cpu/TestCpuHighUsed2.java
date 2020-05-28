package com.zhaoqi.cpu;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zhaoqi
 * @since 2020-05-26
 */
public class TestCpuHighUsed2 {


    public static void main(String[] args) throws IOException, InterruptedException {

        File file  = new File("/Users/dasouche/a");
        if(!file.exists()){
            boolean newFile = file.createNewFile();
        }
        OutputStream outputStream = new FileOutputStream(file);

        List<byte[]> byteList=new LinkedList<>();

        int count=0;
        while (true){
            System.out.println(count);
            byte[] bytes = new byte[1024 * 500];
            byteList.add(bytes);
            count++;
        }



    }
}
