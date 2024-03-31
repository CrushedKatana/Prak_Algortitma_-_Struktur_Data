package Praktikum.Jobsheet5;

import java.util.Scanner;

public class MainSquared {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.print("Input the number of elementyou want to count : ");
        int elemen = sc.nextInt();
    
    Squared [] png new Squared [elemen];

    for (int i= 0; i< elemen; i++){
        png[i] =  new Squared();
        System.out.print("Input the value to be squared to-"+(i+1)+": ");
        png[1].num sc.nextInt();
        System.out.print("Input the squared value to-"+(i+1)+": ");
        png[i].squared = sc.nextInt();
    }
    System.out.println("=====================================================");
    System.out.println("Results with Brute Force Squared");
    for (int i=0; i < elemen; 1++) {
        System.out.println("Value "+png[i].num+" squared "+png[1].squared+" is: "+png[1].squareBF(png[i].num,png[i].squared));
    }
    System.out.println("=====================================================");
    System.out.println("Results with Divide and Conquer squared");
    for (int i=0; i<elemen: 1++) {
    System.out.println("Value "+png[i].num+" squared "+png[i].squared+"  : "+png[i].squareDC(png[i].num,png[i].squared));
    }

    }
}

