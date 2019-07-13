/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.ContohKode.nilai.maha;

import java.util.Scanner;

public class NilaiMaha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int nilai[][], b, c, jumlah = 0;
        String d[] = {"a" , "b" , "c"};
        
        System.out.print("Masukkan jumlah mahasiswa yang akan di input nilainya : ");
        b = a.nextInt();
        nilai = new int[b][3];
        for (int i = 0; i < nilai.length; i++) {
        System.out.println("Mahasiswa ke " + (i+1));
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Masukkan nilai " + d[j] + " : ");
                nilai[i][j] = a.nextInt();
            }
        }
//        System.out.println("Cek Nilai");
//        System.out.print("dari " + b + " Mahasiswa\nMasukkan nomor mahasiswa yang akan di cek nilainya : ");
//        c = a.nextInt();
//        c--;
//        for (int i = 0; i < nilai.length; i++) {
//            for (int j = 0; j < nilai[i].length; j++) {
//                jumlah+=nilai[i][j];
//            }
//        }
//        System.out.println("jumlah nilai mahasiswa adalah");
//        System.out.println("Mahasiswa ke " + (c+1) + "\nNilainya adalah sebagai berikut :");
//        for (int i = 0; i < nilai[c].length; i++) {
//            System.out.println(nilai[c][i]);
//        }
        System.out.println("Jumlah Nilai Mahasiswa");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke " + (i+1) + " nilai : " + (nilai[i][0] + nilai[i][1] + nilai[i][2]));
        }
    }
    
}
