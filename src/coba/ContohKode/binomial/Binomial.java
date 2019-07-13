//ANGGOTA KELOMPOK 10

/* Achmad Rijal Baihaqy         152410101140
 * Dheta Indra Edwina A.E.      152410101121
 * Yulis Triani                 152410101131
 * Moch. Zufarulhaq A.I         152410101129
 * Sandy Ekmanda p              152410101135
 */
package coba.ContohKode.binomial;

import java.util.Scanner;

public class Binomial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah Baris yang akan dicetak : ");
        int in = sc.nextInt() + 1;
        int[][] jagged = new int[in][];
        int pangkat = 1;
        int[][] jagged2 = new int[in][];
        for (int i = 1; i < in; i++) {
            jagged[i] = new int[i];
            for (int j = 0; j < i; j++) {
                jagged[i][j] = pangkat;
            }
            pangkat *= 2;
        }
        jagged2[0] = new int[1];
        jagged2[1] = new int[2];
        jagged2[0][0] = 1;
        jagged2[1][0] = 1;
        jagged2[1][1] = 1;

        for (int i = 2; i < in; i++) {
            jagged2[i] = new int[i];
            for (int j = 1; j < i - 1; j++) {
                jagged2[i][j] = jagged2[i - 1][j - 1] + jagged2[i - 1][j];
            }
            jagged2[i][0] = 1;
            jagged2[i][i - 1] = 1;

        }
        for (int i = 0; i < in; i++) {//
            for (int j = 0; j < i; j++) {//
                while (jagged[i][j] % 2 == 0 && jagged2[i][j] % 2 == 0) {
                    jagged[i][j] /= 2;
                    jagged2[i][j] /= 2;
                }
                while (jagged[i][j] % 3 == 0 && jagged2[i][j] % 3 == 0) {
                    jagged[i][j] /= 3;
                    jagged2[i][j] /= 3;
                }
                while (jagged[i][j] % 5 == 0 && jagged2[i][j] % 5 == 0) {
                    jagged[i][j] /= 5;
                    jagged2[i][j] /= 6;
                }
                while (jagged[i][j] % 7 == 0 && jagged2[i][j] % 7 == 0) {
                    jagged[i][j] /= 7;
                    jagged2[i][j] /= 7;
                }
                System.out.print(jagged2[i][j] + "/" + jagged[i][j] + "\t");
            }
            System.out.println("");
        }
    }

}
