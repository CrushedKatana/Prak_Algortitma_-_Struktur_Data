package Praktikum.Jobsheet3;

public class Blocks {
    public int width, lenght, height; 

    public Blocks(int p, int l, int t){
      lenght = p;
      width = l; 
      height =t;
    }
    public int countVolume(){
        return lenght*width*height;
    }
}
