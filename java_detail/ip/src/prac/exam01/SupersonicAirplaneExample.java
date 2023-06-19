package prac.exam01;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        Airplane sa = new SuperSonicAirplane();
        sa.takeOff();
        sa.fly();
//        sa.flyMode = SuperSonicAirplane.SUPERSONIC;
//        sa.fly();
//        sa.flyMode = SuperSonicAirplane.NORMAL;
//        sa.fly();
        sa.land();

    }
}
