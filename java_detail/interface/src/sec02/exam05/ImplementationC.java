package sec02.exam05;

public class ImplementationC implements InterfaceC{
    @Override
    public void methodA() {
        System.out.println("Implementation-methodA() 실행");
    }

    @Override
    public void methodB() {
        System.out.println("Implementation-methodB() 실행");
    }

    @Override
    public void methodC() {
        System.out.println("Implementation-methodC() 실행");
    }
}
