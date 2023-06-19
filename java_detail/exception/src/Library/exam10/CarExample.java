package Library.exam10;

public class CarExample {
    public static void main(String[] args) {
        Class clazz = Car.class;

        String photo1Patch  = clazz.getResource("photo1.jpg").getPath();
        String photo2Patch = clazz.getResource("images/photo2.jpg").getPath();

        System.out.println(photo1Patch);
        System.out.println(photo2Patch);
    }
}
