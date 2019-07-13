package coba.ContohKode.kata.palindrom;

import java.util.Scanner;

public class KataPalindrom {
    
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        String ka = "", kb = "";
        System.out.println("CEK PALINDROM");
        System.out.print("masukkan sembarang kata : ");
        ka = f.nextLine();
        for (int i = (ka.length())-1; i >= 0; i--) {
            kb += ka.charAt(i);
        }
        if (ka.equals(kb)) {
            System.out.println("palindrom");
        } else {
            System.out.println("bukan palindrom");
        }
    }
    
}
