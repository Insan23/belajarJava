package coba.ContohKode.cetak.nama;

public class CetakNama {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 11; j++) {
                if ((i == 1 && j == 5) || (i == 1 && j == 6) || (i == 2 && j >= 4 && j <= 7) || (i == 3 && j == 3) || (i == 3 && j == 4) || (i == 3 && j == 7) || (i == 3 && j == 8) || (i == 4 && j == 2) || (i == 4 && j == 3) || (i == 4 && j == 8) || (i == 4 && j == 9) || (i == 5 && j == 1) || (i == 5 && j == 2) || (i == 5 && j == 9) || (i == 5 && j == 10) || (i == 6 && j == 1) || (i == 6 && j == 2) || (i == 6 && j == 9) || (i == 6 && j == 10) || (i == 7 && j >= 1 && j <= 10) || ((i == 8 && j >= 1 && j <= 10)) || ((i >= 9 && i <= 11) && (j == 1 || j == 2 || j == 9 || j == 10))) {
                    System.out.print("A");
                } else if (((i>=1) && (j>=1 && j<=4)) || (i>=1 && (j>=7 && j<=10)) || (i==3 && (j>=1 && j<=3))) {
                    System.out.print(" ");
                } else {
                    
                }
            }
            System.out.println("");
        }
    }
}
