package sec01.exam04;

public class MyClass {
    RemoteControl rc = new Television();

    public MyClass(){
    }

    public MyClass(RemoteControl rc){
        this.rc = rc;
        rc.turnOn();
        rc.setVolume(5);
    }

    void methodA(){
        RemoteControl rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
    }

    void methodB(RemoteControl rc){
        rc.turnOn();
        rc.setVolume(5);
    }

}
