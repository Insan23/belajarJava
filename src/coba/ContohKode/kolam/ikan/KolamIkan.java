package coba.ContohKode.kolam.ikan;

import java.util.Scanner;

public class KolamIkan {

    public static void main(String[] args) {
        int kolam, jantan, betina, kecil = 0, totJantan = 0, totBetina = 0, totKecil = 0, hargaDewasa, hargaKecil;
        Scanner ikan = new Scanner(System.in);

        System.out.println("====================Program Penghitung Ikan Budidaya====================");
        do {
            System.out.print("Masukkan jumlah kolam : ");
            kolam = ikan.nextInt();
        } while (kolam == 0);
        for (int i = 1; i <= kolam; i++) {
            System.out.println("\n\n\nKolam ke " + i);
            do {
                System.out.print("\nMasukkan jumlah ikan jantan : ");
                jantan = ikan.nextInt();
            } while (jantan == 0);
            do {
                System.out.print("Masukkan jumlah ikan betina : ");
                betina = ikan.nextInt();
            } while (betina == 0);
            System.out.println("\n\nJumlah ikan jantan di kolam " + i + " adalah " + jantan);
            System.out.println("Jumlah ikan betina di kolam " + i + " adalah " + betina);
            if (jantan < betina) {
                kecil = jantan;
                System.out.println("\nJumlah ikan kecil di kolam " + i + " adalah " + kecil);
            } else if (jantan > betina) {
                kecil = betina;
                System.out.println("Jumlah ikan kecil di kolam " + i + " adalah " + kecil);
            }
            totJantan += jantan;
            totBetina += betina;
            totKecil += kecil;
        }
        System.out.println("============================");
        hargaDewasa = (totJantan + totBetina) * 5000;
        hargaKecil = totKecil * 2500;
        System.out.println("\n\n\nJumlah harga " + (totJantan + totBetina) + " ikan dewasa adalah " + hargaDewasa);
        System.out.println("Jumlah harga " + totKecil + " ikan kecil adalah " + hargaKecil);
    }

}
