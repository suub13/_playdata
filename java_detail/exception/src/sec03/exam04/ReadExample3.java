package sec03.exam04;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample3 {
    public static void main(String[] args) throws Exception{
        Reader reader = new FileReader("C:/Temp/test9.txt");

        char[]buffer = new char[5];

        while(true){
            int readCharNum = reader.read(buffer, 2, 3);
            if(readCharNum == -1)break;
            for(char i:buffer)System.out.println(i);
        }
    }
}
