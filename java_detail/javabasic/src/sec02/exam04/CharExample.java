package sec02.exam04;

public class CharExample {
    public static void main(String[] args) {
        // single apostrophe는 char을 나타내거나 16진수로 나타낼 떄 사용.
        char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041';

        char c4 = '가';
        char c5 = 44032;
        char c6 = '\uac00';

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);
        System.out.println("c4: " + c4);
        System.out.println("c5: " + c5);
        System.out.println("c6: " + c6);

    }
}
