package coba.ContohKode.bubblesort;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Masukkan banyak angka : ");
        int jml = a.nextInt();
        int data[] = new int[jml];
        System.out.println("Masukkan data angka : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print("data ke " + (i + 1) + " : ");
            data[i] = a.nextInt();
        }
        int swap;
        //fungsi sort dari rendah ke tinggi
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < (data.length - i - 1); j++) {
                if (data[j] > data[j + 1]) {
                    swap = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = swap;
                }
            }
        }
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

}
