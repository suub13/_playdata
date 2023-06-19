package Library.exam02;

import java.util.Objects;

public class Member {
    public String id;

    public Member(String id){
        this.id = id;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Library.exam01.Member){
            Library.exam01.Member member = (Library.exam01.Member) obj;
            if(id.equals(member.id)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
