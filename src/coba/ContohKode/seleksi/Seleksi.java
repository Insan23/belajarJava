package coba.ContohKode.seleksi;

import java.util.Scanner;

public class Seleksi {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String nama[] = new String[10];
        int nilai[] = new int[10];

        System.out.println("====Penerimaan Asisten Laboratorium GIS====");

        for (int i = 0; i < 10; i++) {
            System.out.println("\n\nPesrta ke " + (i + 1));
            System.out.print("Masukkan Nama : ");
            nama[i] = a.next();
            System.out.print("Masukkan Nilai : ");
            nilai[i] = a.nextInt();
        }
        for (int j = 0; j < 10; j++) {
            if (nilai[j] >= 75) {
                System.out.println("Nama Mahasiswa Yang Lulus Ujian Adalah :\n" + nama[j]);
            }
            if (nilai[j] < 75) {
                System.out.println("Nama Mahasiswa Yang Tidak Lulus Ujian Adalah :\n" + nama[j]);
            }
        }
    }

}
