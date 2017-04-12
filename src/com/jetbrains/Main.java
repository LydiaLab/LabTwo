package com.jetbrains;

import java.util.Scanner;

// LabTwo. GC Java BootCamp == Lydia Latocki

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter an integer between 1 and 100.");
        int input = scnr.nextInt();


        if(input >=1 && input <=100) { // check if 1-100

            if (input % 2 == 0) { // check if number is even

                if ((input >= 2) == (input <= 25)) {
                    System.out.println("Even and less than 25.");//even 2-25
                } else if ((input >= 26) == (input <= 60)) {
                    System.out.println("Even.");// even 26-60
                } else if(input > 60){
                    System.out.println(input + " Even.");//even <60
                }
            } else {// then it is odd

                if (input <= 60) {
                    System.out.println(input + " Odd.");// odd numbers lower that 60
                }
                else if (input > 60){
                    System.out.println(input + " Odd and over 60.");// odd<60
                }
            }
        }
        else if(input <= 0){
            System.out.println("You did not follow directions.");//all numbers that are 0 or over 100
        }
        else if(input > 101){ // number is zero or over 100
            System.out.println("You did not follow directions.");//all numbers that are 0 or over 100
            }
    }
}
