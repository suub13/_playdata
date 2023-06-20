package org.example;

//hdfs에 접근하려면 내부 구조를 읽어야 한다.
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class Main {
    public static void main(String[] args) {
        // 이 객체를 통해서 하둡(hdfs)에 접근해야 한다. hdfs의 설정구조
        Configuration conf = new Configuration();
        // hdfs 파일 시스템에 접근하기 위한 객체이다.
        FileSystem hdfs = null;
        //하둡시스템에 데이터를 출력하기 위한 객체임
        //java에서도 outputstream 통해서 출력한다.
        FSDataOutputStream hdfsout = null;

        try {
            //1. 연결하기
            hdfs = FileSystem.get(conf); // hadoop의 구조에 접근하기

            //2. hdfs 의 경로 가져오기
            Path path = new Path(args[0]); // 실행 시 전달되는 파일경로를 만들기 위한 객체

            //3. 파일에 쓰기 위한 출력스트림 객체를 생성한다.
            hdfsout = hdfs.create(path);


            //출력하기 위한 준비 작업
            hdfsout.writeUTF("첫번째 하둡 프로그래밍\n");
            hdfsout.writeUTF("hdfs에 출력을 해보자\n");
            hdfsout.writeUTF("이브 프시케 푸른수염의 아내 - 르세라핌\n");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally{
            try {
                if (hdfsout != null) hdfsout.close();
                if (hdfs!=null) hdfs.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

// 작동 절차
// jar 파일을 삼바를 이용해서 hduser/hadoop_test 놓고
// cd ~/hadoop_test 내가 어디에 있던 ~를 입력하면 home directory로 이동..
// hadoop jar: jar 실행명령어
// hdfstest-1.jar: jar 파일명
// org.example.Main: 실행 할 클래스명(main 함수를 갖고 있는)
// /output1.txt 출력될 경로와 파일명
// hadoop jar hdfstest-1.jar org.example.Main /output1.txt
// 확인해 보기
// hdfs dfs -ls /
// hdfs dfs -cat /output1.txt

// 문제1 키보드로 입력받아 저장하는데
// 마지막에 빈문자열 입력될 떄 까지