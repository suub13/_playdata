package sec05.exam04;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car(){
    }
    Car(String model){
        this(model, "은색", 250);
    }
    Car(String model, String color){
        this(model, color, 250);
    }

    Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    //1. xooo
    //2.
//    public class Member{
//        String name;
//        String id;
//        Member(String name, String id){
//            this.name = name;
//            this.id = id;
//        }
//    }
//    3.
//    this(title, content, "로그인한 회원아이디", "현재 컴퓨터 날짜", 0);
//    this(title, content, writer, "현재 컴퓨터 날짜", 0);
//    this(title, content, writer, date, 0);
    //4.
//    Board board1 = new Board(String title, String content);
//    Board board2 = new Board(String title, String content, String writer);
//    Board board3 = new Board(String title, String content, String writer, String data);
//    Board board4 = new Board(String title, String content, String writer, String data, int hitcount);

}
