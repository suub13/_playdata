package sec01.exam05;

public class PhoneExample {
    public static void main(String[] args) {
//        Phone phone = new Phone(); //phone class는 abstract로 선언되었기 때문에 객체를 생성할 수 없습니다.

        SmartPhone smartPhone = new SmartPhone("홍길동");
        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
