import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        String[] Kode = {"A", "B", "C", "D", "E", "G", "H", "L", "N", "T"};
        String[] Kota = {"Banten", "Jakarta", "Bandung", "Cirebon", "Bogor", "Pekalongan", "Semarang", "Surabaya",  "Malang", "Tegal"};
        int numPlates = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat mobil: ");
        String inputKode = scanner.nextLine();

        String namaKota = cariNamaKota(inputKode, Kode, Kota, numPlates);
        System.out.println("Kota: " + namaKota);
    }

    
    public static String cariNamaKota(String kode, String[] Kode, String[] Kota, int numPlates) {
        for (int i = 0; i < numPlates; ++i) {
            if (kode.equals(Kode[i])) {
                return Kota[i];
            }
        }
        return "Kota tidak ditemukan";
    }
}