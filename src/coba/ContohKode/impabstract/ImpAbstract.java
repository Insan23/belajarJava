/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.ContohKode.impabstract;

/**
 *
 * @author Aleq
 */
public class ImpAbstract {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bangunDatar bt = new bangunDatar("blink") {
            double p, l;
            @Override
            public double hitungLuas() {
                double luas = p * l;
                return luas;
            }

            @Override
            public double hitungKeliling() {
                double keliling = 2 * (p + l);
                return 0;
            }
        };
        
        lingkaran lk1 = new lingkaran("oranye", 5);     //deklarasi objek lingkaran 1
        lingkaran lk2 = new lingkaran("oranye", 5);     //deklarasi objek lingkaran 1
        
        System.out.println("Warna lingkaran 1 : " + lk1.getWarna());            //menampilkan warna dari lingkaran 1 menggunakan method getWarna
        System.out.println("Luas lingkaran 1 : " + lk1.hitungLuas());           //menampilkan luas lingkaran 1 menggunakan method hitungLuas
        System.out.println("Keliling lingkaran 1 : " + lk1.hitungKeliling());   //menampilkan kelilng lingkaran 1 menggunakan method hitungKeliling
        
        System.out.println("Warna lingkaran 1 : " + lk2.getWarna());            //menampilkan warna dari lingkaran 1 menggunakan method getWarna
        System.out.println("Luas lingkaran 1 : " + lk2.hitungLuas());           //menampilkan luas lingkaran 1 menggunakan method hitungLuas
        System.out.println("Keliling lingkaran 1 : " + lk2.hitungKeliling());   //menampilkan kelilng lingkaran 1 menggunakan method hitungKeliling
    }

}
