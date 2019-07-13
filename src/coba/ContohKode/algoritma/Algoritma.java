package coba.ContohKode.algoritma;

import java.util.Scanner;

public class Algoritma {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int umur;
        System.out.println("masukkan umur = ");
        umur = data.nextInt();
        if (umur > 18) {
            System.out.println("Anda Boleh Masuk");
        } else {
            System.out.println("Coba Lagi Tahun Depan");
        }

    }

}
