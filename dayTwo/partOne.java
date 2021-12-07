package com.company;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("src/com/company/data.dat"));
        int x = 0, y= 0;
        String[] words;
        while(s.hasNextLine()){
            words = s.nextLine().split(" ");
            switch (words[0]){
                case "forward":
                    x+=Integer.parseInt(words[1]);
                    break;
                case "up":
                    y-=Integer.parseInt(words[1]);
                    break;
                case "down":
                    y+=Integer.parseInt(words[1]);
                    break;
                default:
                    System.out.println("COULD NOT PARSE");
            }
            System.out.println("x: " + x + ", y: " + y + ", Total: " + x*y);
        }
    }
}