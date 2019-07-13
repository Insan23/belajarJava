//152410101129
package coba.ContohKode.seleksi.balwana;

import java.util.Scanner;

public class SeleksiBalwana {

    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        byte pilihan;
        Long tinggi;
        int jumlah = 0;

        System.out.println("Apakah Anda Ingin Memasukkan Data?\n1. Ya\n2. Tidak");
        System.out.print("Masukkan Pilihan : ");
        pilihan = w.nextByte();

        switch (pilihan) {
            case 1:
                do {
                    System.out.print("Masukkan Tinggi Rapling Yang Dicapai : ");
                    tinggi = w.nextLong();
                    if (tinggi >= 7) {
                        jumlah++;
                    }
                    System.out.println("Apakah Anda Ingin Memasukkan Data Lagi?\n1. Ya\n2. Tidak");
                    System.out.print("Masukkan Pilihan : ");
                    pilihan = w.nextByte();
                } while (pilihan>=1 && pilihan <2);
                System.out.println("Jumlah Anggota Yang Lolos Seleksi Adalah " + jumlah);
                break;
            case 2:
                System.out.println("Terima Kasih");
                break;
            default:
                System.out.println("Pilihan Tidak Tersedia!!!");
        }
    }

}
