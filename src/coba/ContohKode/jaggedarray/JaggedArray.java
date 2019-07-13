/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.ContohKode.jaggedarray;

import java.util.Scanner;

/**
 *
 * @author Mella
 */
public class JaggedArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String pes[][];
        int pemes, jmlpes;
        System.out.print("Jumlah Pemesanan : ");
        pemes = a.nextInt();
        pes = new String[pemes][];
        for (int i = 0; i < pes.length; i++) {
            System.out.print("Masukkan jml pemesanan : ");
            jmlpes = a.nextInt();
            pes[i] = new String[jmlpes];
            for (int j = 0; j < pes[i].length; j++) {
                System.out.println("Pemesanan " + (j + 1));
                pes[i][j] = a.next();
            }
        }
        System.out.println("Pemesanan hari ini adalah sebagai berikut : ");
        for (int i = 0; i < pes.length; i++) {
            System.out.println("Pemesan ke " + (i + 1));
            for (int j = 0; j < pes[i].length; j++) {
                System.out.println("Pesanan ke " + (j + 1) + " : " + pes[i][j]);
            }
        }
    }

}
