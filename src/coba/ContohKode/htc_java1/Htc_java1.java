/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.ContohKode.htc_java1;

import java.util.Scanner;

/**
 *
 * @author Mella
 */
public class Htc_java1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("HTC Java");
//        int pelatihanJava1 = 1, pelatihanJava2 = 2;

        //fungsi perhitungan sederhana
//        System.out.println(pelatihanJava1);
//        pelatihanJava1+=pelatihanJava2;
//        pelatihanJava1%=2;
//        System.out.println(pelatihanJava1);
//        
        //fungsi boolean
//        boolean bJava = true;
//        boolean bJava1 = false;

        //fungsi if else
//        if (pelatihanJava1 < 4) {
//            System.out.println("Anda Lulus");
//        } else {
//            System.out.println("Anda Tidak Lulus");
//        }
        //fungsi if bersarang
//        if (pelatihanJava1 < 4 && (pelatihanJava1%2 == 0)) {
//            System.out.println("Lulus");
//        } else {
//            System.out.println("Tidak Lulus");
//        }
        //fungsi switch case
//        switch (pelatihanJava1) {
//            case 1:
//                System.out.println("Aku 1");
//                break;
//            case 2:
//                System.out.println("Aku 2");
//                break;
//            default:
//                throw new AssertionError();
//        }
        //fungsi perulangan for, while, dan do while
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }
//        
//        while (pelatihanJava1 < 10) {
//            System.out.println(pelatihanJava1);
//            pelatihanJava1++;
//        }
        int pil = 0;
        String j = "";
        System.out.println("Operator\n1. Telkomsel\n2. IM3\n3. Andry\n4. Dermawan\n5. Alvian");

        do {
            System.out.println("Masukkan pilihan Anda");
            pil = a.nextInt();
            switch (pil) {
                case 1:
                    System.out.println("Telkomsel");
                    break;
                case 2:
                    System.out.println("IM3");
                    break;
                case 3:
                    System.out.println("Andry");
                    break;
                case 4:
                    System.out.println("Dermawan");
                    break;
                case 5:
                    System.out.println("Alvian");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
            }
            System.out.println("Apakah anda ingin memilih lagi?\n1. Ya\n2. Tidak");
            j = a.next();
        } while ("ya".equalsIgnoreCase(j));
    }

}
