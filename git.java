package com.timbuchalka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input=new Scanner(System.in);
        int num1;
        int num2, result;
        double result2;
        System.out.println("Enter the first number:");
        num1=input.nextInt();
        System.out.println("Enter the 2nd Number:");
        num2=input.nextInt();

        result = num1+num2;
        System.out.println("sum is=" +result);


        result = num1-num2;
        System.out.println("Sub is=" +result);
        result = num1 * num2;
        System.out.println("Multi is=" +result);
        result2 =(float) num1 /num2;
        System.out.println("Div is=" +result2);
        result = num1%num2;
        System.out.println("Rim is=" +result);
         num1+=num2;
        System.out.println("sum="+num1);
        num1-=num2;

        System.out.println("sum="+num1);
        num1*=num2;
        System.out.println("sum="+num1);
        num1/=num2;
        System.out.println("sum="+num1);
        num1%=num2;
        System.out.println("sum="+num1);

    }
}
