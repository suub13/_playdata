package Library.exam02;

import Library.exam01.Member;

public class MemberExample {
    public static void main(String[] args) {
        Library.exam01.Member blue1 = new Library.exam01.Member("blue");
        Library.exam01.Member blue2 = new Library.exam01.Member("blue");
        Library.exam01.Member red = new Member("red");

        if(blue1.equals(blue2)){
            System.out.println("blue1과 blue2는 동등합니다.");
        } else{
            System.out.println("blue1과 blue2는 동등하지 않습니다.");
        }

        if(blue1.equals(red)){
            System.out.println("obj1과 red은 동등합니다.");
        } else {
            System.out.println("obj1과 red은 동등하지 않습니다.");
        }
    }
}
