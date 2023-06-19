package sec05.exam02;

public class FieldInitValueExample {
    public static void main(String[] args) {
        FieldInitValue fiv = new FieldInitValue();

        System.out.println("byteField: " + fiv.byteField);
        System.out.println("shortField: "+fiv.shortField);
        System.out.println("intField: " + fiv.intField);
        System.out.println("longField: " + fiv.longField);
        System.out.println("booleanField: " + fiv.booleanField);
        System.out.println("charField: " + fiv.charField);
        System.out.println("floatField: " + fiv.floatField);
        System.out.println("doubleField: " + fiv.doubleField);
        System.out.println("arrField: " + fiv.arrField);
        System.out.println("referenceField: " + fiv.referenceField);
        // 1. ooxo
        // 2.  public class Member{
        //     String name;
        //     String id;
        //     String password;
        //     int age;
        // 3. 1) new Member();
        // 2) member.name
        // 3) member.age

    }
}
