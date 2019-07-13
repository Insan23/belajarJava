package coba.ContohKode.htc_java_kuis2;

import java.util.*;

public class Htc_JAVA_KUIS2 {

//    String dataPen[][];
//    int indeks;
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int pil = 0, urut, kilo, indeks = 0;
        String noktp;
        String nama;
        System.out.println("============================\n   Program data penduduk\n============================\n");
        System.out.print("Masukkan jumlah penduduk : ");
        int jml = a.nextInt();
        String dataPen[][] = new String[jml][4];

        do {
            System.out.println("Selamat Datang\nSilahkan Pilih Menu Anda");
            System.out.println("1. Input Data\n2. Lihat Nomor Urut\n3. Cetak Seluruh Data\n4. Hapus Data\n5. Urutkan Data\n6. Keluar");
            System.out.print("Pilihan : ");
            pil = a.nextInt();
            while (pil < 1 || pil > 6) {
                System.out.println("Pilihan Tidak Tersedia");
                System.out.println("Masukkan pilihan kembali : ");
                pil = a.nextInt();
            }
            switch (pil) {
                case 1:
                    
                    indeks++;
                    break;
                case 2:
                    System.out.print("Untuk melihat no urut anda, masukkan nomor KTP\nNomor KTP : ");
                    noktp = a.next();
                    break;
                case 3:
                    System.out.println("Data saat ini :");
                    break;
                case 4:
                    System.out.print("Untuk Menghapus data, masukkan nomor KTP\nNomor KTP : ");
                    noktp = a.next();
                    break;
                case 5:
                    System.out.println("Data Telah Diurutkan");
                    break;
                case 6:
                    System.out.println("Terima Kasih :D");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (pil != 6);
    }

    public static String[][] inputData(String data[][], int indeks) {
        Scanner a = new Scanner(System.in);
        System.out.print("Masukkan Nomor Ktp : ");
        data[indeks][0] = a.next();
        System.out.print("Masukkan nama : ");
        data[indeks][1] = a.nextLine();
        System.out.print("Masukkan no urut pengambilan : ");
        data[indeks][2] = a.next();
        System.out.print("Masukkan jumlah kilo beras");
        data[indeks][3] = a.next();
        return data;
    }
    
    public static void lihatUrut(int ktp) {

    }

    public static void print() {

    }

    public static void hapusData(int ktp) {

    }

    public static void urutData() {

    }
}
