package Praktikum.Jobsheet3.SpatialShape;

import java.util.Scanner;

public class SpatialShapeNo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SpatialShape[] spatialShape = new SpatialShape[3];

        for (int i = 0; i < spatialShape.length; i++) {
            if (i == 0) {
                System.out.println("Cone");
                System.out.print("Insert radius: ");
                int radius = sc.nextInt();
                System.out.print("Insert the hypotenuse: ");
                int hypotenuse = sc.nextInt();
                spatialShape[i] = new Cone(radius, hypotenuse);
            }
            if (i == 1) {
                System.out.println("Square Pyramid");
                System.out.print("Enter the length of the base");
                int radius = sc.nextInt();
                System.out.print("Masukkan tinggi: ");
                int height = sc.nextInt();
                spatialShape[i] = new SquarePyramid(radius, height);
            }
            if (i == 2) {
                System.out.println("Ball");
                System.out.print("Insert radius: ");
                int jari = sc.nextInt();
                spatialShape[i] = new Ball(i);
            }
            spatialShape[i].printArea();
            spatialShape[i].printVolume();
            System.out.println();
        }
    }
}
