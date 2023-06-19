package sec02.exam02;

public class ByteExample {
    public static void main(String[] args) {
        // byte 는 -128 ~ 127 사이의 값만 허용.
        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 0;
        byte var4 = 127;
        //byte var5 = 128; //에러가 난다.

        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
//        System.out.println("var5: " + var5);

    }
}
