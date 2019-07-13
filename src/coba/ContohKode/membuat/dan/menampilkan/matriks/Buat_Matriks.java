package coba.ContohKode.membuat.dan.menampilkan.matriks;

import java.util.Scanner;

public class Buat_Matriks {
    Scanner s = new Scanner(System.in);
    int matriks[][], baris, kolom;
    void buat() {
        System.out.println("<Membuat Matriks>");
        System.out.print("Masukkan jumlah baris : ");
        baris = s.nextInt();
        System.out.print("Masukkan jumlah kolom : ");
        kolom = s.nextInt();
        matriks = new int[baris][kolom];
        System.out.println("Masukkan data matriks :");
        for (int i = 0; i < baris; i++) {
            System.out.print("baris ke " + (i+1));
            for (int j = 0; j < kolom; j++) {
                System.out.print(", kolom ke " + (j+1) + " : ");
                matriks[i][j] = s.nextInt();
            }
        }
    }
    void tampilkan() {
        System.out.println("Matriksnya adalah sebagai berikut :");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("\t" + matriks[i][j]);
            }
            System.out.println("");
        }
    }
    
}
