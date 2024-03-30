package Praktikum.Jobsheet3.Student;

import java.util.Scanner;

public class MainSoal2and3 {
    public static void printAvgGPA(Student[] arr){
        double avgGpa = 0;
        for (int i = 0; i < arr.length; i++) {
            avgGpa += arr[i].gpa;
        }
        avgGpa /= arr.length;
        System.out.println("\nAverage Gpa: " + avgGpa);
    }

    public static void printMostGpa(Student[] arr){
        double mostGpa = 0;
        for (int i = 0; i < arr.length; i++) {
            if (mostGpa < arr[i].gpa)
                mostGpa = arr[i].gpa;
        }
        System.out.println("Most Gpa: " + mostGpa);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arrStudents = new Student[3];

        for (int i = 0; i < arrStudents.length; i++) {
            System.out.println("Enter Student data-" + (i + 1));
            System.out.print("Input name: ");
            String name = sc.nextLine();
            System.out.print("input nim: ");
            String nim = sc.nextLine();
            System.out.print("input gender: ");
            char gender = sc.nextLine().charAt(0);
            System.out.print("Input gpa: ");
            double gpa= sc.nextDouble();
            sc.nextLine();
            arrStudents[i] = new Student(name, nim, gender, gpa);
        }
        System.out.println();
        for (int i = 0; i < arrStudents.length; i++) {
            System.out.println("Enter Student data-" + (i + 1));
            arrStudents[i].printData();
        }

        System.out.println();
        printAvgGPA(arrStudents);
        printMostGpa(arrStudents);
        
        sc.close();
    }
}
