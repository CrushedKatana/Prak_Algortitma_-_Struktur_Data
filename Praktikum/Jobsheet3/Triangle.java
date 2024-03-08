package Praktikum.Jobsheet3;

public class Triangle {
    public int  base,  height;

    public Triangle (int b, int h){
        base = b; 
        height = h;
    }
    public double countArea() {
        return 0.5 * base*height;
    }
    public int countPerimeter(){
        return (base*base)+(height*height);
    }
}
