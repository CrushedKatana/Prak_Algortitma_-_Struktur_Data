package Praktikum.Jobsheet6.BubbleSelectionInsertion;

public class Student {
    String name;
    int entraceYear, age;
    double gpa;

    Student (String n, int y, int a, double g){
        name = n;
        entraceYear = y;
        age = a;
        gpa = g;
    }
    void print () {
        System.out.println("Name = "+ name);
        System.out.println("Enterance Year = "+ entraceYear);
        System.out.println("Age = "+age);
        System.out.println("GPA= "+gpa);
    
    }
}
