
public class Buku07 {
    String judul, pengarang;
    int halaman, stok, harga;
    float diskon, hargaTotal, bayar;

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

    void terjual (int jml) {
        if (stok > 0) {
            stok -= jml;
            
        } if (stok <= 0) {
            System.out.println("Stok Kosong");
        }
    }

    void  restock (int jml) {
        stok += jml;
    }

    void gantiHarga (int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal(int jml) {
        hargaTotal = harga * jml;
        return(int) hargaTotal;
    }
    
    int hitungDiskon() {
        if (hargaTotal > 150000) {
            diskon = hargaTotal * 0.12f;
            System.out.println("Diskon : Rp. " + diskon);
        } else if (hargaTotal >= 75000) {
            diskon = hargaTotal * 0.05f;
            System.out.println("Diskon : Rp. " + diskon);
        } else {
            diskon = 0;
            System.out.println("Diskon : Rp. " + diskon);
        }
        return(int) diskon;
    }

    int hitungHargaBayar() {
        bayar = hargaTotal - diskon;
        System.out.println("Harga Bayar : Rp. " + bayar);
        return(int) bayar;
    }
}

