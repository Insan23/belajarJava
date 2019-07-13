package coba.belajar;

import java.util.Scanner;

public class KelasBelajar {

    public static void main(String[] args) {
        /**
         * buatlah program perhitungan luas bangun datar (saja)
         * contoh output
         *
         * pilih bangun ruang
         * 1. segitiga
         * 2. persegi
         * 3. persegi panjang
         * ketikkan pilihan anda : input angka
         * bangun datar segitiga
         * ketikkan panjang alas : 10
         * ketikkan tinggi : 10
         * Luas segitiga = ....
         */

        Scanner input = new Scanner(System.in);
        int a, t, p, l, hasilLuas, in;
        System.out.println("Pilih Bangun Ruang\n1. segitiga\n2. persegi\n3. persegi panjang");
        System.out.println("ketikkan pilihan anda : ");
        in = input.nextInt();

        switch (in) {
            case 1:
                System.out.println("bangun datar segitiga");
                System.out.println("ketikkan panjang alas :");
                a = input.nextInt();
                System.out.println("ketikkan tinggi :");
                t = input.nextInt();
                hasilLuas = (a * t) / 2;
                System.out.println("Luas = " + hasilLuas);
                break;
            case 2:
                System.out.println("bangun datar persegi");
                System.out.println("ketikkan panjang :");
                p = input.nextInt();
                System.out.println("ketikkan lebar :");
                l = input.nextInt();
                hasilLuas = p * l;
                System.out.println("Luas = " + hasilLuas);
                break;
            case 3:
                System.out.println("bangun datar persegi panjang");
                System.out.println("ketikkan panjang :");
                p = input.nextInt();
                hasilLuas = p * p;
                System.out.println("Luas = " + hasilLuas);
                break;
            default:
                System.out.println("pilihan tidak tersedia");
        }
    }
}
