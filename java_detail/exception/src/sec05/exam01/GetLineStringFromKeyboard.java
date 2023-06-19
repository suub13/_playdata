package sec05.exam01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class GetLineStringFromKeyboard {
    public static void main(String[] args) throws Exception{
        InputStream is = System.in;
        Reader reader = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(reader);

        while (true) {
            System.out.print("입력하세요: ");
            String line = br.readLine();
            if(line.equals("q") || line.equals("quit")) break;
            System.out.print("입력된내용: "+line);
            System.out.println();
        }
        br.close();
    }
}