package com.collection;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        System.out.println("Result is "+add(num1,num2));
    }
    public static int add(int num1,int num2){
        return num1+num2;
    }
}
