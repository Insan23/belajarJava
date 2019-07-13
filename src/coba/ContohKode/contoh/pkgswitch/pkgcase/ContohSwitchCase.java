package coba.ContohKode.contoh.pkgswitch.pkgcase;

import java.util.Scanner;

public class ContohSwitchCase {

    public static void main(String[] args) {
        //ini adalah contoh penggunaan switch case & break dalam java
        Byte pilihan;
        int nomor, pulsa;
        String kode;
        Scanner cas = new Scanner(System.in);
        System.out.println("=======================Pulsa=======================");
        System.out.println("1. Cek pulsa\n"
                + "2. Isi pulsa\n"
                + "3. Info Pulsa\n"
                + "4. Cek Kuota");
        System.out.print("masukkan pilihan anda : ");
        pilihan = cas.nextByte();
        switch (pilihan) {
            case 1:
                System.out.println("\n=================Cek Pulsa=================");
                System.out.println("Pulsa anda saat ini adalah xxx.xxx.xxx\nAktif s/d xx-xx-xxxx\nTenggang s/d xx-xx-xxxx");
                break;
            case 2:
                System.out.println("\n=================Isi Pulsa=================");
                System.out.println("1. Isi Pulsa\n2. Transfer Pulsa\n3. Isi Pulsa Teman");
                System.out.print("Masukkan Pilihan Anda : ");
                pilihan = cas.nextByte();
                switch (pilihan) {
                    case 1:
                        System.out.println("\n=================Isi Pulsa=================");
                        System.out.print("Masukkan Nomor Anda : ");
                        nomor = cas.nextInt();
                        System.out.print("Masukkan Kode Voucher : ");
                        kode = cas.next();
                        System.out.println("\nTerima kasih telah menggunakan layanan Isi Pulsa\nKami akan memproses permintaan anda");
                        break;
                    case 2:
                        System.out.println("\n=================Transfer Pulsa=================");
                        System.out.print("Masukkan Nomor Tujuan : ");
                        nomor = cas.nextInt();
                        System.out.print("Masukkan jumlah pulsa yang akan di transfer : ");
                        pulsa = cas.nextInt();
                        System.out.print("Anda akan melakukan transfer pulsa ke nomor" + nomor + "sejumlah" + pulsa + ""
                                + "\nAnda akan dikenakan biaya Rp 1000\nAnda yakin ingin melanjutka?\n1. Ya\n2. Tidak");
                        pilihan = cas.nextByte();
                        switch (pilihan) {
                            case 1:
                                System.out.println("Terima Kasih\nKami akan memproses permintaan anda");
                                break;
                            case 2:
                                System.out.println("Terima Kasih Telah Menggunakan Layanan Kami");
                                break;
                        }
                        break;
                }
                break;
            case 3:
                System.out.println("\n=================Info Pulsa=================");
                System.out.println("Pulsa anda xxx.xxx.xxx\nBonus pulsa harian 0\nBonus SMS harian sesama 0 SMS, ke semua 0 SMS"
                        + "\nBonus telepon ke semua 0 menit, Telepon ke sesama 0 menit");
                break;
            case 4:
                System.out.println("\n=================Cek Kuota=================");
                System.out.println("1. Kuota Data\n2. Kuota Harian\n3. Kuota Malam");
                System.out.print("Masukkan pilihan anda : ");
                pilihan = cas.nextByte();
                switch (pilihan) {
                    case 1:
                        System.out.println("\n=================Kuota Data=================");
                        System.out.println("Sisa kuota anda xx GB, aktif s/d xx-xx-xxxx");
                        break;
                    case 2:
                        System.out.println("\n=================Kuota Harian=================");
                        System.out.println("Sisa kuota anda adalah xx GB, aktif s/d pukul 23.59 xx-xx-xxxx");
                        break;
                    case 3:
                        System.out.println("\n=================Kuota Malam=================");
                        System.out.println("Sisa kuota malam anda adalah xx GB, aktif s/d xx-xx-xxxx");
                        break;
                }
                break;
        }
    }

}
