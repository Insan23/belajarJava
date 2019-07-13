package coba.ContohKode.biaya.tunjangan.keluarga;

import java.util.Scanner;

public class BiayaTunjanganKeluarga {

    public static void main(String[] args) {
        Scanner kel = new Scanner(System.in);
        int keluarga, ayah, ibu, anakP, anakL, totAyah = 0, totIbu = 0, totAnakL = 0, totAnakP = 0, tunjAyah = 0, tunjIbu = 0, tunjAnak = 0, totTunj = 0;
        int totTunjAyah = 0, totTunjIbu = 0, totTunjAnak = 0;   //inisiasi variabel yang digunakan
        System.out.println("=========================Tunjangan Keluarga=========================");
        System.out.print("Masukkan Jumlah Kepala Keluarga : ");
        keluarga = kel.nextInt();   //menginput jumlah keluarga
        while (keluarga <= 0) { //bila keluarga nol, maka akan di ulang hingga memasukkan nilai lebih dari nol
            System.err.println("Jumlah Keluarga Tidak Mungkin nol/negatif !!!!");
            System.out.println("Masukkan kembali jumlah keluarga : ");
            keluarga = kel.nextInt();
        }
        System.out.println("\n\n==========================================================================");
        for (int i = 1; i <= keluarga; i++) {   //memulai perulangan sejumlah keluarga yang di inputkan sebelumnya
            System.out.println("\nKeluarga ke - " + i);
            System.out.print("\nMasukkan Jumlah Ayah (bila tidak ada ayah, isi nol)\t: ");
            ayah = kel.nextInt();   //input jumlah ayah dalam 1 keluarga
            while (ayah < 0 || ayah > 2) {  //bila nilai negatif/lebih dari 2, maka diulang untuk menginputkan nilai yang benar
                System.err.println("Kesalahan dalam data/ayah tidak boleh lebih dari 2 !!!!!!");
                System.out.print("Masukkan kembali jumlah ayah\t: ");
                ayah = kel.nextInt();
            }
            System.out.print("\nMasukkan Jumlah Ibu (bila tidak ada ibu, isi nol)\t: ");
            ibu = kel.nextInt();    //input jumlah ibu dalam satu keluarga
            while (ibu < 0 || ibu > 4) {    //bila nilai negatif/lebih dari 4, maka diulang untuk menginputkan nilai yang benar
                System.err.println("Kesalahan dalam data/Ibu maksimal hanya 4 !!!!!!!");
                System.out.print("Masukkan kembali jumlah ibu\t: ");
                ibu = kel.nextInt();
            }
            while (ayah == 0 && ibu == 0) { //bila nilai ayah dan ibu nol semua, maka akan diulang untuk input ayah dan ibu kembali
                System.err.println("Di sini ga ada keluarga tanpa orang tua, isi yang BENER !!!!");
                System.out.print("\nMasukkan Jumlah Ayah (bila tidak ada ayah, isi nol)\t: ");
                ayah = kel.nextInt();
                while (ayah < 0 || ayah > 2) {
                    System.err.println("Kesalahan dalam data/ayah tidak boleh lebih dari 2 !!!!!!");
                    System.out.print("Masukkan kembali jumlah ayah\t: ");
                    ayah = kel.nextInt();
                }
                System.out.print("\nMasukkan Jumlah Ibu (bila tidak ada ibu, isi nol)\t: ");
                ibu = kel.nextInt();
                while (ibu < 0 || ibu > 4) {
                    System.err.println("Kesalahan dalam data/Ibu maksimal hanya 4 !!!!!!!");
                    System.out.print("Masukkan kembali jumlah ibu\t: ");
                    ibu = kel.nextInt();
                }
            }
            System.out.print("\nMasukkan Jumlah Anak Laki - Laki\t: ");
            anakL = kel.nextInt();  //input jumlah anak laki-laki dalam keluarga
            while (anakL <= 0) {    //bila nilai anak laki-laki nol/tidak punya anak, maka akan diulang hingga nilai anak > 0
                System.err.println("Anak kok nol/ngutang ???????");
                System.out.print("Masukkan kembali jumlah anak laki - laki\t: ");
                anakL = kel.nextInt();
            }
            System.out.print("\nMasukkan Jumlah Anak Perempuan\t\t: ");
            anakP = kel.nextInt();  //input jumlah anak perempuan dalam keluarga
            while (anakP <= 0) {    //bila nilai anak perempuan nol/tidak punya anak, maka akan diulang hingga nilai anak > 0
                System.err.println("Anak kok nol/ngutang ???????");
                System.out.print("Masukkan kembali jumlah anak perempuan\t: ");
                anakP = kel.nextInt();
            }
            //pilihan untuk menentukan apakah suatu keluarga tsb single parent atau bukan
            if (ayah == 1 && ibu == 0 ) {   //bila hanya ayah yang menjadi single parent
                tunjAyah = 400000;  //ayah akan mendapat Rp 400.000
            } else  if (ibu == 1 && ayah == 0){ //bila hanya ibu yang menjadi single parent
                tunjIbu = 400000;   //ibu akan mendapat Rp 400.000
            } else {    //bila satu keluarga tidak single parent atau kedua orang tua ada
                tunjAyah = (ayah * 250000); //maka ayah dan ibu masing-masing mendapat Rp 250.000
                tunjIbu = (ibu * 250000);
            }
            if ((anakL + anakP) > 4) {  //bila total anak perempuan dan laki-laki lebih dari 4
                tunjAnak = 400000;  //maka tunjangan akan dihitung maks 4 anak
            } else {    //bila total anak kurang dari sama dengan 4 anak
                tunjAnak = (anakL + anakP) * 100000;    //maka tiap anak akan mendapat Rp 100.000
            }
            totAnakL += anakL;          //untuk menghitung jumlah anak perempuan
            totAnakP += anakP;          //jumlah anak laki-laki
            totAyah += ayah;            //jmlah ayah
            totIbu += ibu;              //dan jumlah ibu
            totTunjAyah += tunjAyah;    //untuk menghitung total jumlah tunjangan ayah
            totTunjIbu +=tunjIbu;       //tunjangan ibu
            totTunjAnak += tunjAnak;    //dan tunjangan anak, dari seluruh keluarga
            System.out.println("Tunjangan Keluarga ke - " + i + " Adalah :");
            System.out.println("Tunjagan Ayah\t: Rp " + tunjAyah + "\nTunjangan Ibu\t: Rp " + tunjIbu);
            //mencetak jumlah tunjangan ayah & ibu dalam 1 keluarga
            System.out.println("Tunjangan Anak\t: Rp " + tunjAnak);
            //mencetak jumlah tunjangan anak dalam 1 keluarga
        }
        System.out.println("\n==========================================================================\n");
        totTunj = tunjAyah + tunjIbu + tunjAnak;    //menghitung seluruh tunjangan dari seluruh keluarga
        System.out.println("Dari " + keluarga + " Keluarga, didapat data sebagai berikut : \n");    //mencetak jumlah keluarga
        System.out.println("Jumlah Ayah\t\t\t: " + totAyah + ", dengan total tunjangan sebesar\t: Rp " + tunjAyah);
        //mencetak total ayah & total tunjangan untuk seluruh ayah
        System.out.println("Jumlah Ibu\t\t\t: " + totIbu + ", dengan total tunjangan sebasar\t: Rp " + tunjIbu);
        //mencetak total ibu & total tunjangan untuk seluruh ibu
        System.out.println("Jumlah Anak Laki - Laki\t\t: " + totAnakL); //mencetak total anak laki-laki
        System.out.println("Jumlah Anak Perempuan\t\t: " + totAnakP);   //mencetak total anak perempuan
        System.out.println("Dengan total tunjangan anak sebesar\t: Rp " + tunjAnak);    //mencetak total tunjangan untuk seluruh anak
        System.out.println("\n\nTotal tunjangan untuk seluruh keluarga adalah :\t: Rp " + totTunj); //mencetak total tunjangan seluruhnya
    }

}
