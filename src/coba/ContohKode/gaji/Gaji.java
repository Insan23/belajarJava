/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.ContohKode.gaji;

/**
 *
 * @author Aleq Insan
 */
import java.util.Scanner;
public class Gaji {
    public static void main(String[] args) {
        int upah=10000, upahPlus=5000, upahTotal, jamKerja, jumlahKerja;
        /*deklarasi variable untuk upah perjam, upah kerja ganda,
         *lamanya jam kerja, dan jumlah pekerjaan yang dikerjakan
         */
        Scanner ss=new Scanner(System.in);
        //menggunakan scanner untuk memasukkan jumlah jam kerja, dan jumlah pekerjaan
        System.out.print("Lama jam kerja\t\t: "); //masukkan lama jam kerja disini
        jamKerja=ss.nextInt();
        System.out.print("Jumlah pekerjaan yang dikerjakan\t: "); //masukkan jumlah pekerjaan yang dilakukan
        jumlahKerja=ss.nextInt();
        if (jumlahKerja >  1) { //untuk memnetukan apakah melakuka kerja ganda atau tidak
            upahTotal=jumlahKerja*jamKerja*(upah+upahPlus);
        } else {
            upahTotal=jamKerja*upah;
        }
        //cetak nama, NIM, dan jumlah total upah kerja
        System.out.println("==============================");
        System.out.println("Nama\t\t: Ahmad Fauzil");
        System.out.println("NIM\t\t: 142410101080");
        System.out.println("Total upah yang didapat\t: "+upahTotal);
        System.out.println("==============================");
    }
    
}
