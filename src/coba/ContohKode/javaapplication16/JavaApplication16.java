/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.ContohKode.javaapplication16;

import java.util.Scanner;

/**
 *
 * @author Aleq
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int luasPermukaan;
        int sisi;
        System.out.println("Masukkan Sisi");
        sisi = inputan.nextInt();
        if (sisi == 0) {
            sisi = 2;
            System.out.println("sisi =" + sisi);
            luasPermukaan = 6 * sisi * sisi;
            System.out.println(luasPermukaan);
        } else if (sisi % 2 == 0) {
            sisi = 4;
            System.out.println("sisi =" + sisi);
            luasPermukaan = 6 * sisi * sisi;
            System.out.println(luasPermukaan);
        } else if (sisi % 2 == 1) {
            sisi = 5;
            System.out.println("sisi =" + sisi);
            luasPermukaan = 6 * sisi * sisi;
            System.out.println(luasPermukaan);
        } else {
            System.out.println("inputan tidak valid");
        }
    }

}
