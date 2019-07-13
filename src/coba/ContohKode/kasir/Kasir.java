/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.ContohKode.kasir;

import java.util.Scanner;
public class Kasir {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kas = new Scanner(System.in);
        int harga, bayar, kembalian, kurangan, total, total2, total3, totalTambah;
        byte jumlah, jumlah2;
        
        System.out.println("=======================Program Kasir=======================");
        System.out.print("Masukkan jumlah barang yang dibeli = ");
        jumlah = kas.nextByte();
        System.out.print("Masukkan harga barang = ");
        harga = kas.nextInt();
        total = jumlah * harga;
        if (total>=500000) {
            System.out.println("Total belanjaan anda adalah = "+total+"\nAnda mendapatkan diskon sebesar 10%");
            System.out.println("\tAnda bisa menambah jumlah barang belanjaan, untuk mendapatkan diskon tambahan sebesar 2,5%\nBila tidak menambah barang, isilah nol");
            System.out.print("Jumlah barang tambahan = ");
            jumlah2 = kas.nextByte();
            total3 = jumlah2 * harga;
            totalTambah = (int) (jumlah2 -(jumlah2*0.025));
            total2 = (int) ((total -(total*0.1))+totalTambah);
            System.out.println("Biaya pembayaran anda adalah = "+total2);
            System.out.print("Masukkan uang pembayaran anda = ");
            bayar = kas.nextInt();
            if (bayar==total2) {
                System.out.println("Terima Kasih");
            } else if (bayar>total2) {
                kembalian = bayar - total2;
                System.out.println("Uang kembalian anda adalah = "+kembalian);
            } else {
                kurangan = total2 - bayar;
                System.out.println("Uang anda kurang sejumlah = "+kurangan);
            }
        } else if (total>200000 && total <500000) {
            System.out.println("Total belanjaan anda adalah = "+total+"\nAnda mendapatkan diskon sebessar 7,5%");
            System.out.println("\tAnda bisa menambah jumlah barang belanjaan, untuk mendapatkan diskon tambahan sebesar 2,5%\nBila tidak menambah barang, isilah nol");
            System.out.print("Jumlah barang tambahan = ");
            jumlah2 = kas.nextByte();
            total3 = jumlah2 * harga;
            totalTambah = (int) (jumlah2 -(jumlah2*0.025));
            total2 = (int) ((total -(total*0.075))+totalTambah);
            System.out.println("Biaya pembayaran anda adalah = "+total2);
            System.out.print("Masukkan uang pembayaran anda = ");
            bayar = kas.nextInt();
            if (bayar==total2) {
                System.out.println("Terima Kasih");
            } else if (bayar>total2) {
                kembalian = bayar - total2;
                System.out.println("Uang kembalian anda adalah = "+kembalian);
            } else {
                kurangan = total2 - bayar;
                System.out.println("Uang anda kurang sejumlah = "+kurangan);
            }
        } else {
            System.out.println("Total belanjaan anda adalah = "+total);
            System.out.println("\tAnda bisa menambah jumlah barang belanjaan, untuk mendapatkan diskon tambahan sebesar 2,5%\nBila tidak menambah barang, isilah nol");
            System.out.print("Jumlah barang tambahan = ");
            jumlah2 = kas.nextByte();
            total3 = jumlah2 * harga;
            totalTambah = (int) (jumlah2 -(jumlah2*0.025));
            total2 = total + totalTambah;
            System.out.println("Biaya pembayaran anda adalah = "+total2);
            System.out.print("Masukkan uang pembayaran anda = ");
            bayar = kas.nextInt();
            if (bayar==total2) {
                System.out.println("Terima Kasih");
            } else if (bayar>total2) {
                kembalian = bayar - total2;
                System.out.println("Uang kembalian anda adalah = "+kembalian);
            } else {
                kurangan = total2 - bayar;
                System.out.println("Uang anda kurang sejumlah = "+kurangan);
            }
        }
    }
    
}
