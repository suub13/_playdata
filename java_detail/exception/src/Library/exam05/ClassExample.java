package Library.exam05;

public class ClassExample {
    public static void main(String[] args) throws Exception{
        Class clazz = Car.class;

        Class clazz2 = Class.forName("Library.exam05.Car");

//        Car car = new Car();
//        Class clazz = car.getClass();
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getPackage().getName());
        System.out.println(clazz2.getName());
        System.out.println(clazz2.getSimpleName());
        System.out.println(clazz2.getPackage().getName());
    }
}
