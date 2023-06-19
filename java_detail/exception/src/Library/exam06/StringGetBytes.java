package Library.exam06;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class StringGetBytes {
    public static void main(String[] args) {

        String str = "안녕하세요";
        byte[] bytes = str.getBytes();
        System.out.println("bytes.length: "+bytes.length);
        String str1 = new String(bytes);
        System.out.println("bytes->String: "+str1);
        try {
            byte[]bytes1 = str.getBytes("EUC-KR");
            System.out.println("bytes.length: "+bytes1.length);
            String str2 = new String(bytes1, "EUC-KR");
            System.out.println("bytes->String: "+str2);
//            System.out.println(bytes1.toString());

            byte[]bytes2 = str.getBytes(StandardCharsets.UTF_8);
            System.out.println("bytes.length: "+bytes2.length);
            String str3 = new String(bytes, "UTF-8");
            System.out.println("bytes->String: "+str3);
        }
        catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
    }
}
