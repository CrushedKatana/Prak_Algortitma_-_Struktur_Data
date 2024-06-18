package Praktikum.Jobsheet12.Tugas.Tugas1;

import java.util.Scanner;

public class DLLMain07 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DLL07 pasien = new DLL07();

        int menu;
        do {
            System.out.println("===============================");
            System.out.println("   DAFTAR PENGANTRI VAKSIN ");
            System.out.println("===============================");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Penerima Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("===============================");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    System.out.print("Nama          : ");
                    String nama = sc.nextLine();
                    System.out.print("Nomor Antrian : ");
                    int no = sc.nextInt();
                    pasien.add(no, nama);
                    break;
                case 2:
                    pasien.remove();
                    break;
                case 3:
                    pasien.print();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("input yang dimasukkan salah");
                    break;
            }
        } while (menu != 4);
    }
}