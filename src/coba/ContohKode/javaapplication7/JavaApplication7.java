/*SOAL  ALGO PRAKTIKUM shift 1 (soalnya mirip-mirip :3 )
 pegawai suatu restoran mendapat tugas untuk menghitung BANYAKNYA PEMESANAN YANG MENDAPAT DISKON
 sebuah pesanan mendapat diskon bila harga lebih dari 10.000

 SETELAH DATA DIINPUT, KEMUDIAN DECETAK KEMBALI SELURUH DATA INPUTAN

 contoh output
 --------------------------
 Pembeli 1
 --------------------------
 Menu-1
 Nama Menu   : Kacang
 Jumlah      : 5
 Harga       : 500

 Menu-2
 Nama Menu   : Kwaci
 Jumlah      : 20
 Harga       : 1000

 Menu-3      : Kurma
 Jumlah      : 5
 Harga       : 1100
 -------------------------
 Pembeli 2
 -------------------------
 Menu-1
 Nama Menu   : Rawon
 Jumlah      : 2
 Harga       : 4500

 Menu-2
 Nama Menu   : Pecel
 Jumlah      : 3
 Harga       : 4000
 -------------------------
 Pemesanan Yang Mendapat Diskon : 3
 */
package coba.ContohKode.javaapplication7;

import java.util.Scanner;

public class JavaApplication7 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String nama[][];
        int harga[][], jumlah[][], diskon = 0, pembeli = 0, pesanan = 0, pesan = 0;
        System.out.print("Berapa jumlah pembeli\t\t\t: ");
        pembeli = a.nextInt();
        System.out.print("Berapa jumlah pemesanan maksimal\t: ");
        pesanan = a.nextInt();
        harga = new int[pembeli][pesanan];
        jumlah = new int[pembeli][pesanan];
        nama = new String[pembeli][pesanan];
        //fungsi input data
        for (int i = 0; i < pembeli; i++) {
            System.out.println("\n\n-----------------------------");
            System.out.println("Pembeli-" + (i + 1));
            System.out.println("-----------------------------");
            System.out.print("Jumlah pemesanan : ");
            pesan = a.nextInt();
            while (pesan > pesanan) {
                System.out.println("Melebihi batas pesanan maks");
                System.out.print("Jumlah pemesanan : ");
                pesan = a.nextInt();
            }
            for (int j = 0; j < pesan; j++) {
                System.out.println("\nMenu-" + (j + 1));
                System.out.print("Nama Menu\t\t: ");
                nama[i][j] = a.next();
                
                System.out.print("Jumlah pembelian\t: ");
                jumlah[i][j] = a.nextInt();
                System.out.print("Harga\t\t\t: ");
                harga[i][j] = a.nextInt();
                if ((harga[i][j] * jumlah[i][j]) > 10000) {
                    diskon++;
                }
            }
        }
        //fungsi cetak seluruh data
        for (int i = 0; i < pembeli; i++) {
        System.out.println("\n\n\n-----------------------------");
            System.out.println("\n\nPembeli " + (i + 1));
            System.out.println("-----------------------------");
            for (int j = 0; j < pesanan; j++) {
                if (nama[i][j] == null) {
                    continue;
                }
                System.out.println("Menu-" + (j + 1));
                System.out.println("Nama Menu\t: " + nama[i][j]);
                System.out.println("Jumlah\t\t: " + jumlah[i][j]);
                System.out.println("Harga\t\t: " + harga[i][j]);
            }
        }
        System.out.println("-----------------------------");
        System.out.println("Pemesanan Yang Mendapat Diskon : " + diskon);
    }

}
