package com.example.project;
import java.util.Random;
import java.util.Scanner;

public class Day1 {
    private static String[] elf_names = {"Glitter", "Chocolate", "Tiny", "Snowflake", "Frosty"};

    public static String generateElfName(String name) {
        if (name == null || name == "") {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        int nameIndex = (int) (Math.random() * elf_names.length);
        return elf_names[nameIndex] + " " + name;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the name:");
        String name = scan.nextLine();
        System.out.println(Day1.generateElfName(name));
        scan.close();
    }
}
