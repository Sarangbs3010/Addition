package com.company;

import java.util.Scanner;

public class ADD {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first number:");
        a=in.nextInt();
        System.out.println("Enter the first number:");
        b=in.nextInt();
        System.out.printf("The Answer is %d\n",a+b);
    }
}
