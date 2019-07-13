package coba.ContohKode.htcjava_2;

import java.util.*;

public class HtcJAVA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
//        int coba1[] = {1,2,3,4,5,6,7,8,9,0};
//        //mencetak panjang dari array 'coba1'
//        System.out.println(coba1.length);
//        for (int i = 0; i < coba1.length; i++) {
//            if (coba1[i]%2==0) {
//                System.out.println("Angka Genap");
//            } else {
//                System.out.println("Angka Ganjil");
//            }
//        }
        
        //penggunaan array, dan Integer.parseInt
//        String nilaiMhs[][];
//        int jumlah;
//        System.out.print("Masukkan jumlah mahasiswa : ");
//        jumlah = a.nextInt();
//        nilaiMhs = new String[jumlah][2];
//        for (int i = 0; i < nilaiMhs.length; i++) {
//            System.out.println("\nMahasiswa ke " + (i+1));
//            System.out.print("Masukkan nama :");
//            nilaiMhs[i][0] = a.next();
//            System.out.print("Masukkan nilai : ");
//            nilaiMhs[i][1] = a.next();
//        }
//        System.out.println("-------------------");
//        for (int i = 0; i < nilaiMhs.length; i++) {
//            System.out.println("Nama Mahasiswa : " + nilaiMhs[i][0]);
//            System.out.print("Nilai : ");
//            if (((Integer.parseInt(nilaiMhs[i][1])) >=90) && (Integer.parseInt(nilaiMhs[i][1])) <=100) {
//                System.out.println("A");
//            } else if (((Integer.parseInt(nilaiMhs[i][1])) >=80) && (Integer.parseInt(nilaiMhs[i][1])) <=89) {
//                System.out.println("B");
//            } else if (((Integer.parseInt(nilaiMhs[i][1])) >=70) && (Integer.parseInt(nilaiMhs[i][1])) <=79) {
//                System.out.println("C");
//            } else if (((Integer.parseInt(nilaiMhs[i][1])) >=70) && (Integer.parseInt(nilaiMhs[i][1])) <=69) {
//                System.out.println("D");
//            } else {
//                System.out.println("E");
//            }
//        }

        
        //penggunaan Split
//        String[] tesSplit = "Nama Saya Tanda Tanya".split(" ");

        //Casting yaitu konversi dari nilai variabel angka dalam String menjadi Nilai dalam integer, float, double, byte, long
//        String tesCasting = "8";
//        int jadiInteger = Integer.parseInt(tesCasting);
//        System.out.println("String ke Integer : " + jadiInteger);
//        Long jadiLong = Long.parseLong(tesCasting);
//        System.out.println("String ke Long : " + jadiLong);
//        double jadiDouble = Double.parseDouble(tesCasting);
//        System.out.println("String ke Double : " + jadiDouble);
//        float jadiFloat = Float.parseFloat(tesCasting);
//        System.out.println("String ke Float : " + jadiFloat);
//        byte jadiByte = Byte.parseByte(tesCasting);
//        System.out.println("String ke Byte : " + jadiByte);

        //soal
        String buah[] = new String[15], search;
        for (int i = 0; i < 15; i++) {
            System.out.print("Masukkan nama buah ke " + (i+1) + " : ");
            buah[i] = a.nextLine();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Buah ke " + (i+1) + " : " + buah[i]);
        }
        System.out.println("Dengan menggunakan Arrays to string");
        System.out.println(Arrays.toString(buah));
        System.out.print("\nMasukkan jenis buah : ");
        search = a.next();
        for (int i = 0; i < 10; i++) {
            if (search.equalsIgnoreCase(buah[i])) {
                System.out.println("Buah " + search + " ditemukan pada nomor ke " + i);
            }
        }
    }

}
