package coba.ContohKode.program.kasir;

import java.util.Scanner;

public class ProgramKasir {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kas = new Scanner(System.in);
        int harga, bayar, kembalian, kurangan, total, total2;
        byte jumlah, jumlah2;
        
        System.out.println("=========================================Program Kasir=========================================");
        System.out.print("Masukkan jumlah barang yang dibeli = ");
        jumlah = kas.nextByte();
        System.out.print("Masukkan harga barang = ");
        harga = kas.nextInt();
        total = jumlah * harga;
        if (total>=500000) {
            System.out.println("Total belanjaan anda adalah = "+total+"\nAnda mendapatkan diskon sebesar 10%");
            System.out.println("Anda bisa menambah jumlah barang belanjaan, untuk mendapatkan diskon tambahan sebesar 2,5%");
            System.out.print("Jumlah barang tambahan = ");
            jumlah2 = kas.nextByte();
            if (jumlah2>0) {
                
            }
            total2 = (int) (total +(total-(total*0.1)));
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
            total2 = (int) (total +(total-(total*0.075))); 
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
            
        }
    }
    
}
