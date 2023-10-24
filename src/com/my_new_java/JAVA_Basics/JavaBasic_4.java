package com.my_new_java.JAVA_Basics;

import java.util.Scanner;

public class JavaBasic_4 {
    /* Write a function to print your name and call the function from main method */

    public static  void getName (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String str = sc.nextLine();

        System.out.println("Your name  ::  "+str);
    }
    public static void main(String[] args) {
        getName();

    }
}
