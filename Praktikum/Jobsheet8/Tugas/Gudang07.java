package Praktikum.Jobsheet8.Tugas;


public class Gudang07 {
    Barang07[] tumpukan;
    int size;
    int top;

    public Gudang07(int size) {
        this.size = size;
        tumpukan = new Barang07[size];
        top = -1;
    }

    public Barang07 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang07 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void printBarang(int index) {
        System.out.println("Index: " + index + ", Nama Barang: " + tumpukan[index].nama);
    }

    public void cariBarang(String cari) {
        if (cekKosong()) {
            System.out.println("Tumpukan barang kosong");
            return;
        }

        int i = findByKodeNama(cari);
        if (i > -1) {
            printBarang(i);
        } else {
            System.out.println("Barang " + cari + " tidak ditemukan");
        }

    }

    private int findByKodeNama(String cari) {
        int cariKode = -1;
        if (cari.matches("[0-9]+")) {
            cariKode = Integer.parseInt(cari);
        }

        for (int i = 0; i <= top; i++) {
            if (tumpukan[i].kode == cariKode) {
                System.out.println("[Barang ditemukan berdasarkan kode]");
                return i;
            }
            if (tumpukan[i].nama.equals(cari)) {
                System.out.println("[Barang ditemukan berdasarkan nama]");
                return i;
            }
        }

        return -1;
    }

    public String konversiDesimalKeBiner(int kode) {
        StackKonversi07 stack = new StackKonversi07();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang07 barang) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = barang;
            System.out.println("Barang " + barang.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang07 ambilBarang() {
        if (!cekKosong()) {
            Barang07 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang.");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang07 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang07 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            for (int i = top; i >= 0; i--) {
                // for (int i = 0; i <= top; i++) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }
}