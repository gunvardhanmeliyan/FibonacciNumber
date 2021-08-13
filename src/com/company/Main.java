package com.company;
import java.util.Scanner;

public class Main {
    static int fibonacci(int n){
        if (n==1)
            return 0;
        else if (n==2)
            return 1;
        return (fibonacci(n-1)+fibonacci(n-2));
    }

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to print the Fibonacci Number: ");
        int n=sc.nextInt();
        System.out.println(fibonacci(n));
    }
}
