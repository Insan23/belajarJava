package coba.ContohKode.programbelanja;

import java.util.Scanner;   //meng import Scanner untuk menggunakan fitur usr input

public class ProgramBelanja {

    public static void main(String[] args) {
        Scanner kas = new Scanner(System.in);   //inisialisasi variabel Scanner
        byte pilihan;   //inisialisasi variabel pilihan untuk input pilihan
        int total = 0, harga, jumlah, kembalian, pembayaran, uangKurang;
        //inisialisasi variabel - variabel yan akan digunakan dalam program
        System.out.println("Apa Anda Ingin Membeli Barang?\n1. Ya\n2. Tidak");  //mencetak pilihan kepada user untuk membeli barang
        System.out.print("Masukkan Pilihan : ");    //mencetak tulisan untuk menandakan user input
        pilihan = kas.nextByte();   //masukan dari user akan disimpan dalam variabel pilihan
        switch (pilihan) {  //inisialisasi switch case
            case 1: //bila user menginputkan angka 1
                do { //awal perluangan, do digunakan untuk menjalankan pernyataan sebelum dilakukan pengecekan
                    System.out.print("\n\nMasukkan Harga Barang : Rp ");    //user diminta untuk memasukkan harga barang
                    harga = kas.nextInt();  //harga barang disimpan dalam varabel harga
                    System.out.print("Masukkan Jumlah Barang : ");          //user diminta untuk mmasukkan jumlah barang yang dibeli
                    jumlah = kas.nextInt(); //jumlah barang disimpan dalam variabel jumlah
                    total += (harga * jumlah);  //memproses total harga
                    System.out.println("Apakah Anda Ingin Menambah Barang Lagi?\n1. Ya\n2. Tidak");
                    //mencetak pilihan apakah user ingin menambah barang atau tidak
                    pilihan = kas.nextByte();   //pilihan dari user disimpan dalam variabel pilihan
                } while (pilihan == 1); //prulangan mengunakan do-while, untuk mengulang pernyataan terlebih dahulu, kemudian melakukan pengecekan
                //bila user tidak menginputkan angka 2, maka akan diulang
                System.out.println("\nTotal Harga Belanjaan Anda Adalah : Rp " + total);    //mencetak total harga belanjaan
                System.out.print("Masukkan Uang Pembayaran : Rp "); //user diminta untuk memasukkan uang pembayaran
                pembayaran = kas.nextInt(); //pembayaran disimpan dalam variabel pembayaran
                if (pembayaran < total) {    //bila pembayaran kurang dari total belanja
                    uangKurang = total - pembayaran;    //proses menghitung uang yang kurang
                    do {
                        System.out.println("\n\nUang Pembayaran Anda Kurang Rp " + uangKurang); //mencetak uang kurang
                        System.out.print("Silahkan Masukkan Uang Pembayaran : Rp ");    //user diminta untuk memasukkan uang kekurangan
                        pembayaran = kas.nextInt();     //pembayaran uang kurang disimpan dalam variabel pembayaran
                        if (pembayaran > uangKurang) {  //bila uang pembayaran lebih dari uang kurang
                            kembalian = pembayaran - uangKurang;                             //proses perhitungan uang kembalian
                            System.out.println("\nKembalian Anda Adalah : Rp " + kembalian); //dan akan dicetak jumlah uang kembalian
                            break;  //menghentikan proses perulangan dan akan melanjutkan ke baris setelah perulangan
                        }
                        uangKurang -= pembayaran;   //proses untuk menghitung jumlah uang kurang setelah pembayaran
                    } while (uangKurang != 0);      //bila masih ada uang kurang, maka program akan terus berulang hingga tidak ada uang yang kurang
                    System.out.println("\nTerima Kasih Telah Berbelanja");  //bila uang kurang sudah dibayar semua, akan mencetak baris ini

                } else if (pembayaran > total) {        //bila pembayaran lebih dari total belanja
                    kembalian = pembayaran - total;     //maka akan ada proses perhitungan uang kembalian
                    System.out.println("\nKembalian Anda Adalah : Rp " + kembalian + "\n\nTerima Kasih Telah Berbelanja");
                    //dan akan mencetak uang kembalian
                } else {    //bila pembayaran sesuai dengan total belanjaan
                    System.out.println("\nTerima Kasih Telah Berbelanja");  //maka program akan mencetak baris ini
                }
                break;  //mengakhiri case 2
            case 2: //bila user menginputkan angka 2
                System.out.println("\nTerima Kasih Telah Berkunjung :)"); //program akan mencetak baris ini
                break;  //mengakhiri case 2
            default:    //bila input pilihan selain 1 atau 2
                System.out.println("Pilihan Tidak Tersedia!!!!"); //program akan mencetak baris ini
        }
    }

}
