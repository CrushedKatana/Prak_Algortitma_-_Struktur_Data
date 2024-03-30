package Praktikum.Jobsheet3.Student;

public class Student {
    String name, nim;
    char gender;
    double gpa;

    public Student(String name, String nim, char gender, double gpa){
        this.name = name;
        this.nim = nim;
        this.gender = gender;
        this.gpa= gpa;
    }

    public void printData(){
        System.out.println("name: " + name);
        System.out.println("nim: " + nim);
        System.out.println("Gender: " + gender);
        System.out.println("GPA score: " + gpa);
    }
}
