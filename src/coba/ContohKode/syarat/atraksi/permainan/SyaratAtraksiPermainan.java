package coba.ContohKode.syarat.atraksi.permainan;

import java.util.Scanner;

public class SyaratAtraksiPermainan {

    public static void main(String[] args) {
        // deklarasi awal variabel
        int umur, syaratLebihDari;
        float syaratPrima;
        Scanner atrak = new Scanner(System.in); //deklarasi variabel scanner untuk masukan/user input

        System.out.println("Untuk masuk dalam atraksi permainan, masukkan umur anda dahulu");
        System.out.print("Umur anda = ");
        umur = atrak.nextInt(); //variabel umur untuk menampung data umur dari user input
        
        syaratPrima = umur / 2; //ini adalah syarat pertama, umur dibagi dengan 2 harus menghasilkan bil prima
        if ((syaratPrima % 2) != 0) {              //ke empat kondisional disini digunakan untuk melakukan
            if ((syaratPrima % 3) != 0) {          //cek apakah hasil pembagian umur merupakan bilangan prima
                if ((syaratPrima % 5) != 0) {      //atau bukan, dengan menggunakan pembbagian oleh 4 bilangan utama.
                    if ((syaratPrima % 7) != 0) {  //jika hasil pembagian tidak menghasilkan sisa nol
                                                   //maka angka tersebut merupakan bilangan prima
                        
                        if (umur > 30) {        //ini adalah syarat kedua, umur harus lebih dari 30 tahun
                            syaratLebihDari = umur / 2; //ini adalah syarat ketiga, jika umur dibagi 2
                            if (syaratLebihDari > 20) { //hasilnya harus lebih dari 20
                                //bila ketiga syarat terpenuhi, maka akan mucul berikut ini
                                System.out.println("Syarat terpenuhi.\nAnda boleh masuk dalam atraksi");
                            } else {
                                //bila syarat ketiga tidak terpenuhi, maka akan muncul berikut ini
                                System.out.println("Anda tidak dapat masuk dalam atraksi.\n"
                                        + "Satu persyaratan belum terpenuhi");
                            }
                        } else {
                            //bila syarat kedua tidak terpenuhi, maka akan muncul berikut ini
                            System.out.println("Anda tidak dapat masuk dalam atraksi.\n"
                                    + "Dua persyaratan belum terpenuhi");
                        }
                    } else {
                        //bila syarat pertama tidak terpenuhi, maka akan muncul berikut ini, hingga baris akhir
                        System.out.println("Anda tidak dapat masuk dalam atraksi.\n"
                                + "Tiga pertsyaratan belum terpenuhi");
                    }
                } else {
                    System.out.println("Anda tidak dapat masuk dalam atraksi.\n"
                            + "Tiga prtsyaratan belum terpenuhi");
                }
            } else {
                System.out.println("Anda tidak dapat masuk dalam atraksi.\n"
                        + "Tiga prtsyaratan belum terpenuhi");
            }
        } else {
            System.out.println("Anda tidak dapat masuk dalam atraksi.\n"
                    + "Tiga prtsyaratan belum terpenuhi");
        }
    }

}
