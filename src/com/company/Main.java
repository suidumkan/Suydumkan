package com.company;

public class Main {

    public static void main(String[] args) {


        double [] diplomaPaper = { -31.2, 67.7, -89.7,-56.9,67.5,99.7,-34.3,22.1,37.4,-75.3,20.2,48.5,66.9, 86.2,19.5,21.7};

        for (double h = 0; h < diplomaPaper.length; h++) {

            System.out.println(diplomaPaper[(int) h]);
        }
        System.out.println("_______________________________________");

        for (double h = 0; h < diplomaPaper.length; h++) {
            if (diplomaPaper[(int) h] < 0) {
                continue;
            }
            System.out.println(diplomaPaper[(int) h]);
        }
        for (double resultOfArray : diplomaPaper); {
            System.out.println("resultOfArray" )   ;

        }








    }
}
