//Nama : Fadel Jordhy Bialy
//NIM  : 152410101144
package coba.ContohKode.kuis.algo;

import java.util.Scanner;

/**
 *
 * @author Mella
 */
public class KuisAlgo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte pilihan;
        int nilai, jumlah = 0;

        System.out.println("========================");
        System.out.println("Perimaan Angota Etalase");
        System.out.println("========================");
        System.out.println("Apakah Anda Ingi Memasukkan Nilai Anggota ? \n1.Ya 2.Tidak");
        System.out.print("Masukkan Pilihan Anda: ");
        pilihan = sc.nextByte();

        switch (pilihan) {
            case 1:
                do {
                    System.out.print("Masukkan Nilai Calon Anggota : ");
                    nilai = sc.nextInt();
                    if (nilai >= 75) {
                        jumlah++;
                    }
                    System.out.println("Apakah Anda Ingin Menginputkan Nilai Lagi? \n1.Ya 2.Tidak");
                    System.out.print("Masukkan Pilihan : ");
                    pilihan = sc.nextByte();
                } while (pilihan >= 1 && pilihan < 2);
                System.out.println("Jumlah Anggota Yang Lolos Sebanyak : " + jumlah);
                break;
            case 2:
                System.out.println("Terima Kasih Telah Mengikuti Acara Etalase");
                break;

            default:
                System.out.println("Pilihan Tidak Tersedia \nSilahkan Pilih Pilihan Yang Sudah Ada");
        }

    }
}
