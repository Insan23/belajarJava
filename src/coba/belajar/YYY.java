package coba;

import java.util.Scanner;

public class YYY {
    static int nilai1 = 0;

    public static void main(String[] args) {
        int nilai, in;
        String[] soal = {"soal 1", "soal 2", "soal 3", "soal 4"};

        Scanner input = new Scanner(System.in);

        for (int i = 0;i < 4;i++) {
            System.out.println( (i+1) + " " + soal[i]);
            System.out.println("1. Ya\n2. Tidak");
            System.out.print("jawaban anda ");
            in = input.nextInt();
            cekJawaban(in);
        }
        System.out.println("skor = " + nilai1);
    }

    public static void cekJawaban(int jawaban) {
        if (jawaban == 1) {
            System.out.println("Benar");
            nilai1++;
        } else {
            System.out.println("Salah");
        }
    }
}