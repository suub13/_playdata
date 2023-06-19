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
    }
}





















