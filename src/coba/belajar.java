package coba;

public class belajar {
    public static void main(String[] args) {
        //bulat byte, small, int, long
        //desimal float, double
        //huruf char, String
        //null
        //String concatenation = penggabungan string(huruf)
        //apa pentingnya tab, spasi, dan angka ini pemograman?
        //juga warna
        /**
         * tab untuk mempermudah pembacaan kode
         * warna, itu tergantung editor, kalo pake notepad biasa milik windows, pasti ga ada warnanya
         * angka di sebelah kiri itu angka baris dari kode, untuk nantinya bisa sebagai referensi kalo ada error
         * menunjukkan baris keberapa errornya
         */


        int angka1 = 12;
        angka1 = angka1 + 3;

        int angka2 = 13;
        char kkk = 'a';
        String kaliamt = "kakakakak dkandc";
        double desimal = 1.2;
        float ss = 12.3F;

        System.out.println("belajar " + angka1 + angka2);

        /**
         * kali = *
         * bagi = /
         * tambah  = +
         * kurang = -
         */

        int hasil = angka1 + angka2;
        //=================================================================================================


        int ab = 123;
        int cd = 22;
        /**
         * == (sama dengan)
         * != (tidak sama dengan)
         *
         * && dan (and)
         * || atau (or)
         * Not AND, Xclusive OR, Not OR
         * NOR
         * >
         * <
         * >=
         * <=
         *
         */

        if (ab == 123 || cd == 22) {
            System.out.println("benar");
        } else {
            System.out.println("salah");
        }

        int suhu = 10;

        //if bertingkat
        if (suhu < 10) {
            System.out.println("dingin");
        } else if (suhu > 10 && suhu < 30) {
            System.out.println("normal");
        } else if (suhu > 30) {
            System.out.println("panas");
        } else {

        }


        //if bersarang
        if (suhu > 10) {
            if (suhu > 30) {

            } else {

            }
        } else {

        }

    }
}
