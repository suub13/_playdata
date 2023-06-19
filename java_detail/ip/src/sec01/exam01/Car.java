package sec01.exam01;

public class Car {
    Tire frontLeftTire = new Tire("앞왼", 6);
    Tire frontRightTire = new Tire("앞오", 2);
    Tire backLeftTire = new Tire("뒤왼", 3);
    Tire backRightTire = new Tire("뒤오", 4);

    int run(){
        System.out.println("자동차가 달립니다.");
        if (frontLeftTire.roll() == false) {
            stop(); return 1;
        }
        if(frontRightTire.roll() == false) {
            stop(); return 2;
        }
        if(backLeftTire.roll() == false){
            stop(); return 3;
        }
        if(backRightTire.roll() == false){
            stop(); return 4;
        }
        return 0;
    }

    void stop(){
        System.out.println("차동차가 멈춥니다.");
    }
}
