package Praktikum.Jobsheet3.SpatialShape;

public class Cone {
    int radius, hypotenuse;

    public Cone(int radius, int hypotenuse) {
        this.radius = radius;
        this.hypotenuse = hypotenuse;
    }

    public void printArea() {
        System.out.println("Luas Kerucut: " + (Math.PI * radius * (radius + hypotenuse)));
    }

    public void printVolume() {
        double height = Math.sqrt((hypotenuse * hypotenuse) - (radius * radius));
        System.out.println("Volume Kerucut: " + (Math.PI * radius * radius * height / 3));
    }
}
