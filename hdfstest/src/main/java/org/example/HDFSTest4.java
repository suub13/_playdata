package org.example;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HDFSTest4 {
    void fileRead(String filename) {
        FileSystem hdfs = null;
        FSDataInputStream hdfsIn = null;
        int count = 0;
        long sum = 0;

        try {
            Configuration conf = new Configuration();
            hdfs = FileSystem.get(conf);
            Path path = new Path(filename);
            hdfsIn = hdfs.open(path);

            BufferedReader reader = new BufferedReader(new InputStreamReader(hdfsIn));

            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    int number = Integer.parseInt(line);
                    System.out.println(number);
                    sum += number;
                    count++;
                } catch (NumberFormatException e) {
                    // 정수로 변환할 수 없는 데이터는 건너뜁니다.
                    System.out.println("정수로 변환할 수 없는 데이터: " + line);
                }
            }

            if (count > 0) {
                double average = (double) sum / count;
                System.out.println("평균: " + average);
            } else {
                System.out.println("파일에 숫자가 없습니다.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (hdfsIn != null) hdfsIn.close();
                if (hdfs != null) hdfs.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        HDFSTest4 readTest = new HDFSTest4();
        System.out.println("hdfstest-1.jar 클래스명 경로및 파일명");
        readTest.fileRead(args[0]);
    }
}
