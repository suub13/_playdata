package sec04.exam02;

public class KeyCodeExample {
    public static void main(String[] args) throws Exception{
        int keyCode;

        keyCode = System.in.read(); //들어오는 값에 따라 에러를 야기할 수 있다.
        System.out.println("keyCode: "+keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode: "+keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode: "+keyCode);
    }
}
