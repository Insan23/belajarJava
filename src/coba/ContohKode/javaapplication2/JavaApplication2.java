package coba.ContohKode.javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        int banyak = 0;
        int pil1, pil2;
        String keluarga[][] = new String[50][4];
        
        System.out.println("Ada data Keluarga Baru ?\n1.Ya\n2. Tidak");
        System.out.print("Input pilihan : ");
        pil1 = a.nextInt();
        System.out.println("");
        
        switch (pil1) {
            case 1:
                do {
                    System.out.println("==========< Keluarga" + (banyak + 1) + " >==========");
                    System.out.println("Nama Ayah : ");
                    keluarga[banyak][0] = a.next();

                    System.out.println("Nama Ibu : ");
                    keluarga[banyak][1] = a.next();

                    System.out.println("Nama Anak 1 : ");
                    keluarga[banyak][2] = a.next();

                    System.out.println("Nama Anak 2 : ");
                    keluarga[banyak][3] = a.next();

                    System.out.println("Apakah ada data lagi?\n1. Ya\n2. Tidak");
                    System.out.print("Input Pilihan : ");
                    pil2 = a.nextInt();
                    
                    banyak ++;
                } while (pil2 == 1 && banyak < 50);
                System.out.println("Terima Kasih sudah menggunakan layanan kami");
            default:
                System.out.println("Terima Kasih sudah menggunakan layanan kami");
        }
    }

}
