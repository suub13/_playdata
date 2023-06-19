package sec02.exam02;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous annoy = new Anonymous();
        annoy.field.turnOn();
        annoy.method1();
        annoy.method2(
            new RemoteControl() {
                @Override
                public void turnOn() {
                    System.out.println("SmartTV를 켭니다");
                }

                @Override
                public void turnOff() {
                    System.out.println("SmartTV를 끕니다.");
                }
            }
        );
    }
}
