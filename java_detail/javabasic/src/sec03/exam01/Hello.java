package sec03.exam01;
import java.util.Scanner;
/**
 * 작성자: 유수빈
 * 작성일: 2023/03/22
 *
 */
public class Hello {
    // 프로그램 실행 진입점
    public static void main(String[] args) {
//        long var1 = 2L;
//        float var2 = 1.8f;
//        double var3 = 2.5;
//        String var4 = "3.9";
//
//        int result = (int)(var1 + var2 + (int)var3 + Double.parseDouble(var4));
//        int result1 = (int) (var1 + var2 + var3 + Double.parseDouble(var4));
//        System.out.println(result);
//        System.out.println(result1);
//
//        String  name = "감자바";
//        int age = 25;
//        String tel1 = "010", tel2 = "123",tel3 = "4567";
//        System.out.println("이름: " + name);
//        System.out.print("나이: "+ age + "\n");
//        System.out.printf("전화: %s-%s-%s", tel1, tel2, tel3);

        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("첫번째 수: ");
//        String strNum1 = scanner.nextLine();
//        System.out.print("두번째 수: ");
//        String strNum2 = scanner.nextLine();
//
//        int num1 = Integer.parseInt(strNum1);
//        int num2 = Integer.parseInt(strNum2);
//
//        int result = num1 + num2;
//        System.out.println("덧셈 결과: "+result);


        System.out.print("1. 이름: ");
        String name = scanner.nextLine();
        System.out.print("2. 주민번호 앞 6자리: ");
        String perNum = scanner.nextLine();
        System.out.print("3. 전화번호: ");
        String number = scanner.nextLine();

        System.out.printf("\n[입력한 내용]\n%s \n%s \n%s", name, perNum, number);





    }
}

