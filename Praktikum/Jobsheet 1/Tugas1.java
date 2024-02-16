import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        System.out.println("Selamat Datang");
        String[] KODE = {"B", "D", "F", "H", "K", "L", "N", "P", "R", "T"};
        String[] KOTA = {"Bandung", "Depok", "Surabaya", "Jakarta", "Kediri", "Solo", "Malang", "Padang", "Semarang", "Tangerang"};
        int numPlates = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat mobil: ");
        String inputKode = scanner.nextLine().toUpperCase();

        String namaKota = cariNamaKota(inputKode, KODE, KOTA, numPlates);
        System.out.println("Kota: " + namaKota);
    }


    public static String cariNamaKota(String kode, String[] KODE, String[] KOTA, int numPlates) {
        for (int i = 0; i < numPlates; ++i) {
            if (kode.equals(KODE[i])) {
                return KOTA[i];
            }
        }
        return "Kota tidak ditemukan";
    }
}
