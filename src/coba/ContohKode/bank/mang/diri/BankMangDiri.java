package coba.ContohKode.bank.mang.diri;

import java.util.Scanner;

public class BankMangDiri {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Byte pilihan, i = 1, j = 3;
        int PIN, PINlama, PINbaru, PINinp;

        System.out.print("Buat PIN baru : ");
        PIN = in.nextInt();
        PINlama = PIN;

        System.out.print("Masukkan PIN anda untuk melanjutkan : ");
        PINinp = in.nextInt();
        while (PINinp != PIN) {
            if (i == 4) {
                System.out.println("\n\nKesalahan memasukkan PIN sebanyak 4 kali\nAnda Tidak Diperbolehkan Lagi Memasukkan PIN");
                System.exit(0);
            }
            if (i >= 1 && i <= 3) {
                System.out.println("\n" + j + " kesempatan lagi untuk dapat memasukkan PIN");
            }
            System.out.println("\nPIN salah !!!");
            System.out.print("Masukkan PIN anda untuk melanjutkan : ");
            PINinp = in.nextInt();
            i++;
            j--;

        }

        do {
            System.out.println("\n================Selamat Datang================");
            System.out.println("1. Cek Saldo\n2. Ganti PIN\n3. Lihat PIN\n4. Keluar");
            System.out.print("Pilhan anda : ");
            pilihan = in.nextByte();
            switch (pilihan) {
                case 1:
                    System.out.println("\n================Cek Saldo================");
                    System.out.println("saldo anda saat ini adalah sekian Miliar Rupiah");
                    break;
                case 2:
                    i = 1;
                    j = 3;
                    System.out.println("\n================Mengganti PIN================");
                    System.out.print("Masukkan PIN anda saat ini : ");
                    PINinp = in.nextInt();
                    while (PINinp != PIN) {
                        if (i == 4) {
                            System.out.println("\n\nKesalahan memasukkan PIN sebanyak 4 kali\nAnda Tidak Diperbolehkan Mengganti PIN");
                            System.exit(0);
                        }
                        if (i >= 1 && i <= 3) {
                            System.out.println("\n" + j + " kesempatan lagi untuk dapat memasukkan PIN");
                        }
                        System.out.println("PIN salah!!!");
                        System.out.print("Masukkan PIN anda saat ini : ");
                        PINinp = in.nextInt();
                        i++;
                        j--;
                    }
                    System.out.print("Masukkan PIN baru : ");
                    PINbaru = in.nextInt();
                    System.out.println("Apakah anda yakin ingin mengganti PIN anda?"
                            + "\n1. Ya\n2. Tidak");
                    pilihan = in.nextByte();
                    switch (pilihan) {
                        case 1:
                            System.out.println("PIN baru berhasil disimpan");
                            PIN = PINbaru;
                            PINlama = PINbaru;
                            break;
                        case 2:
                            System.out.println("PIN baru tidak disimpan");
                            PIN = PINlama;
                            break;
                        default:
                            System.out.println("Pilihan Invalid!!!");
                    }
                    break;
                case 3:
                    System.out.println("\n================Lihat PIN================");
                    System.out.println("PIN anda saat ini adalah : " + PIN);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Pilihan Invalid!!!");
            }
        } while (pilihan != 4);
        System.out.println("Terima Kasih Telah Menggunakan Layanan Kami");
    }
    
}
