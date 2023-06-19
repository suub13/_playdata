package sec04.exam03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("C:/codes/java/exception/out/production/exception/primitive.db");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF("홍길동");
        dos.writeDouble(95.5);
        dos.writeInt(1);

        dos.writeUTF("감자바");
        dos.writeDouble(90.3);
        dos.writeInt(2);

        dos.flush();
        dos.close();

        FileInputStream fis = new FileInputStream("C:/codes/java/exception/out/production/exception/primitive.db");
        DataInputStream dis = new DataInputStream(fis);

        for(int i=0; i<2;i++){
            String name = dis.readUTF();
            double score = dis.readDouble();
            int order = dis.readInt();
            System.out.println(name + ": "+score+": "+order);
        }
        dis.close();
    }
}
