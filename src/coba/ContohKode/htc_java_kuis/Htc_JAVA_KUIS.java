//Mochammad Zufarulhaq Aleq Insan
//152410101129

package coba.ContohKode.htc_java_kuis;

import java.util.*;

public class Htc_JAVA_KUIS {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        data pend = new data();
        int pil = 0, urut, kilo;
        String noktp;
        String nama;
        System.out.println("============================\n   Program data penduduk\n============================\n");
        System.out.print("Masukkan jumlah penduduk : ");
        int jml = a.nextInt();
        pend.dataPen(jml);

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
                    System.out.print("Masukkan Nomor Ktp : ");
                    noktp = a.next();
                    System.out.print("Masukkan nama : ");
                    nama = a.next();
                    System.out.print("Masukkan no urut pengambilan : ");
                    urut = a.nextInt();
                    System.out.print("Masukkan jumlah kilo beras");
                    kilo = a.nextInt();
                    pend.enqueue(nama, noktp, kilo, urut);
                    break;
                case 2:
                    System.out.print("Untuk melihat no urut anda, masukkan nomor KTP\nNomor KTP : ");
                    noktp = a.next();
                    pend.getUrut(noktp);
                    break;
                case 3:
                    System.out.println("Data saat ini :");
                    pend.print();
                    break;
                case 4:
                    System.out.print("Untuk Menghapus data, masukkan nomor KTP\nNomor KTP : ");
                    noktp = a.next();
                    pend.hapusData(noktp);
                    break;
                case 5:
                    pend.urutData();
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

}
