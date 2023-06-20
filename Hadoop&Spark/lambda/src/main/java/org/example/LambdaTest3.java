package org.example;

import java.util.Arrays;
import java.util.List;

// 제너릭 - 시스템이 프로그램 가동할 때, 클래스를 새로 정의해서 작동시킨다.
// 템플릿 = 제네릭
@FunctionalInterface
interface Compare<T>{
    int compareTo(T t1, T t2);
}

@FunctionalInterface
interface Equals<T>{
    boolean test(T t1, T t2);
}

public class LambdaTest3 {
    public static void main(String[] args) {
        String s1 = "test"; // "문자열" - 문자열 상수, 저장영역이 달라서
        String s2 = "test";

        if(s1 == s2) System.out.println("둘이 같다 - 동일한 메모리이다.");
        if(s1.equals(s2)) System.out.println("둘이 같다 - 내용이 같다.");

        // 둘 간의 크기 비교 - 람다를 이용하여 해보자
        Compare<String> comp;
        comp = (t1, t2) -> t1.compareTo(t2); // 람다 함수를 comp 객체에 저장함.
        
        // compareTo - String 클래스의 멤버 함수
        // s1.compareTo(s2) s1이 사전순서상 앞에 있으면 -1, 둘이 같으면 0, 뒤에 순서면 1

        if(comp.compareTo(s1, s2) > 0)
            System.out.printf("%s가 %s 보다 크다", s1, s2);
        else if(comp.compareTo(s1, s2) == 0)
            System.out.printf("%s가 %s랑 같다", s1, s2);
        else
            System.out.printf("%s가 %s 보다 작다", s1, s2);

        // 검색 함수
        Compare<Person> perComp = (t1, t2)-> t1.name.compareTo(t2.name); // 비교구문 만들기
        Person p1 = new Person("홍길동", "010-0000-0000", "hong@ddd.ddd");
        Person p2 = new Person("임꺽정", "010-1234-1234", "lim@ddd.ddd");

        System.out.println(perComp.compareTo(p1, p2)); // 두 값의 차이가 나온다.

        List<Person> perList = Arrays.asList(
                new Person("홍길동", "010-0000-0000", "hong@ddd.ddd"),
                new Person("임꺽정", "010-1111-1111", "lim@ddd.ddd"),
                new Person("장길산", "010-2222-2222", "jang@ddd.ddd"),
                new Person("을지문덕", "010-3333-3333", "eul@ddd.ddd"),
                new Person("강감찬", "010-4444-4444", "kang@ddd.ddd")
        );

        Person key = new Person("강감찬");
        int pos = search(perList,key, (t1, t2) -> t1.name.equals(t2.name));
        if(pos==1) System.out.println("데이터 없음");
        else System.out.printf("%d번 쨰에 있음",pos);



    }
    // Generic을 지원
    // T -> 앞으로 여기에 뭐가 올지는 함수 사용방법을 보고 동적으로 결정이 된다.
    // t에 String을 보낼 수도 있고, Integer을 보낼수도 있고, Person을 보낼 수도 있다.
    // key는 찾을 값, Equals가 람다
    public static<T> int search(List<T> numList, T key, Equals<T> E){
        for(int i=0; i<numList.size(); i++){
            if(E.test(numList.get(i), key))
                return i;
        }
        return -1;
    }

}

// 클래스에 적용해 보자
class Person{
    String name="";
    String phone="";
    String email="";
    public Person(){}

    public Person(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", name, phone, email);
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
