package sec01.exam01;

public class SignOperatorExample {
    public static void main(String[] args) {
        int x = -100;
        int result1 = +x;
        int result2 = -x;
        System.out.println("result1 = "+result1);
        System.out.println("result2 = "+result2);

        byte b = 100;
//        byte result3 = -b; // -b에 대한 결과가 int로 return됨.
        int result3 = -b;
        System.out.println("result3 = "+result3);
    }
}
