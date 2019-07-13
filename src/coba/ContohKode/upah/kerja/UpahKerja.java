/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.ContohKode.upah.kerja;

import java.util.Scanner;
public class UpahKerja {

    
    public static void main(String[] args) {
        int upah=10000, upahPlus=5000, upahTotal, jamKerja, jumlahKerja;
        //String nama, nim;
        
        Scanner ss=new Scanner(System.in);
        
        System.out.print("Lama jam kerja\t\t: ");
        jamKerja=ss.nextInt();
        System.out.print("Jumlah pekerjaan yang dikerjakan\t: ");
        jumlahKerja=ss.nextInt();
        if (jumlahKerja > 
                1) {
            upahTotal=jumlahKerja*jamKerja*(upah+upahPlus);
        } else {
            upahTotal=jamKerja*upah;
        }
        System.out.print("==============================");
        System.out.print("Nama\t\t: Ahmad Fauzil");
        System.out.print("NIM\t\t: 142410101080");
        System.out.print("Total upah yang didapat\t: "+upahTotal);
        System.out.print("==============================");
    }
    
}
