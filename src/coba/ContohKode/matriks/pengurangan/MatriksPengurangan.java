package coba.ContohKode.matriks.pengurangan;

import java.util.Scanner;

public class MatriksPengurangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        int matriks1[][], matriks2[][], hasil[][], baris, kolom;
        System.out.println("Pertambahan Matriks");
        System.out.print("\nBanyak baris : ");
        baris = w.nextInt();
        System.out.println("Banyak kolom : ");
        kolom = w.nextInt();
        
        matriks1 = new int[baris][kolom];
        matriks2 = new int[baris][kolom];
        hasil = new int[baris][kolom];
        
        System.out.println("\n\nMasukkan data matriks pertama : ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriks1[i][j] = w.nextInt();
            }
        }
        System.out.println("\n\nMasukkan data matriks kedua : ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriks2[i][j] = w.nextInt();
            }
        }
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriks1[i][j] - matriks2[i][j];
            }
        }
        
        System.out.println("Hasil dari penjumlahan matriks yaitu : ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.println(hasil[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
}
