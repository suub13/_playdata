package sec05.exam03;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws Exception{
        File dir = new File("C:/Temp/images");
        File file1 = new File("C:/Temp/file1.txt");
        File file2 = new File("C:/Temp/file2.txt");
        File file3 = new File("C:/Temp/file3.txt");

        if(!dir.exists()){dir.mkdirs();}
        if(!file1.exists()){file1.createNewFile();}
        if(!file2.exists()){file2.createNewFile();}
        if(!file3.exists()){file3.createNewFile();}

        File temp = new File("C:/Temp");
        File[] contents = temp.listFiles();

        System.out.println("시간\t\t\t\t\t\t형태\t\t크기\t이름");
        System.out.println("----------------------------------------------");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
        for(File file: contents){
            System.out.print(sdf.format(new Date(file.lastModified())));
            if(file.isDirectory()){
                System.out.println("\t<DIR>\t\t"+file.getName());
            } else{
                System.out.println("\t\t\t"+file.length()+"\t"+file.getName());
            }
        }


    }
}
