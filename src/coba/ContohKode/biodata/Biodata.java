package coba.ContohKode.biodata;

public class Biodata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String nama, nim, t_lahir, tgl_lahir, alamat, agama;
        //untuk input nama, nim, tempat lahir, tanggal lahir, alamat, dan agama

        nama = ("Mochammad Zufarulhaq Aleq Insan");   //masukkan nama anda disini
        nim = ("15241010129");                        //masukkan NIM anda disini
        t_lahir = ("Jember");                         //masukkan tempat lahir anda disini
        tgl_lahir = ("23 05 1996");                   //masukkan tanggal lahir
        alamat = ("Jl Arwana V/43");                  //masukkan alamat anda disini
        agama = ("Islam");                            //masukkan agama anda disini

        System.out.println("Nama            : " + nama);      //untuk mencetak nama
        System.out.println("NIM             : " + nim);       //untuk mencetak NIM
        System.out.println("Tempat Lahir    : " + t_lahir);   //untuk mencetak tempat lahir
        System.out.println("Tanggal Lahir   : " + tgl_lahir); //untuk mencetak tanggal lahir
        System.out.println("Alamat          : " + alamat);    //untuk mencetak alamat
        System.out.println("Agama           : " + agama);     //agama
    }

}
