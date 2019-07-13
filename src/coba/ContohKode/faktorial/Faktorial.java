package coba.ContohKode.faktorial;

import java.util.Scanner;

public class Faktorial {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Long angka, i, total = 1L;
        
        System.out.println("================Penghitung Faktorial================");
        System.out.print("Masukkan Angka Sembarang : ");
        angka = a.nextLong();
        
        for (i = angka; i > 0; i--) {
            System.out.print(i + ", ");
            total *= i;
        }
        System.out.println("\n\nFaktorial dari " + angka + " adalah " + total);
    }
    
}
