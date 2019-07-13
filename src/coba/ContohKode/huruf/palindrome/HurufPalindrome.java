package coba.ContohKode.huruf.palindrome;

import java.util.Scanner;

public class HurufPalindrome {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String kata, lawan = "";
        System.out.println("<=Kata Palindrom=>");
        System.out.print("Masukkan kata : ");
        kata = a.nextLine();
        for (int i = (kata.length())-1; i >= 0; i--) {
            lawan += kata.charAt(i);
        }
        if (kata.equalsIgnoreCase(lawan)) {
            System.out.println("Kata " +kata+ " termasuk palindrom");
        } else {
            System.out.println("Kata " +kata+ " bukan termasuk palindrom");
        }
    }
    
}
