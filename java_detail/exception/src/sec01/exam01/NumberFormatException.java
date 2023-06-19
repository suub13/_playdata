package sec01.exam01;

public class NumberFormatException {
    public static void main(String[] args) {
        String data1 = "100";
        String data2 = "a100";

        int value1 = Integer.parseInt(data1);
        int value2 = Integer.parseInt(data2);// a100이 숫자 변환이 안된다.

        int result = value1 + value2;

        System.out.println(data1 + " + "+data2 + " = "+ result);
    }
}
