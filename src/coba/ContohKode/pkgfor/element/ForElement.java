package coba.ContohKode.pkgfor.element;

import java.util.Scanner;

public class ForElement {
    
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String nama[] = new String[5];
        System.out.println("Masukkan 5 nama :");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nama ke " + (i+1) + " : ");
            nama[i] = a.nextLine();
        }
        System.out.println("\n\nMenampilkan 5 nama");
        for (String nama1 : nama) {
            System.out.println(nama1);
        }
    }
    
}
