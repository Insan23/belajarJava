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
public class persegi extends bangunDatar{
    double p, l;
    
    public persegi(String warna, double p, double l){
        super(warna);   //mengambil atribut milik superclass
        this.p = p;
        this.l = l;
    }
    
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
}

