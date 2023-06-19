package sec01.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        // parent.field2 = "data2"; // 불가능 new Child로 만들긴 하였지만 Parent 참조변수로 저장하였기 떄문에
        // parent.method3(); // 위와 같은 이유로 불가능

        Child child = (Child) parent; // Child 클래스로 casting하면 불러올 수 있음.
        child.field2 = "yyy";
        child.method3();

    }
}
