package com.company;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("src/com/company/data.dat"));
        int x = s.nextInt(), y = s.nextInt(), z = s.nextInt(), i = 0;
        while(s.hasNextInt()) if(x+y+z < ((x=y)+(y=z)+(z=s.nextInt()))) System.out.println(++i);
    }
}
