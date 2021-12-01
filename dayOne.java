package com.company;
import java.lang.*;
import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(new File("src/com/company/data.dat"));
        int[] mem = new int[2];
        mem[0] = s.nextInt();
        mem[1] = s.nextInt();
        int x = 0;
        if(mem[0] < mem[1]) x++;
        while (s.hasNextInt()){
            mem[0] = mem[1];
            mem[1] = s.nextInt();
            if(mem[0] < mem[1]){
                x++;
            }
            System.out.println("(" + mem[0] + ", " + mem[1] + ")" + ": " + x);
        }
    }
}
