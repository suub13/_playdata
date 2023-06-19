package sec01.exam08;

public class CompareOperatorExample2 {
    public static void main(String[] args) {
        int v2 = 1;
        double v3 = 1.0;
        System.out.println(v2 == v3);

        double v4 = 0.1;
        float v5 = 0.1f;
        System.out.println(v4 == v5);
        System.out.println((float)v4==v5);
        // int와 double을 비교할 때는 int값이 double로 변환
        // double과 float를 비교할 떄는 비교할 수 없음.
        // float는 부동 소수점 방식으로 저장되는데, 근사값으로 저장되어
        // 0.1에 정확하지 않음.
    }
}
