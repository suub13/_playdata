package org.example;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {

        Configuration conf = new Configuration();
        // hdfs 파일 시스템에 접근하기 위한 객체이다.
        FileSystem hdfs = null;
        //하둡시스템에 데이터를 출력하기 위한 객체임
        //java에서도 outputstream 통해서 출력한다.
        FSDataOutputStream hdfsout = null;

        Scanner scanner = new Scanner(System.in);

        try {
            //1. 연결하기
            hdfs = FileSystem.get(conf); // hadoop의 구조에 접근하기

            //2. hdfs 의 경로 가져오기
            Path path = new Path(args[0]); // 실행 시 전달되는 파일경로를 만들기 위한 객체

            //3. 파일에 쓰기 위한 출력스트림 객체를 생성한다.
            hdfsout = hdfs.create(path);




            try {
                System.out.println("Insert the number for multiplcation: ");
                int num = scanner.nextInt();
                for(int i=1; i<10; i++){
                    int result = i * num;
                    hdfsout.writeUTF(String.format("%d x %d = %d \n",num, i, result));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            //출력하기 위한 준비 작업
//            hdfsout.writeUTF("첫번째 하둡 프로그래밍\n");
//            hdfsout.writeUTF("hdfs에 출력을 해보자\n");
//            hdfsout.writeUTF("이브 프시케 푸른수염의 아내 - 르세라핌\n");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            try {
                if (hdfsout != null) hdfsout.close();
                if (hdfs != null) hdfs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

