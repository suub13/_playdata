package sec01.exam04;

public class VariableScopeExample {
    public static void main(String[] args) {
        int v1 = 15;
        if(v1 > 10) {
            int v2;
            v2 = v1 - 10;
//            System.out.println(v2);
        }
        // int v3 = v1 + v2; -> error남 v2는 앞에 if절 안에서 선언해준 값이라
        // 해당 if절을 벗어나면 사용할 수 없음
    }
}
