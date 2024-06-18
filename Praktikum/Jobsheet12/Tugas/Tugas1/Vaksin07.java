package Praktikum.Jobsheet12.Tugas.Tugas1;

public class Vaksin07 {
    String nama;
    int no;
    Vaksin07 next, prev;

    public Vaksin07( Vaksin07 prev, String nama, int no, Vaksin07 next){
        this.nama = nama;
        this.no = no;
        this. next = next;
        this.prev = prev;
    }
}