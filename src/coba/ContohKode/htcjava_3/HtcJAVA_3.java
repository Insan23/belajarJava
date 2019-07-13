/*HTC JAVA 3
 *Method, Class, Object, Searching
 *Searching ditunda minggu depan, waktu berkata lain :D
 *
 */
package coba.ContohKode.htcjava_3;

import java.util.*;

public class HtcJAVA_3 {
    
    public static void main(String[] args) {
        manusia saya = new manusia(); //membuat objek baru dari class manusia
        saya.setNama("Aleq"); //dalam class manusia.java, terdapat fungsi setnama, atau mengganti nama
        saya.info(); //
        System.out.println(saya.getNama());

        HtcJAVA_3.penjumlahan(); //menggunakan class untuk memanggil suatu objek di dalam class itu sendiri
    }

    //dibawah ini ada 3 method, dengan tipe void, atau tanpa nilai kembali, tipe void hanya menjalankan seluruh perintah dalam method tersebut
    //3 method diawah yang memiliki nama method yang sama, tetapi mempunyai parameter yang berbeda
    //itu disebut dengan overloading
    public static void penjumlahan() {
        int hasil, a = 1, b = 2;
        hasil = a + b;
        System.out.println("Hasilnya : " + hasil);
    }

    public static void penjumlahan(int a) {
        int hasil, b = 2;
        hasil = a + b;
        System.out.println("Hasilnya : " + hasil);
    }

    public static void penjumlahan(int a, int b) {
        int hasil = a + b;
        System.out.println("Hasilnya : " + hasil);
    }

    //dibawah ini terdapat 3 method yang menggunakan tipe kembalian non-void, yaitu tiap proses dari method akan menghasilkan nilai kembali
    //HANYA nilai akhir dari proses yang terjadi dalam method non-void, bukan seluruh baris dalam method yang akan dikembalikan
    public static int jumlah() {
        int hasil, a = 2, b = 3;
        hasil = a + b;
        return hasil;
    }

    public static int jumlah(int a, int b) {
        int hasil;
        hasil = a + b;
        return hasil;
    }

    public static String jumlah(String a, String b) {
        String tambah = a + b;
        return tambah;
    }

}
