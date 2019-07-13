package coba.ContohKode.algoritma.penentu.bil.prima;

import java.util.Scanner;

public class AlgoritmaPenentuBilPrima {

    public static void main(String[] args) {
        // TODO code application logic here
        //deklarasi fungsi scanner
        Scanner prima = new Scanner(System.in);
        
        //memulai input angka sembarang untuk ditentukan
        System.out.println("Algoritma untuk menentukan suatu bilangan\nmerupakan bilangan prima atau bukan\n");
        System.out.println("Bilangan prima adalah bilangan yang tidak\nhabis bersisa jika dibagi dengan angka berapapun\n");
        System.out.print("Masukkan angka sembarang = ");
        int angka = prima.nextInt();    //input untuk sebarang angka

        /*memulai algoritma penentu bilangan prima
        *angka yang diinputkan akan dibagi oleh serangkaian angka utama pembagi
        *yang dapat menghasilkan sisa nol
        */
        if ((angka % 2) != 0) {
            if ((angka % 3) != 0) {
                if ((angka % 4) != 0) {
                    if ((angka % 5) != 0) {
                        if ((angka % 6) != 0) {
                            if ((angka % 7) != 0) {
                                if ((angka % 8) != 0) {
                                    if ((angka % 9) != 0) {
                                        System.out.println("Angka " + angka + " adalah bilangan prima");
                                    } else {
                                        System.out.println("Angka " + angka + " bukanlah bilangan prima");
                                    }
                                } else {
                                    System.out.println("Angka " + angka + " bukanlah bilangan prima");
                                }
                            } else {
                                System.out.println("Angka " + angka + " bukanlah bilangan prima");
                            }
                        } else {
                            System.out.println("Angka " + angka + " bukanlah bilangan prima");
                        }
                    } else {
                        System.out.println("Angka " + angka + " bukanlah bilangan prima");
                    }
                } else {
                    System.out.println("Angka " + angka + " bukanlah bilangan prima");
                }
            } else {
                System.out.println("Angka " + angka + " bukanlah bilangan prima");
            }
        } else {
            System.out.println("Angka " + angka + " bukanlah bilangan prima");
        }
    }

}
