package com.example.project;


public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method
        String[] niceList = new String[names.length]; //make two lists at first, then combine them into one list
        String[] naughtyList = new String[names.length];

        int numinNiceList = 0;
        int numinNaughtyList = 0;
       
        int random = (int)(Math.random() * 2); //randomly assign 0 or 1 for nice or naughty
        for (int i = 0; i < names.length;i++) {
            random = (int)(Math.random() * 2);
            if (random == 1) {
                niceList[numinNiceList] = names[i];
                numinNiceList++;
            } else {
                naughtyList[numinNaughtyList] = names[i];
                numinNaughtyList++;
            }
            random = (int)(Math.random() * 2);
        }

        String[][] fullList = new String[2][names.length];

        for (int i = 0; i < numinNiceList;i++) {//copies the nice list to the final list
            fullList[0][i] = niceList[i];
        }

        for (int i = 0; i < numinNaughtyList;i++) {//copies the naughy list to the final list
            fullList[1][i] = naughtyList[i];
        }


        return fullList;
    }

    public static void main(String[] args) {
        String[] test = {"test1","test2","test3","test4","test5","test6"};
        String[][] result = nameSort(test);
        for (int i = 0; i < result.length; i++){
            System.out.println(result[0][i]);
          }
        System.out.println("");
        for (int i = 0; i < result.length; i++){
            System.out.println(result[1][i]);
        }
    }
}




