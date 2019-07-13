package coba;

import java.util.Scanner;

public class xxx {
    public static void main(String[] args) {
        /**
         * () kurung biasa
         * [] kurung kotak
         * {} kurung kurawal
         *
         */
        Scanner input = new Scanner(System.in);
        String[] nama = {"zaza", "rara", "bima", "raka"};
        int jumlah1 = 0;
        int jumlah2 = 0;
        int jumlah3 = 0;
        int jumlah4 = 0;
        int in, pemilih;


        System.out.println("ketikkan jumlah pemilih");
        pemilih = input.nextInt();


        for (int i = 0; i < pemilih; i++) {
            System.out.println("ketikkan kandidat pilihan anda");
            in = input.nextInt();
            switch (in) {
                case 1:
                    System.out.print("kandidat dengan nama " + nama[0]);
                    jumlah1++;
                    System.out.println("jumlah = " + jumlah1);
                    break;
                case 2:
                    System.out.println("kandidat dengan nama " + nama[1]);
                    jumlah2++;
                    System.out.println("jumlah = " + jumlah2);
                    break;
                case 3:
                    System.out.println("kandidat dengan nama" + nama[2]);
                    jumlah3++;
                    System.out.println("jumlah = " + jumlah3);
                    break;
                case 4:
                    System.out.println("kandidat dengan nama" + nama[3]);
                    jumlah4++;
                    System.out.println("jumlah = " + jumlah4);
                    break;
                default:
                    System.out.println("golongan putih");
            }
        }


    }
}
