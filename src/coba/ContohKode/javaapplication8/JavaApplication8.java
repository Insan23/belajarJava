package coba.ContohKode.javaapplication8;

import java.util.Scanner;

public class JavaApplication8 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int jmlMenu = 0, harga[], jmlPesan[], diskon = 0, b = 1;
        byte pilihan = 0;
        String menu[];
        System.out.println("Apakah ada pemesanan ?\n1. Ya\n2. Tidak");
        pilihan = a.nextByte();
        while (pilihan == 1) {
            System.out.println("Pembeli " + b);
            System.out.print("Berapakah menu yang dipesan\njumlah menu : ");
            jmlMenu = a.nextInt();
            harga = new int[jmlMenu];
            jmlPesan = new int[jmlMenu];
            menu = new String[jmlMenu];
            for (int i = 0; i < jmlMenu; i++) {
                System.out.print("Menu-" + (i + 1) + " : ");
                menu[i] = a.next();
                System.out.print("Jumlah pemesanan : ");
                jmlPesan[i] = a.nextInt();
                System.out.print("Harga : ");
                harga[i] = a.nextInt();
                if ((harga[i]*jmlPesan[i]) > 100000) {
                    diskon++;
                }
            }
            System.out.println("\n\n\n\n");
            for (int i = 0; i < jmlMenu; i++) {
                System.out.println("Menu-" + (i+1));
                System.out.println("Nama Menu :\t\t" + menu[i]);
                System.out.println("Jumlah :\t\t" + jmlPesan[i]);
                System.out.println("Harga :\t\t" + harga[i]);
            }
            System.out.println("Apakah ada pemesanan ?\n1. Ya\n2. Tidak");
            pilihan = a.nextByte();
            b++;
        }
        System.out.println("Jumlah Pemesanan Yang Mendapat Diskon adalah : " + diskon);
    }
    
}
