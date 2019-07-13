package coba.ContohKode.matriks.perkalian;

import java.util.Scanner;

public class MatriksPerkalian {

    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        int matriks1[][], matriks2[][], hasil[][], bar1, bar2, kol1, kol2, jumlah = 0;

        System.out.println("\n\nMatriks pertama");
        System.out.print("Masukkan jumlah baris : ");
        bar1 = w.nextInt();
        System.out.print("Masukkan jumlah kolom : ");
        kol1 = w.nextInt();
        System.out.println("\n\nMatriks kedua");
        System.out.print("Masukkan jumlah baris : ");
        bar2 = w.nextInt();
        System.out.print("Masukkan jumlah kolom : ");
        kol2 = w.nextInt();

        matriks1 = new int[bar1][kol1];
        matriks2 = new int[bar2][kol2];
        hasil = new int[bar1][kol2];
        
        System.out.println("Masukkan data matriks pertama : ");
        for (int i = 0; i < bar1; i++) {
            for (int j = 0; j < kol1; j++) {
                matriks1[i][j] = w.nextInt();
            }
        }
        for (int i = 0; i < bar2; i++) {
            for (int j = 0; j < kol2; j++) {
                matriks2[i][j] = w.nextInt();
            }
        }
        for (int i = 0; i < bar1; i++) {
            for (int j = 0; j < kol2; j++) {
                for (int k = 0; k < bar2; k++) {
                    jumlah += matriks1[i][k] * matriks2[k][j];
                }
                hasil[i][j] = jumlah;
                jumlah = 0;
            }
        }
        System.out.println("Hasil dari perkalian matriks adalah");
        for (int i = 0; i < bar1; i++) {
            for (int j = 0; j < kol2; j++) {
                System.out.println(hasil[i][j]);
            }
        }
    }

}
