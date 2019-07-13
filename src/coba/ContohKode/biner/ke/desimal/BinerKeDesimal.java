package coba.ContohKode.biner.ke.desimal;

import java.util.Scanner;

public class BinerKeDesimal {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Masukkan Angka Biner : ");
        String biner = a.nextLine();
        int desimal = Integer.parseInt(biner, 2);
        System.out.println("\nAngka Desimalnya adalah : " + desimal);
    }
    
}
