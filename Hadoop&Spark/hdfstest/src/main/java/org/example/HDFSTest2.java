package org.example;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class HDFSTest2 {
    void fileRead(String filename){
        // 매개 변수로 파일명을 주면 파일을 읽어온다.
        Configuration conf = null;
        FileSystem hdfs = null;
        FSDataInputStream hdfsIn = null;
        try {
            conf = new Configuration();
            Path path = new Path(filename);
            hdfs = FileSystem.get(conf);
            hdfsIn = hdfs.open(path);
            String data;
            while(true){
                try {
                    data = hdfsIn.readUTF();
                    System.out.println(data);
                } catch (Exception e){
                    break;
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        } finally {
            try{
                if(hdfsIn !=  null) hdfsIn.close();
                if(hdfs != null) hdfs.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        HDFSTest2 readTest = new HDFSTest2();
        System.out.println("hdfstest-1.jar 클래스명 경로 및 파일 명 ");
        readTest.fileRead(args[0]);
    }
}

// hadoop jar mdfstest-1.jar org.example.HDFSTest2 /output1.txt
// data.txt
/*

 */