package com.my_new_java.JAVA_Basics;

public class JavaBasic_3 {
    /* Define the local and Global variables with the same name and print both variables and
        understand the scope of the variables*/
    public static void  getNumber(){
        int global=20;
        System.out.println("local variables ::"+global);
    }
    public static void main(String[] args) {
        int global= 10;
        getNumber();
        System.out.println("Global variables ::"+global);


    }
}
