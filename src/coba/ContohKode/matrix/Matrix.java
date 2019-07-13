/*
contoh untuk menampilkan matriks
menggunakan array dua dimensi
dimensi pertama untuk baris, dan dimensi kedua untuk kolom
*/
package coba.ContohKode.matrix;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int matrix[][]; //variabel matriks
        int x, y;       //input untuk banyak kolom dan baris
        
        //memulai input banyak kolom & baris dalam matriks
        System.out.println("PERHITUNGAN MATRIKS");
        System.out.print("masukkan panjang baris : ");
        x = m.nextInt();
        System.out.print("masukkan panjang kolom : ");
        y = m.nextInt();
        matrix = new int[x][y];
        
        //memulai user input data angka dalam matriks
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("\n\nbaris ke " + (i+1) + "\nkolom ke " + (j+1));
                System.out.print("Masukkan angka : ");
                matrix[i][j] = m.nextInt();
            }
        }
        //fungsi untuk menampilkan matriks
        System.out.println("hasil matiks :");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println("");
        }
    }

}
