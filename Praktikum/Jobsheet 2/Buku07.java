public class Buku07 {
    String judul, pengarang;
    int halaman, stok, harga;

   Buku07 (){
        
    }

    Buku07 (String jd, String pg, int hal, int st, int hr){
        judul = jd;
        pengarang = pg;
        halaman = hal;
        stok = st; 
        harga = hr;
    }
    Buku07 (String jd, String pg){
        judul = jd;
        pengarang = pg;
    }
    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga Rp: " + harga);
    }

    void terjual(int jml) {
        stok -=jml;
    }
    void restock(int jml) {
        stok += jml;
    }
    void gantiHarga (int hrg){
        harga = hrg;
    }
}

