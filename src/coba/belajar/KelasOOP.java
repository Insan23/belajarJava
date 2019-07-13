package coba.belajar;

import java.util.Scanner;

public class KelasOOP {

    /**
     * Declaration package
     * import library
     * bagian class
     * method main
     * <p>
     * public
     * private
     * protected
     * kosong
     *
     * compile (menjadi bytecode)
     *
     * compile error
     * runtime error
     *
     */

    public static void main(String[] args) {
        cetak("hahahaha");

        int angka = uang();

    }

    public static void cetak(String kata) {
        System.out.println(kata);
    }

    public static int uang() {
        return 1000;
    }

}
