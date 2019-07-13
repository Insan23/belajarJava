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
public abstract class bangunDatar {

    String warna;

    public bangunDatar(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    public abstract double hitungLuas();

    public abstract double hitungKeliling();

}
