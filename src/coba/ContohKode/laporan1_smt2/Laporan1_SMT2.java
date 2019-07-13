package coba.ContohKode.laporan1_smt2;

import java.util.Scanner;

public class Laporan1_SMT2 {

    public static void main(String[] args) {
        Scanner b = new Scanner(System.in); //deklarasi scanner untuk user input
        System.out.print("Masukkan kalimat/kata : ");
        String kalimat = b.nextLine(); //menyimpan kata dari inputan
        System.out.println("");
        System.out.println("Jumlah huruf\t\t: " + hitungKarakter(kalimat));     
        //memanggil method untuk menghitung jumlah karakter dalam kalimat
        System.out.println("Jumlah huruf vokal\t: " + jumlahVokal(kalimat));
        //memanggil method untuk menghitung jumlah huruf vokal dalam kalimat
    }

    
    //fungsi method non-VOID, untuk mengitung jumlah karakter dengan parameter String
    public static int hitungKarakter(String kata) {
        int jumlahChar = kata.length(); //fungsi <String>.length() digunakan untuk menghitung jumlah karakter dalam suatu kata
        return jumlahChar;  //mengembalikan nilai jumlahChar kepada method yg dipanggil
    }
    //fungsi method non-VOID, untuk menghitung jumlah huruf vokal dalam suatu kalimat
    public static int jumlahVokal(String kata) {
        int jmlVocal = 0;
        char voc[] = {'a', 'i', 'u', 'e', 'o'}; //deklarasi data huruf vokal
        for (int i = 0; i < kata.length(); i++) {
            for (int j = 0; j < voc.length; j++) {
                if (kata.charAt(i) == voc[j]) {
                    jmlVocal++;
                }
            }
        }
        return jmlVocal;    //mengembalikan nilai jumlah vokal pada method yg dipanggil
    }
    
    
    //fungsi method VOID
//    public static void hitungKarakterDanVokal(String a) {
//        int jmlChar = a.length(), jmlVocal = 0;
//        char voc[] = {'a', 'i', 'u', 'e', 'o'};
//        for (int i = 0; i < a.length(); i++) {
//            for (int j = 0; j < voc.length; j++) {
//                if (a.charAt(i) == voc[j]) {
//                    jmlVocal++;
//                }
//            }
//        }
//        System.out.println("Banyak karakter dalam kalimat : " + jmlChar);
//        System.out.println("Banyak huruf vokal dalam kalimat : " + jmlVocal);
//    }
}
