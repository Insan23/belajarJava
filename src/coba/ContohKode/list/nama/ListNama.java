package coba.ContohKode.list.nama;

import java.util.Scanner;

public class ListNama {

    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        String nama[];
        int pNama;

        System.out.print("Masukkan jumlah mahasiswa yang akan di inputkan : ");
        pNama = w.nextInt();
        nama = new String[pNama];
        // fungsi perulangan input nama
        for (int i = 0; i < pNama; i++) {
            System.out.println("\n\n======================");
            System.out.println("Mahasiswa ke - " + (i + 1));
            System.out.print("Masukkan Nama Mahasiswa : ");
            nama[i] = w.next();
        }
        // fungsi memanggil nama meloncati satu nama
        for (int i = (pNama - 1); i >= 0; i -= 2) {
            System.out.print("\n\nNama Mahasiswa Yang Terdaftar : ");
            System.out.println(nama[i]);
        }
    }

}
