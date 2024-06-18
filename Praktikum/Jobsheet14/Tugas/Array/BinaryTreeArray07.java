package Praktikum.Jobsheet14.Tugas.Array;

public class BinaryTreeArray07 {
    int[] data;
    int idxLast;

    public BinaryTreeArray07(){
        data = new int[10];
    }
    void populateData(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }
    void tranverseInOrder(int idxStart){
        if (idxStart <= idxLast) {
            tranverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            tranverseInOrder(2 * idxStart + 2);
        }
    }
}