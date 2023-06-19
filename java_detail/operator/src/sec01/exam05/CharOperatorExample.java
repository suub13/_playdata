package sec01.exam05;

public class CharOperatorExample {
    public static void main(String[] args) {
        char c1 = 'A'+1;
        char c2 = 'A';
//        char c3 = c2 + 1; // char값이 산술연산에서는 int값으로 변환
        char c3 = (char)(c2+1);
        System.out.println("c1: " +c1);
        System.out.println("c2: " +c2);
        System.out.println("c3: " +c3);
    }
}
