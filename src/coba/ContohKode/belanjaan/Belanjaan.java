package coba.ContohKode.belanjaan;

import java.util.Scanner;

public class Belanjaan {

    public static void main(String[] args) {
        Scanner kas = new Scanner(System.in);
        byte pilihan;
        int total = 0, harga, jumlah, kembalian, pembayaran, uangKurang;

        System.out.println("Apa Anda Ingin Membeli Barang?\n1. Ya\n2. Tidak");
        System.out.print("Masukkan Pilihan : ");
        pilihan = kas.nextByte();
        switch (pilihan) {
            case 1:
                do {
                    System.out.print("\n\nMasukkan Harga Barang : Rp ");
                    harga = kas.nextInt();
                    System.out.print("Masukkan Jumlah Barang : ");
                    jumlah = kas.nextInt();
                    total += (harga * jumlah);
                    System.out.println("Apakah Anda Ingin Menambah Barang Lagi?\n1. Ya\n2. Tidak");
                    pilihan = kas.nextByte();
                } while (pilihan >= 1 && pilihan < 2);
                System.out.println("\nTotal Harga Belanjaan Anda Adalah : Rp " + total);
                System.out.print("Masukkan Uang Pembayaran : Rp ");
                pembayaran = kas.nextInt();
                if (pembayaran == total) {
                    System.out.println("\nTerima Kasih Telah Berbelanja");
                } else if (pembayaran > total) {
                    kembalian = pembayaran - total;
                    System.out.println("\nKembalian Anda Adalah : Rp " + kembalian + "\n\nTerima Kasih Telah Berbelanja");
                } else {
                    uangKurang = total - pembayaran;
                    System.out.println("\n\nUang Pembayaran Anda Kurang Rp " + uangKurang);
                    System.out.print("Silahkan Masukkan Uang Pembayaran : Rp ");
                    pembayaran = kas.nextInt();
                    System.out.println("\nTerima Kasih Telah Berbelanja");
                }
                break;
            case 2:
                System.out.println("Terima Kasih Telah Berkunjung :)");
                break;
            default:
                System.out.println("Pilihan Tidak Tersedia!!!!");
        }
    }

}
