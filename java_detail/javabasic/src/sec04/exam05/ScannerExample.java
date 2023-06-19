package sec04.exam05;

import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputData;

        while(true){
            inputData = scanner.nextLine();
            System.out.println("입력된 문자열: \"" + inputData + "\"");
            if(inputData.equals("q")){ // String은 자바에서 클래스이다.
                break; // 비교하려면 .equals를 사용해서 비교해야 한다.
            }
        }
    }
}
