package Praktikum.Jobsheet12.Tugas.Tugas2;

public class Film07 {
    int id;
    float rating;
    String judul;
    Film07 prev, next;

    Film07(Film07 prev, int id, String judul, float rating, Film07 next){
        this.prev = prev;
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = next;
    }
}