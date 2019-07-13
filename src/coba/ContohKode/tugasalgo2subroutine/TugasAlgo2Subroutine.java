/*Kelompok 10
 *
 * Anggota
 * 1. Dheta Indra Edwina A.E
 * 2. Moch Zufarulhaq A.I
 * 3. Yulis Triani
 * 4. Achmad Rijal Baihaqy
 * 5. Sandi Ekmanda P
 */

 /*
  * Buatlah method:
  *
  * void nilaiHuruf(double a)
  *     //menampilkan di layar nilai huruf, misal 80  A
  * int minimum(int[] a)
  *     //menghasilkan nilai minimum yang ada pada array a
  * double ratarata(int[] a)
  *     //menghasilkan rata-rata dari array a
  * void reverse(int[] a)
  *     //me-reverse urutan array a
  * double[][] transpose(int[][] a)
  *     //menghasilkan array dari proses transpose array a
 */
package coba.ContohKode.tugasalgo2subroutine;

//import java.util.Scanner;
public class TugasAlgo2Subroutine {

    public static void main(String[] args) {
        //Fungsi menampilkan nilai huruf
        Double nilai = 79.0;
        nilaiHuruf(nilai);

        //fungsi menampilkan nilai terendah/min dari seluruh data dalam array
        int angka[] = {20, 95, 40, 21, 55, 15, 29};
        System.out.println("Nilai minimum : " + minimum(angka));
        System.out.println("\n\n");

        //fungsi menampilkan rata-rata dari seluruh angka dalam array
        int angkaAcak[] = {32, 29, 20, 54, 27, 14, 21};
        System.out.println("Rata-rata : " + rataRata(angkaAcak));
        System.out.println("\n\n");

        //fungsi menampilkan array yang telah dibalik urutannya
        int angkaTerbalik[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("Array sebelum di reverse : ");
        for (int i = 0; i < angkaTerbalik.length; i++) {
            System.out.print(angkaTerbalik[i] + ", ");
        }
        System.out.println("");
        reverse(angkaTerbalik);
        System.out.println("");

        //fungsi menampilkan matriks yang di transpose
        Double matriks[][] = {{1.1, 2.2}, {4.4, 3.3}, {5.5, 6.6}};
        Double hasilTranspose[][] = transpose(matriks);
        System.out.println("Matriks sebelum di transpose : ");
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[0].length; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("\nMatriks setelah di transpose : ");
        for (int i = 0; i < hasilTranspose.length; i++) {
            for (int j = 0; j < hasilTranspose[0].length; j++) {
                System.out.print(hasilTranspose[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void nilaiHuruf(Double a) {
        if (a >= 80.0) {
            System.out.println("Nilai anda : A");
        } else if (a >= 70.0 && a < 80.0) {
            System.out.println("Nilai anda : B");
        } else if (a >= 60.0 && a < 70.0) {
            System.out.println("Nilai anda : C");
        } else if (a >= 50.0 && a < 60.0) {
            System.out.println("Nilai anda : D");
        } else if (a < 50.0) {
            System.out.println("Nilai anda : E");
        }
    }

    public static int minimum(int a[]) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static Double rataRata(int a[]) {
        Double rata = 0.0;
        for (int i = 0; i < a.length; i++) {
            rata += a[i];
        }
        rata = rata / a.length;
        return rata;
    }

    public static void reverse(int a[]) {
        int b = (a.length)-1;
        int rev[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            rev[i] = a[b];
            b--;
        }
        System.out.println("Array setelah di reverse : ");
        for (int i = 0; i < rev.length; i++) {
            System.out.print(rev[i] + " ");
        }
        System.out.println("");
    }

    public static Double[][] transpose(Double a[][]) {
        Double trans[][] = new Double[a[0].length][a.length];
        for (int i = 0; i < trans.length; i++) {
            for (int j = 0; j < trans[0].length; j++) {
                trans[i][j] = a[j][i];
            }
        }
        return trans;
    }

}
