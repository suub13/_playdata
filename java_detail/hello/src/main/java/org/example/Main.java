package org.example;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String [] args) throws FileNotFoundException, IOException {
        System.out.println("아규먼트1: " +args[0]);
        System.out.println("아규먼트2: "+args[1]);
        System.out.println("Hello World!");

        if (args.length == 0){
            System.out.println("실패");
        }
        FileReader freader  = new FileReader(args[0]);
        BufferedReader reader = new BufferedReader(freader);

        String msg;
        msg = reader.readLine();
        while (msg != null){
            System.out.println(msg);
            msg = reader.readLine();
        }
        reader.close();
        freader.close();

    }

}