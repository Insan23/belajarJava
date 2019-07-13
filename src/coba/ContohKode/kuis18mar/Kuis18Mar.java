package coba.ContohKode.kuis18mar;
import java.util.*;
public class Kuis18Mar {

    public static void main(String[] args) {
        inputMatriks();
    }
    public static int[][] buatMatriks() {
        Scanner a = new Scanner(System.in);
        System.out.print("Masukkan panjang baris : ");
        int baris = a.nextInt();
        System.out.print("Masukkan panjang kolom : ");
        int kolom = a.nextInt();
        int matriks[][] = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            System.out.println("baris ke " + (i+1));
            for (int j = 0; j < kolom; j++) {
                System.out.println("kolomke " + (j+1));
                matriks[i][j] = a.nextInt();
            }
        }
        return matriks;
    }
    public static int[][] hitungMatriks(int data1[][], int data2[][]) {
        int data[][] = new int[data1.length][data1[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                data[i][j] = data1[i][j] + data2[i][j];
            }
        }
        return data;
    }
    public static void tampilkanMatriks(int data[][]) {
        System.out.println("Hasil matriks :");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("\t" + data[i][j]);
            }
            System.out.println("");
        }
    }
    public static void inputMatriks() {
        System.out.println("Matriks ke 1");
        int matriks1[][] = buatMatriks();
        System.out.println("Matriks ke 2");
        int matriks2[][] = buatMatriks();
        int hasilMatriks[][] = hitungMatriks(matriks1, matriks2);
        tampilkanMatriks(hasilMatriks);
    }
}
