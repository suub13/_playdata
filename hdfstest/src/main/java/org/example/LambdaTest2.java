package org.example;


import org.example.Dto.BookDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 무슨 기능을 할지 람다 함수로 넣어주면 됨.
@FunctionalInterface
interface MyCalculator{
    int calc(int x, int y);
}

@FunctionalInterface
interface CompareTo{
    int compareTo(Object ob1, Object ob2); // 뭐가 넘어올지 몰라서 Object 객체를 사용한다.
}
public class LambdaTest2 {

    public static void callAdd(MyCalculator calc, int x, int y){
        System.out.println(calc.calc(x, y));
    }

    public static void selectSort(List<Object> a, CompareTo comp){
        for(int i=0; i<a.size(); i++){
            for(int j=i+1; j<a.size(); j++){
                if(comp.compareTo(a.get(i), a.get(j))>0){
                    Object temp = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, temp);
                }
            }
        }

    }
    public static void main(String[] args) {
        // 인터페이스 객체에 람다를 저장한다.
        MyCalculator m1 = (x, y) -> x*y;

        // 람다 실행
        System.out.println(m1.calc(4,5));

        callAdd((x, y)-> x+y, 20,30);

        List<Object> numList = new ArrayList<Object>();
        numList.add(4);
        numList.add(8);
        numList.add(2);
        numList.add(5);
        numList.add(1);
        numList.add(6);
        numList.add(7);
        numList.add(0);
        numList.add(9);
        numList.add(3);

        selectSort(numList, (x, y)-> (int)x-(int)y);

        List<Object> bookList = Arrays.asList(
                new BookDto("야간비행", "생택쥐배리", 4, 5000),
                new BookDto("그리고 아무도 없었다", "아가사크리스티",4,5000),
                new BookDto("마음의 감옥", "김원일",4,5000),
                new BookDto("광장", "최연훈",4,5000)
        );

        selectSort(bookList, (o1, o2)-> {
            BookDto b1 = (BookDto)o1;
            BookDto b2 = (BookDto)o2;
            return b1.getTitle().compareTo(b2.getTitle());
        });

        bookList.forEach((dto)->{
            System.out.println(((BookDto)dto).getTitle());
        });


    }
}

