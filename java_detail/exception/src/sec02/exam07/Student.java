package sec02.exam07;

public class Student {
    public int sno;
    public String name;

    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    public boolean equals(Object obj){
        if(obj instanceof Student student){
            return (sno == student.sno) && (name.equals(student.name));
        } else{
            return false;
        }
    }

    public int hashCode(){
        return sno + name.hashCode();
    }
}
