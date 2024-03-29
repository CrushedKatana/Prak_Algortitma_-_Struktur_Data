package Praktikum.Jobsheet3.SpatialShape;

public class SquarePyramid {
    int base, height;

    public SquarePyramid(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public void printArea() {
        System.out.println("Luas Limas Segi-4: " + ((base * base) + (4 * (0.5 * base * height))));
    }

    public void printVolume() {
        System.out.println("Volume Limas Segi-4: " + ((base * base) * height / 3));
    }
}
