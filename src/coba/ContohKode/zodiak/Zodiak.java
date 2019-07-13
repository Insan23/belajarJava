package coba.ContohKode.zodiak;

import java.util.Scanner;

public class Zodiak {

    public static void main(String[] args) {
        // TODO code application logic here
        byte tanggal, bulan;
        Scanner zod = new Scanner(System.in);

        System.out.print("Masukkan tanggal lahir anda = ");
        tanggal = zod.nextByte();
        System.out.print("Masukkan bulan lahir anda (dalam angka) = ");
        bulan = zod.nextByte();

        //AQUARIUS
        if (((tanggal >= 20 && tanggal<= 31)&& bulan == 1) || ((tanggal >= 1&& tanggal <= 18) && bulan == 2)) {
            System.out.println("Zodiak anda adalah Aquarius");
            System.out.println("Perilakunya : Berwatak jujur, dapat dipercaya");

            //PISCES
        } else if (((tanggal >= 19 &&tanggal <=29) && bulan == 2) || ((tanggal >=1 && tanggal <= 20) && bulan == 3)) {
            System.out.println("Zodiak anda adalah Pisces");
            System.out.println("Perilakunya : Berwatak ramah dan tidak egois");

            //ARIES
        } else if (((tanggal >= 21 && tanggal <=31) && bulan == 3) || (tanggal <= 19 && bulan == 4)) {
            System.out.println("Zodiak anda adalah Aries");
            System.out.println("Perilakunya : peribadi yang kuat, yang cerdas");

            //TAURUS
        } else if ((tanggal >= 20 && bulan == 4) || (tanggal <= 20 && bulan == 5)) {
            System.out.println("Zodiak anda adalah Taurus");
            System.out.println("Perilakunya : Berwatak agak keras kepala. pemikirannya bercabang");

            //GEMINI
        } else if ((tanggal >= 21 && bulan == 5) || (tanggal <= 20 && bulan == 6)) {
            System.out.println("Zodiak anda adalah Gemini");
            System.out.println("Perilakunya : menikmati akan keindahan");

            //CANCER
        } else if ((tanggal >= 21 && bulan == 6) || (tanggal <= 22 && bulan == 7)) {
            System.out.println("Zodiak anda adalah Cancer");
            System.out.println("Perilakunya : Berwatak teguh mantap dalam pendirian maupun sikapnya");

            //LEO
        } else if ((tanggal >= 23 && bulan == 7) || (tanggal <= 22 && bulan == 8)) {
            System.out.println("Zodiak anda adalah Leo");
            System.out.println("Perilakunya : Berwatak lebih bersifat emosional ");

            //VIRGO
        } else if ((tanggal >= 23 && bulan == 8) || (tanggal <= 22 && bulan == 9)) {
            System.out.println("Zodiak anda adalah Virgo");
            System.out.println("Perilakunya : kurang merasa kasihan");

            //LIBRA
        } else if ((tanggal >= 23 && bulan == 9) || (tanggal <= 22 && bulan == 10)) {
            System.out.println("Zodiak anda adalah Libra");
            System.out.println("Perilakunya : Berwatak mudah bergaul, ramah ");

            //SCORPIO
        } else if ((tanggal >= 23 && bulan == 10) || (tanggal <= 21 && bulan == 11)) {
            System.out.println("Zodiak anda adalah Scorpio");
            System.out.println("Perilakunya : Gemar urusan sosial, dan rajin.");

            //SAGITARIUS
        } else if ((tanggal >= 22 && bulan == 11) || (tanggal <= 21 && bulan == 12)) {
            System.out.println("Zodiak anda adalah Sagitarius");
            System.out.println("Perilakunya : Berwatak keras dalam pendiriannya.");

            //CAPRICORN
        } else if ((tanggal >= 22 && bulan == 12) || (tanggal <= 19 && bulan == 1)) {
            System.out.println("Zodiak anda adalah Capricorn");
            System.out.println("Perilakunya : Berwatak suka dengan kebesaran, kekuasaan, dan     memerintah. ");
        } else {
            System.out.println("Tanggal atau Bulan anda tidak valid!!!!!!!!!!");
        }

    }
}
