package com.example.project;

import java.util.Scanner;

public class runner {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Input the name");
            String name = scan.nextLine();
            System.out.println(Day1.generateElfName(name));
            scan.close();
    }
}
