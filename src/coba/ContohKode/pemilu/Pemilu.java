package coba.ContohKode.pemilu;

import java.util.Scanner;

public class Pemilu {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String calon[] = {"picolo", "ustad", "mastah", "calo"};
        System.out.print("masukan jumlah kota : ");
        int masukan = a.nextInt();
        int kota[] = new int[masukan], suara = 0, totalSuara[] = new int[4];
        //fungsi menginput suara
        for (int i = 0; i < kota.length; i++) {
            System.out.println("========== KOTA " + (i + 1) + "===========");
            for (int j = 0; j < 4; j++) {
                System.out.print("masukan jumlah suara " + calon[j] + " : ");
                suara = a.nextInt();
                totalSuara[j] += suara;
            }
        }
        
        System.out.println("========= TOTAL SUARA =========");
        for (int i = 0; i < 4; i++) {
            System.out.println(calon[i] + " = " + totalSuara[i]);
        }
        //fungsi mencari suara terbanyak
        int maks = totalSuara[0], indeks = 0;
        for (int i = 0; i < 4; i++) {
            if (totalSuara[i] > maks) {
                maks = totalSuara[i];
                indeks = i;
            }
        }
        System.out.println("yang menang : " + calon[indeks] + ", dengan totalSuara suara : " + totalSuara[indeks]);
    }
}
