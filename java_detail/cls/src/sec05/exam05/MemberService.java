package sec05.exam05;

import java.util.Objects;

public class MemberService {
    String id;
    String password;
    boolean login(String id, String password){
        return id.equals("hong") & password.equals("12345");
    }
     void logout(String id){
        this.id = id;
        System.out.println("로그아웃 되었습니다.");
    }
}
