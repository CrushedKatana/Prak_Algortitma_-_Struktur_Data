

public class BukuMain07 {
    public static void main(String[] args) {
        Buku07 bk1 = new Buku07();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Dananda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku07 bk2 =  new Buku07("Arifureta Vol.1", "Ryo Shirakome", 420, 100, 275000);
        bk2.terjual(25);
        bk2.tampilInformasi();
    } 
}