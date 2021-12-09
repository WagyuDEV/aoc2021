package com.company;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("src/com/company/data.dat"));
        int x = 0, y = 0, z = 0;
        String[] words;
        while(s.hasNextLine()){
            words = s.nextLine().split(" ");
            switch (words[0]){
                case "forward":
                    x+=Integer.parseInt(words[1]);
                    y+=z*Integer.parseInt(words[1]);
                    break;
                case "up":
                    z-=Integer.parseInt(words[1]);
                    break;
                case "down":
                    z+=Integer.parseInt(words[1]);
                    break;
                default:
                    System.out.println("COULD NOT PARSE");
            }
            System.out.println("x: " + x + ", aim: " + z + ", depth: " + y + ", total: " + x*y);
        }
    }
}
