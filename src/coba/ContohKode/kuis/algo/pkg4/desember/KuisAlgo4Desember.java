/*SOAL
 Program pembayaran Konter Pulsa
 OUTPUT
 1. Beli Pulsa
  11. Telkomsel
  12. Three
  13. Indosat
  14. Axis
 2. Cek Saldo
  21. Telkomsel
  22. Three
  23. Indosat
  24. Axis
 3. Bayar
 0. Keluar

 dengan ketentuan
 1. menu akan diulang sesuai kemauan user
 2. pembelian pulsa minimal 5.000 dan maksimal 50.000
 3. bila total saldo lebih dari 50.000, maka akan dapat BONUS pulsa 10%
 4. bila setelah dapat BONUS total saldo lebih dari 100.000, maka akan dapat DISKON pembayaran sebesar 7%
 5. pembayaran pulsa dikenakan jumlah pulsa +1000
 6. pembayaran harus menggunakan UANG PAS
 */
package coba.ContohKode.kuis.algo.pkg4.desember;

import java.util.Scanner;

public class KuisAlgo4Desember {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        byte pil = 0;
        int pulsa[] = {0, 0, 0, 0}, biaya[] = {0, 0, 0, 0}, pulsaInp, totalBayar = 0, pembayaran;
        String operator[] = {"Telkomsel", "Three", "Indosat", "Axis"};

        do {
            System.out.println("============Pulsa Plus Plus============");
            System.out.print("1. Beli Pulsa\n2. Cek Saldo\n3. Bayar\n0. Keluar\nMasukkan Pilihan : ");
            pil = a.nextByte();
            switch (pil) {
                case 1:
                    System.out.println("\n\n\n<<<<<<<<<<<<<<<<<<>Pembelian Pulsa<>>>>>>>>>>>>>>>>>>");
                    System.out.print("11. Telkomsel\n12. Three\n13. Indosat\n14. Axis\n00. Kembali\nMasukkan Pilihan : ");
                    pil = a.nextByte();
                    switch (pil) {
                        case 11:
                            System.out.println("\n\n---------------------Telkomsel---------------------");
                            System.out.print("Masukkan Jumlah Pulsa yang Akan Dibeli : ");
                            pulsaInp = a.nextInt();
                            while (pulsaInp < 5000 || pulsaInp > 50000) {
                                System.err.println("\nPembelian pulsa minimal 5.000, dan maksimal 50.000");
                                System.out.print("Masukkan kembali jumlah pulsa yang akan dibeli : ");
                                pulsaInp = a.nextInt();
                            }
                            biaya[0] += (pulsaInp + 1000);
                            pulsa[0] += pulsaInp;
                            break;
                        case 12:
                            System.out.println("\n\n---------------------Three---------------------");
                            System.out.print("Masukkan Jumlah Pulsa yang Akan Dibeli : ");
                            pulsaInp = a.nextInt();
                            while (pulsaInp < 5000 || pulsaInp > 50000) {
                                System.err.println("\nPembelian pulsa minimal 5.000, dan maksimal 50.000");
                                System.out.print("Masukkan kembali jumlah pulsa yang akan dibeli : ");
                                pulsaInp = a.nextInt();
                            }
                            biaya[1] += (pulsaInp + 1000);
                            pulsa[1] += pulsaInp;
                            break;
                        case 13:
                            System.out.println("\n\n---------------------Indosat---------------------");
                            System.out.print("Masukkan Jumlah Pulsa yang Akan Dibeli : ");
                            pulsaInp = a.nextInt();
                            while (pulsaInp < 5000 || pulsaInp > 50000) {
                                System.err.println("\nPembelian pulsa minimal 5.000, dan maksimal 50.000");
                                System.out.print("Masukkan kembali jumlah pulsa yang akan dibeli : ");
                                pulsaInp = a.nextInt();
                            }
                            biaya[2] += (pulsaInp + 1000);
                            pulsa[2] += pulsaInp;
                            break;
                        case 14:
                            System.out.println("\n\n---------------------Axis---------------------");
                            System.out.print("Masukkan Jumlah Pulsa yang Akan Dibeli : ");
                            pulsaInp = a.nextInt();
                            while (pulsaInp < 5000 || pulsaInp > 50000) {
                                System.err.println("\nPembelian pulsa minimal 5.000, dan maksimal 50.000");
                                System.out.print("Masukkan kembali jumlah pulsa yang akan dibeli : ");
                                pulsaInp = a.nextInt();
                            }
                            biaya[3] += (pulsaInp + 1000);
                            pulsa[3] += pulsaInp;
                            break;
                        case 00:
                            break;
                        default:
                            System.out.println("\n\nPilihan Tidak Tersedia!!!!");
                    }
                    break;
                case 2:
                    System.out.println("\n\n<<<<<<<<<<<<<<<<<<>Cek Saldo<>>>>>>>>>>>>>>>>>>");
                    System.out.print("21. Telkomsel\n22. Three\n23. Indosat\n24. Axis\nMasukkan Pilihan : ");
                    pil = a.nextByte();
                    switch (pil) {
                        case 21:
                            System.out.println("\n\n---------------------Telkomsel---------------------");
                            System.out.println("Saldo anda saat ini adalah : " + pulsa[0]);
                            break;
                        case 22:
                            System.out.println("\n\n---------------------Three---------------------");
                            System.out.println("Saldo anda saat ini adalah : " + pulsa[1]);
                            break;
                        case 23:
                            System.out.println("\n\n---------------------Indosat---------------------");
                            System.out.println("Saldo anda saat ini adalah : " + pulsa[2]);
                            break;
                        case 24:
                            System.out.println("\n\n---------------------Axis---------------------");
                            System.out.println("Saldo anda saat ini adalah : " + pulsa[3]);
                            break;
                        default:
                            System.out.println("\n\nPilihan Tidak Tersedia!!!!");
                    }
                    break;
                case 3:
                    for (int i = 0; i < 4; i++) {
                        if (pulsa[i] > 50000) {
                            pulsa[i] += (pulsa[i] * 0.1);
                        }
                        if (pulsa[i] > 100000) {
                            biaya[i] -= (biaya[i] * 0.07);
                        }
                    }
                    for (int i = 0; i < 4; i++) {
                        totalBayar += biaya[i];
                    }
                    System.out.println("\n\n\n<<<<<<<<<<<<<<<<<<>Transaksi Pembayaran<>>>>>>>>>>>>>>>>>>");
                    System.out.println("Total saldo anda saat ini adalah : ");
                    for (int i = 0; i < 4; i++) {
                        System.out.println(operator[i] + " : " + pulsa[i]);
                    }
                    System.out.println("Total pembayaran saat ini adalah : " + totalBayar);
                    System.out.print("Masukkan uang pembayaran anda : ");
                    pembayaran = a.nextInt();
                    while (pembayaran != totalBayar) {
                        System.err.println("\nPembayaran harus menggunakan uang pas");
                        System.out.print("Masukkan uang pembayaran kembali : ");
                        pembayaran = a.nextInt();
                    }
                    for (int i = 0; i < 4; i++) {
                        pulsa[i] = 0;
                        biaya[i] = 0;
                    }
                    totalBayar = 0;
                    System.out.println("\n\nTerima Kasih Telah Menggunakan Layanan Kami\nSilahkan Transaksi Berikutnya");
                    break;
                case 0:
                    System.out.println("Terima Kasih Telah Menggunakan Layanan Kami");
                    break;
                default:
                    System.out.println("\n\n\nPilihan Tidak Tersedia!!!!");
            }
        } while (pil != 0);
    }

}
