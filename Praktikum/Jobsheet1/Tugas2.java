
    import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=====================");
            System.out.println("         Menu        ");
            System.out.println("=====================");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.print("Pilih nomor menu: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    hitungKecepatan();
                    break;
                case 2:
                    hitungJarak();
                    break;
                case 3:
                    hitungWaktu();
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan masukkan nomor menu yang benar.");
            }

            System.out.print("Apakah Anda ingin menghitung lagi? (ya/tidak): ");
            String ulangi = scanner.next();
            if (!ulangi.equalsIgnoreCase("ya")) {
                break;
            }
        }

        scanner.close();
    }

    public static void hitungKecepatan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jarak (KM): ");
        double jarak = sc.nextDouble();
        System.out.print("Masukkan waktu (H): ");
        double waktu = sc.nextDouble();
        double kecepatan = jarak / waktu;
        System.out.println("Kecepatan adalah: " + kecepatan + " KM/H");
    }

    public static void hitungJarak() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kecepatan (KM/H): ");
        double kecepatan = sc.nextDouble();
        System.out.print("Masukkan waktu (H): ");
        double waktu = sc.nextDouble();
        double jarak = kecepatan * waktu;
        System.out.println("Jarak adalah: " + jarak + " kilometer");
    }

    public static void hitungWaktu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jarak (KM): ");
        double jarak = sc.nextDouble();
        System.out.print("Masukkan kecepatan (KM/H): ");
        double kecepatan = sc.nextDouble();
        double waktu = jarak / kecepatan;
        System.out.println("Waktu adalah: " + waktu + " jam");
    }
}
