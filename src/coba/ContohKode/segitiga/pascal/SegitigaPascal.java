package coba.ContohKode.segitiga.pascal;

import java.util.Scanner;

/*
 *latihan membuat segitiga pascal dan distribusi binomial
 */
public class SegitigaPascal {

/*
 *segitiga pascal dengan pola
 *pascal[i][j] = [i-1][j-1] + [i-1][j]
 */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner(System.in);
        int in;
        System.out.print("Masukkan jumlah baris pascal : ");
        in = a.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.print("1 ");
            for (int j = 0; j < 10; j++) {
                System.out.print(((i + 1) + (j + 1)));
            }
            System.out.print(" 1\n");
        }
    }
}
