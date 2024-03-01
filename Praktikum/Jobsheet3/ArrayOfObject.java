package Praktikum.Jobsheet3;
import java.util.Scanner;

public class ArrayOfObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input how many Rectangle array: ");
        Rectangle[] rectangleArray = new Rectangle[sc.nextInt()];

        for (int i = 0;  i<rectangleArray.length; i++){
            rectangleArray[i] = new Rectangle();
            System.out.println("Rectangle : "+i);

            System.out.println("Input lenght : ");
            rectangleArray[i].length = sc.nextInt();

            System.out.println("Input width : ");
        }

        for (int i = 0; i < rectangleArray.length; i++) {
            System.out.println("Rectangle -" + i);
            System.out.println("lenght: " + rectangleArray[i].width + ", Lebar: " +rectangleArray[i].length);
        }    
    }
}
