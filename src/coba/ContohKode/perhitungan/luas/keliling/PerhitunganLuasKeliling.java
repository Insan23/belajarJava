package coba.ContohKode.perhitungan.luas.keliling;

import java.util.Scanner;

public class PerhitunganLuasKeliling {

    public static void main(String[] args) {
        // mulai deklarasi variabel
        double sisi1 = 0, sisi2 = 0, sisi3 = 0, tinggi = 0, luas = 0, keliling = 0, pita1 = 0, pita2 = 0;
        byte pil1 = 0, pil2 = 0, pil3 = 0;
        String bangun = null;
        Scanner p = new Scanner(System.in);

        System.out.println("Penghitung Luas & Keliling Bangun Datar");
        System.out.println("Pilih tipe bangun yang akan dihitung luas/kelilingnya");
        System.out.print("1. Persegi\t\t\t5. Jajargenjang\n2. Persegi panjang"
                + "\t\t6. Layang-layang\n3. Segitiga\t\t\t7. Belah ketupat\n4. Trapesium\t\t\t8. Lingkaran"
                + "\npilihan = ");
        pil1 = p.nextByte();
        while (pil1 < 1 || pil1 > 8) {
            System.err.println("Pilihan Tidak Tersedia");
            System.out.print("Silahan Masukkan Pilihan Kembali : ");
            pil1 = p.nextByte();
        }

        System.out.println("\n\n\n===============================================");
        System.out.print("Pilih perhitungan yang akan dilakukan :\n1. Luas\n2. Keliling\n3. Keduanya\npilihan = ");
        pil2 = p.nextByte();
        while (pil2 <= 0 || pil2 > 3) {
            System.err.print("Pilihan Tidak Tersedia\nSilahkan Masukkan Pilihan Kembali : ");
            pil2 = p.nextByte();
        }
        System.out.println("\n\n\n===============================================");

        switch (pil1) {
            case 1:
                bangun = "Persgi";
                System.out.println("\t\t\t<" + bangun + ">");
                System.out.print("\nMasukkan panjang sisi (dalam cm) : ");
                sisi1 = p.nextDouble();
                while (sisi1 <= 0) {
                    System.err.println("\nPanjang sisi tidak boleh kurang dari atau sama dengan nol");
                    System.out.print("Masukkan kembali panjang sisi : ");
                    sisi1 = p.nextDouble();
                }
                luas = sisi1 * sisi1;
                keliling = sisi1 * 4;
                break;
            case 2:
                bangun = "Persegi Panjang";
                System.out.println("\t\t\t<" + bangun + ">");
                System.out.print("\nMasukkan Panjang (dalam cm ): ");
                sisi1 = p.nextDouble();
                while (sisi1 <= 0) {
                    System.err.println("\nPanjang sisi tidak boleh kurang dari atau sama dengan nol");
                    System.out.print("Masukkan kembali panjang : ");
                    sisi1 = p.nextDouble();
                }
                System.out.print("\nMasukkan Lebar (dalam cm) : ");
                sisi2 = p.nextDouble();
                while (sisi2 <= 0) {
                    System.err.println("\nLebar sisi tidak boleh kurang dari atau sama dengan nol");
                    System.out.print("Masukkan kembali lebar : ");
                    sisi2 = p.nextDouble();
                }
                luas = sisi1 * sisi2;
                keliling = (sisi1 + sisi2) * 2;
                break;
            case 3:
                System.out.println("<Segitiga>");
                System.out.print("\nJenis Segitiga\n1. Sama Sisi\n2. Sama Kaki\n3. Siku-Siku\n4. Tak Beraturan\nPilihan : ");
                pil3 = p.nextByte();
                switch (pil3) {
                    case 1:
                        bangun = "Segitiga Sama Sisi";
                        System.out.println("\t\t\t<" + bangun + ">");
                        System.out.print("\nMasukkan Panjang Sisi (dalam cm) : ");
                        sisi1 = p.nextDouble();
                        while (sisi1 <= 0) {
                            System.err.println("\nPanjang sisi tidak boleh kurang dari atau sama dengan nol");
                            System.out.print("Masukkan kembali panjang sisi : ");
                            sisi1 = p.nextDouble();
                        }
                        System.out.print("\nMasukkan Tinggi Segitiga (bila tidak ada isi dengan nol) : ");
                        tinggi = p.nextDouble();
                        while (tinggi < 0) {
                            System.err.println("\nTinggi tidak boleh bernilai negatif");
                            System.out.print("Masukkan kembali tinggi segitiga : ");
                            sisi1 = p.nextDouble();
                        }
                        if (tinggi == 0) {
                            tinggi = Math.sqrt((Math.pow(sisi1, 2)) - Math.pow((sisi1 / 2), 2));
                        }
                        luas = (sisi1 * tinggi) / 2;
                        keliling = sisi1 * 3;
                        break;
                    case 2:
                        bangun = "Segitiga Sama Kaki";
                        System.out.println("\t\t\t<" + bangun + ">");
                        System.out.print("\nMasukkan Panjang Alas (dalam cm) : ");
                        sisi1 = p.nextDouble();
                        while (sisi1 <= 0) {
                            System.err.println("\nPanjang alas tidak boleh kurang dari atau sama dengan nol");
                            System.out.print("Masukkan kembali panjang alas : ");
                            sisi1 = p.nextDouble();
                        }
                        System.out.print("\nMasukkan Tinggi Segitiga (dalam cm) : ");
                        tinggi = p.nextDouble();
                        while (tinggi <= 0) {
                            System.err.println("\nTinggi tidak boleh kurang dari atau sama dengan nol");
                            System.out.print("Masukkan kembali tinggi segitiga : ");
                            sisi1 = p.nextDouble();
                        }
                        luas = (sisi1 * tinggi) / 2;
                        pita1 = Math.sqrt((Math.pow((sisi1/2), 2) + Math.pow(tinggi, 2)));
                        keliling = sisi1 + (pita1*2);
                        break;
                    case 3:
                        bangun = "Segitiga Siku-Siku";
                        System.out.println("\t\t\t<" + bangun + ">");
                        System.out.print("\nMasukkan Panjang Alas : ");
                        sisi1 = p.nextDouble();
                        while (sisi1 <= 0) {
                            System.err.println("\nPanjang alas tidak boleh kurang dari atau sama dengan nol");
                            System.out.print("Masukkan kembali panjang alas : ");
                            sisi1 = p.nextDouble();
                        }
                        System.out.print("\nMasukkan Tinggi Segitiga (dalam cm) : ");
                        tinggi = p.nextDouble();
                        while (tinggi <= 0) {
                            System.err.println("\nTinggi tidak boleh kurang dari atau sama dengan nol");
                            System.out.print("Masukkan kembali tinggi segitiga : ");
                            sisi1 = p.nextDouble();
                        }
                        luas = (sisi1 * tinggi)/2;
                        pita1 = Math.sqrt(Math.pow(sisi1, 2) + Math.pow(tinggi, 2));
                        keliling = sisi1 + tinggi + pita1;
                        break;
                    case 4:
                        bangun = "Segitiga Tak Beraturan";
                        System.out.println("\t\t\t<" + bangun + ">");
                        System.err.println("Maaf, Permintaan Masih Belum Dapat Diproses");
                        System.exit(0);
                        break;
                }
            case 4:
                bangun = "Trapesium";
                System.out.println("\t\t\t<" + bangun + ">");
                System.err.println("Maaf, Permintaan Masih Belum Dapat Diproses");
                System.exit(0);
                break;
            case 5:
                bangun = "Jajargenjang";
                System.out.println("\t\t\t<" + bangun + ">");
                System.err.println("Maaf, Permintaan Masih Belum Dapat Diproses");
                System.exit(0);
                break;
            case 6:
                bangun = "Layang-Layang";
                System.out.println("\t\t\t<" + bangun + ">");
                System.err.println("Maaf, Permintaan Masih Belum Dapat Diproses");
                System.exit(0);
                break;
            case 7:
                bangun = "Belah Ketupat";
                System.out.println("\t\t\t<" + bangun + ">");
                System.out.print("Masukkan Panjang Sisi A : ");
                sisi1 = p.nextDouble();
                while (sisi1 <= 0) {
                    System.err.println("Panjang sisi tidak boleh kurang dari atau sama dengan nol");
                    System.out.print("Masukkan kembali panjang sisi A : ");
                    sisi1 = p.nextDouble();
                }
                System.out.print("Masukkan Panjang Sisi B : ");
                sisi2 = p.nextDouble();
                while (sisi2 <= 0) {
                    System.err.println("Panjang sisi tidak boleh kurang dari atau sama dengan nol");
                    System.out.print("Masukkan kembali panjang sisi B : ");
                    sisi2 = p.nextDouble();
                }
                luas = (sisi1*sisi2)/2;
                pita1 = Math.sqrt((Math.pow((sisi1/2), 2)+ (Math.pow((sisi2/2), 2))));
                keliling = pita1*4;
                break;
            case 8:
                bangun = "Lingkaran";
                System.out.println("\t\t\t<" + bangun + ">");
                System.out.print("Masukkan Panjang Jari-Jari (dalam cm) : ");
                sisi1 = p.nextDouble();
                while (sisi1 <= 0) {
                    System.err.println("Panjang jari-jari tidak boleh kurang dari atau sama dengan nol");
                    System.out.print("Masukkan kembali panjang jari-jari : ");
                    sisi1 = p.nextDouble();
                }
                luas = Math.pow(sisi1, 2)*Math.PI;
                keliling = 2*(sisi1*2)*Math.PI;
                break;
        }
        System.out.println("\n\n\n\n\n\n===================================================");
        switch (pil2) {
            case 1:
                System.out.println("Luas bangun " + bangun + " : " + luas);
                break;
            case 2:
                System.out.println("Keliling bangun " + bangun + " : " + keliling);
                break;
            case 3:
                System.out.println("Luas bangun " + bangun + " : " + luas);
                System.out.println("Keliling bangun " + bangun + " : " + keliling);
        }
    }

}
