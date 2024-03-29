package Praktikum.Jobsheet6.BubbleSelectionInsertion;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        
        StudentList data = new StudentList();
        int n = 5;

        for (int i=0; i<n ; i++){
            System.out.print("Name = ");
            String name = s2.nextLine();
            System.out.print("Enterance year = ");
            int year = s1.nextInt();
            System.out.print("Age = ");
            int age = s1.nextInt();
            System.out.print("GPA = ");
            double gpa = s1.nextDouble();

            Student s = new Student(name, year, age, gpa);
            data.add(s);
        }
        System.out.println("Unsorted student list : ");
        data.print();

        System.out.println("Student data after sorting desc based on ipk = ");
        data.bubleSort();
        data.print();
    }
}
