/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.ContohKode.pkgwhile;

import java.util.Scanner;
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        int a=1, banyakCetak;
        
        Scanner s=new Scanner(System.in);
        
        System.out.print("Masukkan nama anda = ");
        nama = s.nextLine();
        System.out.print("Berapa kali nama anda harus dicetak = ");
        banyakCetak = s.nextInt();
        while (a<=banyakCetak) {
            System.out.println(nama);
            a++;
        }
    }
    
}
