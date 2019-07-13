package coba.ContohKode.contoharray;

import java.util.Random;

public class ContohArray {

    public static void main(String[] args) {
        String[] bulan = {"Jan", "Feb", "Mar", "Apr", "Mei", "Jun", "Jul", "Ags", "Sep", "Okt", "Nov", "Des"};
        int jmlLahir[] = new int[12];
        Random bln = new Random();
        for (int i = 0; i < 12; i++) {
            jmlLahir[i] = 0;
        }
// deklarasi jmlLahir bisa juga seperti di bawah (tidak perlu for untuk inisialisasi)
// int jmlLahir[] = {0,0,0,0,0,0,0,0,0,0,0,0};
        int n = 0;
        do {
            int blnLahir = bln.nextInt(12);
            jmlLahir[blnLahir] = jmlLahir[blnLahir] + 1;
            n++;
        } while (n < 1000);
        for (int i = 0; i < 12; i++) {
            System.out.println("Kelahiran " + bulan[i] + " " + jmlLahir[i] + " orang");
        }
        int maks = 0;
        for (int i = 0; i < 12; i++) {
            if (jmlLahir[i] > maks) {
                maks = jmlLahir[i];
                n = i;
            }
        }
        System.out.println("Terbanyak bulan " + bulan[n] + " " + jmlLahir[n] + " orang");
    }

}
