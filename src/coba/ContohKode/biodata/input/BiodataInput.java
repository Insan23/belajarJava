/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.ContohKode.biodata.input;
/**
 *
 * @author Aleq Insan
 */
import java.util.Scanner;
//untuk menggunakan scanner class
public class BiodataInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        String nama, namaLengkap, nim, t_lahir, tmp_lahir, alamat, agama, gol_darah;
        //deklarasi variabel
        
        Scanner userInputScanner = new Scanner(System.in);
        
        System.out.print("Masukkan Biodata Anda dibawah ini\n");
        
        System.out.print("Nama Lengkap Anda\t=");
        namaLengkap = userInputScanner.nextLine();
        
        System.out.print("Nama Panggilan Anda\t=");
        nama = userInputScanner.nextLine();
        
        System.out.print("NIM Anda\t=");
        nim = userInputScanner.nextLine();
        
        System.out.print("Tempat Lahir Anda\t=");
        tmp_lahir = userInputScanner.nextLine();
        
        System.out.print("Tanggal Lahir Anda\t=");
        t_lahir = userInputScanner.nextLine();
        
        System.out.print("Alamat Anda\t=");
        alamat = userInputScanner.nextLine();
        
        System.out.print("Agama Anda\t=");
        agama = userInputScanner.nextLine();
        
        System.out.print("Golongan Darah Anda\t=");
        gol_darah = userInputScanner.nextLine();
        
        System.out.println("\t\t\t\tBiodata "+nama);
        System.out.println("Nama\t= "+namaLengkap);
        System.out.println("NIM\t= "+nim);
        System.out.println("Tempat Tanggal Lahir\t= "+tmp_lahir+","+t_lahir);
        System.out.println("Alamat\t= "+alamat);
        System.out.println("Agama\t= "+agama);
        System.out.println("Golongan Darah\t= "+gol_darah);
    }
    
}
