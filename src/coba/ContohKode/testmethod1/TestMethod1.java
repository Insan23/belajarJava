package coba.ContohKode.testmethod1;

import java.util.Scanner;

public class TestMethod1 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
//        String nama1 = "Budi";
//        String nim1 = "12231010143";
//        String telp1 = "08123222353";
        
//        String nama2 = "Jarwo";
//        String nim2 = "12231010144";
//        String telp2= "085692042546";
//        
//        System.out.println("Hai, namaku "+nama1);
//        System.out.println("NIM         "+nim1);
//        System.out.println("Telepon     "+telp1);
//        
//        System.out.println("Hai, namaku "+nama2);
//        System.out.println("NIM         "+nim2);
//        System.out.println("Telepon     "+telp2);
        
        
        //cetakNama("Hasan", "12121212", "0856735274");
        //cetakNama("Anton", "121313e12", "54254252");
        
//        int hasil = Min(100, 200);
//        System.out.println(hasil);
//        System.out.println(Min(10, 9));
//        
//        tanpaParameter();
//        double n = LuasPersegiPanjang(13,15);
//        System.out.println(n);
//        
//        String[]contoharray = {"satu","dua","tiga","empat"};
//        
//        cetakIsiArray(contoharray);
//        
//        carinextbulan(3, 1000);
//        jumlahpecahan(1, 4, 1, 4);
        

        int mhs[][] = new int[6][3];
        System.out.println("Rata-Rata Nilai");
        
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Mahasiswa " + (i+1));
            for (int j = 0; j < mhs[i].length; j++) {
                System.out.print("nilai " + (j+1) + " : ");
                mhs[i][j] = a.nextInt();
            }
        }
        
        System.out.println("\n\nNilai :");
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Mahasiswa " + (i+1));
            System.out.println(rata(mhs, i));
        }
        
    }
    public static int rata(int nil[][], int indeksmhs) {
        int rat = 0;
            rat = (nil[indeksmhs][0] + nil[indeksmhs][1] + nil[indeksmhs][2])/3;
        return rat;
    }
    
//    public static void cetakNama(String nama, String nim, String telp){
//        System.out.println("Hai, namaku "+nama);
//        System.out.println("NIM         "+nim);
//        System.out.println("Telepon     "+telp);
//    }
//    
//    public static int Min(int n1, int n2){
//        int minimum;
//        if(n1>n2){
//            minimum = n2;
//        }else{
//            minimum = n1;
//        }
//        return minimum;
//    }
//    
//    public static void tanpaParameter(){
//        System.out.println("method tanpa parameter");
//    }
//    
//    public static double average(double n1, double n2, double n3 ) {
//        double average = (n1 + n2 + n3)/3;
//        return average;
//    }
//    public static double LuasPersegiPanjang(double n1, double n2 ) {
//       return n1 * n2;
//    }
//    
//    public static void cetakIsiArray(String[] a){
//        for(int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }
//    }
//    
//    public static void carinextbulan(int bulanasal, int nbulan){
//        int hasil = (bulanasal+nbulan)%12;
//        System.out.println(nbulan+" setelah bulan "+bulanasal+" adalah "+hasil);
//    }
//    
//    public static void jumlahpecahan(double a, double b, double c, double d){
//        double hasil;
//        hasil = ((a*d)+(c*b))/(b*d);
//        System.out.println(hasil);
//    }

}
