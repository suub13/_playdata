package sec02.exam03;

public class LongExample {
    public static void main(String[] args) {
        // long type은 2의 63승 까지 표현.
        // int type은 2의 31승까지 표현
        
        long var1 = 10;
        long var2 = 20L;
        // -2,147,483,648 ~ 2,147,483,647 값을 벗어날 때, Long type을 나타는 L을 숫자 뒤에 표현해야 함.
//        long var3 = 10000000000; // compile 에러
        long var4 = 10000000000L;

        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
//        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);

    }
}
