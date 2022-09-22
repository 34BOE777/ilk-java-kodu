package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	System.out.println("iki basamaklı sayı gir");
    Scanner s = new Scanner(System.in);
    int a=s.nextInt();
        System.out.println((a/10)*(a/10)+(a%10)*(a%10));

    }
}
