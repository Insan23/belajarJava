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
public class lingkaran extends bangunDatar {    //deklarasi class lingkaran, dengan menggunakan extends untuk emnjadikannya subclass dari bangunDatar
    double r;   //deklarasi atribut class
    
    public lingkaran ( String warna, double r) {    //deklarasi method konstruktor
        super(warna);   //mengambil atribut warna dari superclass
        this.r = r;
    }

    @Override   //digunakan untuk meng override atau mengambil alih fungsi dari superclass
    public double hitungLuas() {    //deklarasi method untuk menghitung luas lingkaran
        double luas = 3.14 * r * r; //rumus menghitung luas lingkaran
        return luas;                //mengembalkan nilai luas
    }
    
    @Override   //sama seperti method sebelumnya
    public double hitungKeliling() {    //deklarasi method untuk menghitung keliling lingkaran
        double luas = 3.14 * 2 * r;     //rumus untuk menghitung keliling lngkaran
        return luas;                    //mengembalikan nilai keliling
    }
    
    
    
}
