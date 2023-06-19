package sec02.exam06;

public class BreakOutterExample {
    public static void main(String[] args) {
        Outter:
        for (char upper = 'A'; upper <='Z'; upper++){
            for (char lower = 'a'; lower <= 'z'; lower++) {
                System.out.println(upper + "-"+lower);
                if (lower == 'g'){
                    break Outter; // Outter를 빠져나간다.
                }
            }
        }
        System.out.println("프로글매 실행 종료");
    }
}
