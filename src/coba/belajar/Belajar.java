package coba.belajar;

import java.util.Scanner;

public class Belajar {

    public static void main(String[] args) {


        //===========================================================================================
        System.out.println("Variabel dan Tipe Data");
        //bulat byte, small, int, long
        //desimal float, double
        //huruf char, String
        //null
        //String concatenation = penggabungan string(huruf)
        //apa pentingnya tab, spasi, dan angka ini pemograman?
        //juga warna
        /**
         * tab untuk mempermudah pembacaan kode
         * warna, itu tergantung editor, kalo pake notepad biasa milik windows, pasti ga ada warnanya
         * angka di sebelah kiri itu angka baris dari kode, untuk nantinya bisa sebagai referensi kalo ada error
         * menunjukkan baris keberapa errornya
         */


        int angka1 = 12;
        angka1 = angka1 + 1;

        int angka2 = 13;
        char kkk = 'a';
        String kaliamt = "kakakakak dkandc";
        double desimal = 1.2;
        float ss = 12.3F;

        System.out.println("Belajar " + angka1 + angka2);


        /**
         * kali = *
         * bagi = /
         * tambah  = +
         * kurang = -
         */

        int hasil = angka1 + angka2;
        //===========================================================================================
        System.out.println("Percabangan IF");
        /**
         * operator pembanding
         * == (sama dengan)
         * != (tidak sama dengan)
         *
         *
         * && dan (and)
         * || atau (or)
         * Not AND, Xclusive OR, Not OR
         * NOR
         * >
         * <
         * >=
         * <=
         *
         */


        int ab = 123;
        int cd = 22;
        //membandingkan huruf string
//        String huruf = "bababa";
//        if (huruf.equalsIgnoreCase("")) {
//
//        }


        if (ab == 123 || cd == 22) {
            System.out.println("benar");
        } else {
            System.out.println("salah");
        }

        int suhu = 10;

        //if bertingkat
        if (suhu < 10) System.out.println("dingin");
        else if (suhu > 10 && suhu < 30) System.out.println("normal");
        else if (suhu > 30) System.out.println("panas");
        else System.out.println("nothing");


        if (suhu == 1) suhu = 1;
        else suhu = 2;


        //if bersarang
        if (suhu > 10) {
            if (suhu > 30) {

            } else {

            }
        } else {

        }

        //===========================================================================================
        System.out.println("Percabangan SWITCH");

        int varSwitch = 6;
        String var2 = "aku";
        switch (varSwitch) {
            case 1:
                System.out.println("variabel varSwitch bernilai 1");
                break;
            case 2:
                System.out.println("variabel varSwitch bernilai 2");
                break;
            case 3:
                System.out.println("variabel varSwitch bernilai 3");
                break;
            case 4:
                System.out.println("variabel varSwitch bernilai 4");
                break;
            case 5:
                System.out.println("variabel varSwitch bernilai 5");
                break;
            default:
                System.out.println("tidak cocok");
        }

        //===========================================================================================
        System.out.println("Tipe Data Array");
        String[] nama = {"ana", "zuzur", "lala", "kaka", "nini", "kuku"};


        //deklarasi array, dengan panjang array 4
        String nama2[] = new String[4];

        //replace panjang array dari 4 menjadi 7, dengan menimpa data sebelumnya
        nama2 = new String[7];

        String nama3[];
        nama3 = new String[3];

        //mengkases data array pada indeks ke 3
        System.out.println(nama[2]);

        //i++
        // int i = 0
        // i = i + 1
        //
        //===========================================================================================
        System.out.println("Perulangan FOR");

        for (int i = 0; i < nama.length; i++) {
            // i = 0
            System.out.println("indeks ke-" + i + ": + " + nama[i]);
        }

        //perulangan tak terbatas
//        for (int i = 0; i >= 0;) {
//            System.out.println("halo " + i);
//        }

        for (char i = 'a'; i <= 'g'; i++) {
            System.out.println("sss " + i);
        }

        //===========================================================================================
        System.out.println("Perulangan WHILE");

        int varWhile = 0;
        while (varWhile < 10) {
            System.out.println("isi varwhile " + varWhile);
            varWhile++;
        }


        String inputUser = "";
//        while(!inputUser.equalsIgnoreCase("keluar") || inputUser.equalsIgnoreCase("")) {
//            System.out.println("Selamat Datang,\nKetik \"Keluar\" untuk mengakhiri");
//            System.out.print("ketikkan pilihan anda : ");
//            inputUser = input.nextLine();
//        }

//        do {
//            System.out.println("Selamat Datang,\nKetik \"Keluar\" untuk mengakhiri");
//            System.out.println("ketikkan pilihan anda : ");
//            inputUser = input.nextLine();
//        } while (!inputUser.equalsIgnoreCase("keluar"));

        //===========================================================================================
        /**
         * buatlah program perhitungan luas bangun datar (saja)
         * contoh output
         *
         * pilih bangun ruang
         * 1. segitiga
         * 2. persegi
         * 3. persegi panjang
         * ketikkan pilihan anda : input angka
         * bangun datar segitiga
         * ketikkan panjang alas : 10
         * ketikkan tinggi : 10
         * Luas segitiga = ....
         */
        Scanner input = new Scanner(System.in);

//        System.out.println("===Segitiga===");
//        int a, t;
//
//        System.out.print("alas = ");
//        a = input.nextInt();
//        System.out.print("tinggi = ");
//        t = input.nextInt();
//
//        int hasilLuas;
//        hasilLuas = (a * t) / 2;
//
//        System.out.println("hasil = " + hasilLuas);
    }
}
