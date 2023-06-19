package sec02.exam04;

import sec02.exam03.Vehicle;

public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("버스");
    }
    public void checkFare(){
        System.out.println("버스 승차요금 확인");
    }
}
