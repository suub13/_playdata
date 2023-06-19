package org.example;

import org.example.Dto.BookDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,3,2,4,5,6,7,11,15,21,18,29,24);
        for (Integer number : numbers) {
            System.out.println(number);
        }
        // 아래 3줄 코드와 같음
        numbers.forEach(System.out::println);
//        numbers.forEach(( x)-> {
//            System.out.println(x);
//        });

        List<BookDto> bookList = Arrays.asList(
                new BookDto("야간비행", "생택쥐배리", 4, 5000),
                new BookDto("그리고 아무도 없었다", "아가사크리스티",4,5000),
                new BookDto("마음의 감옥", "김원일",4,5000),
                new BookDto("광장", "최연훈",4,5000)
        );

        // Arrays.asList 로 List 객체를 생성하면 readonly 용 - readonly 메모리에 데이터 추가 불가
//        bookList.add(new BookDto("아지갑","ㅇㅇ",40,200000));

        // stream을 사용하면 데이터를 병렬처리가 가능하다 (속도가 빠르다)

        // filter: 첫번째 매개변수가 함수이다. 매개변수가 하나 있고 반환값이 boolean 이다.
        // 만일 true를 리턴하면 새로 목록을 만들어서 던져준다. false인건 버린다.
        // (obj)-> obj.getTitle().equals("광장") -> 이게 람다
        // 매개변수에는 BookDto 객체
        // return 구문을 안쓸 경우에는 {}도 못쓴다.
        /*
        {
            if(obj.getTitle().equals("광장"){
                return true;
            }
            else return false;
        }
         */

        Stream<BookDto> result = bookList.stream().filter((obj)-> obj.getTitle().equals("광장"));

        bookList.stream()
                .filter((obj)-> obj.getTitle().equals("광장")) //중간연산자: 반환값이 다시 stream
                .forEach((obj)-> { //최종연산자: 함수중에 반환값이 없을경우에는
                    System.out.printf("%s %s %d %d %d\n", obj.getTitle(), 
                            obj.getAuthor(), obj.getCount(), obj.getPrice(), 
                            obj.getCount()*obj.getPrice());
                });

        // int - 값타입, Integer - 참조타입
        // 값타입도 참조타입으로의 변환이 필요하다. Wrapper 클래스
        // List 클래스 만들 때, 내부에 무조건 참조로 저장한다.
        List<Integer> evenList = new ArrayList<Integer>();
        List<Integer> oddList = new ArrayList<Integer>();
        numbers.forEach((n) -> {
            if (n%2==0)
                evenList.add(n);
            else
                oddList.add(n);
        });
        System.out.println("\n짝수");
        evenList.forEach((n)-> System.out.print(n +" "));
        System.out.println("\n홀수");
        oddList.forEach((n)-> System.out.print(n +" "));

        // collect - 결과타입을 전환시킬 수 있다. list로 전환 collect(Collectors.toList()

        // stream 사용

        List<Integer> resultList1  = numbers.stream().filter((n)-> n%2==0).collect(Collectors.toList());
        List<Integer> resultList2  = numbers.stream().filter((n)-> n%2==1).collect(Collectors.toList());

        System.out.println("\n짝수 Stream");
        resultList1.forEach(System.out::println);
        System.out.println("홀수 Stream");
        resultList2.forEach(System.out::println);

        List<String> wordList = Arrays.asList("school","flower","Fruit","pop","hospital","home","rain","cloud");
        // 1. 글자수 5글자 이상 추출
        System.out.println("5글자 이상");
        wordList.stream()
                .filter((str)-> str.length()>=5)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // 2. o를 포함하는 단어 추출
        System.out.println("o 포함");
        wordList.stream()
                .filter((str)-> str.indexOf('o')>-1)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // 3. f로 시작하는 단어 추출
        System.out.println("f로 시작");
        wordList.stream()
                .filter((str)-> str.startsWith("f")|str.startsWith("F"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
