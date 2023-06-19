package sec04.prad;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
    public static void main(String[] args) throws Exception{
        String filePath = "C:/codes/java/exception/src/sec04/prad/AddLineNumberExample.java";
        FileReader reader = new FileReader(filePath);
        BufferedReader br = new BufferedReader(reader);
        int page = 1;
        while(true){
            String data = br.readLine();
            if(data==null)break;
            System.out.println(page++ + ": "+data);
        }
        br.close();
    }
}
