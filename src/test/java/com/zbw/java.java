package com.zbw;

import java.io.*;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;

public class java {
    public static void main(String []args) {
        try{
            long d = 2;
            long dd=499;
        Instant instant=Instant.now();
        LocalDateTime localdatetime= LocalDateTime.now();
        LocalDateTime lo=localdatetime.with(Month.JULY).with(TemporalAdjusters.lastDayOfMonth());
        Duration duration = Duration.parse("P2DT3H4M");
        System.out.println(lo);
        String dirname = "/java";
        File f1 = new File(dirname);
        Path path= Paths.get("D:/project");
        URI uri=path.toUri();
        FileSystem fileName=path.getFileSystem();
        ArrayList<Character> charList=new ArrayList<Character>();
        FileOutputStream fileOutputStream=new FileOutputStream(f1);
        InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream("D:/"));
        FileReader fileReader=new FileReader("");
            FileChannel fileChannel=new RandomAccessFile("","rw").getChannel();
            ByteBuffer byteBuffer=ByteBuffer.allocate(1024);















        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}

    class myThread extends Thread{
private int i;
public void run () {
        for (;i<100;i++){
        System.out.println(getName());
        }
        }
        }
