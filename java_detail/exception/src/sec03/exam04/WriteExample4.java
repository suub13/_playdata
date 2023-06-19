package sec03.exam04;

import java.io.Writer;
import java.io.FileWriter;

public class WriteExample4 {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("C:/Temp/test10.txt");

        String str = "ABC";

        writer.write(str);
        writer.flush();
        writer.close();
    }
}
