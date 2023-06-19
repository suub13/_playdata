package sec02.exam06;

public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("번호\t이름\t직업");
        System.out.print("행 단위 출력\n"); // System.out.println이 아닌 print이다.
        System.out.print("행 단위 출력\n"); // 뒤에 \n이 붙은 것과 같은 의미.
        System.out.println("우리는 \"개발자\"입니다.");
        System.out.println("봄\\여름\\가을\\겨울");
    }
}
