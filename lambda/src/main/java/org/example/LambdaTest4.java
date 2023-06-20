package org.example;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class LambdaTest4 {
    public static void main(String[] args) {
        //filter - 검색
        //map - 연산을 수행해서 수행한 결과를 반환한다. 자기자신은 안바뀌고, 새로운 연산을 수행해서 반환할때
        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> resultStream = numList.stream().map((t)->{ return t*10; });
        resultStream.forEach(System.out::println); //매개변수를 생략하고 호출돨 함수의 주소를 준다. :: 주소
        System.out.println("원본데이터");
        numList.stream().forEach(System.out::println);
        numList.stream().map( (x)->x+10)
                .forEach(System.out::println);

        List<ScoreData> scoreList = Arrays.asList(
                new ScoreData("name1",80,50,60),
                new ScoreData("name2",65,88,91),
                new ScoreData("name3",90,87,66),
                new ScoreData("name4",92,93,72),
                new ScoreData("name5",74,95,95),
                new ScoreData("name6",72,88,96),
                new ScoreData("name7",53, 88,64),
                new ScoreData("name8",89,66,98)
        );

        scoreList.stream().map(x ->{
            ScoreData temp = new ScoreData(x.name, x.kor, x.eng, x.mat);
            temp.process();
            return temp;
        }).forEach(System.out::println); //ScoreData의 toString 함수 호출

        // 성적기준으로 top3만 가져오기
        Stream<ScoreData> ss = scoreList.stream();
        ss.map(x ->{
            ScoreData temp = new ScoreData(x.name, x.kor, x.eng, x.mat);
            temp.process();
            return temp;
        }).sorted((x1, x2) -> x2.total-x1.total)
                .limit(3)
                .forEach(System.out::println);
    }
}





















