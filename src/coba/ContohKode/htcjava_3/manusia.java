package coba.ContohKode.htcjava_3;

public class manusia {

    String nama;
    int jumlahTangan, bergerak;

    public manusia() {
        nama = "";
        jumlahTangan = 2;
    }

    public void setBergerak(int bergerak) {
        this.bergerak = bergerak;
    }

    public void setJumlahTangan(int jumlahTangan) {
        this.jumlahTangan = jumlahTangan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void bergerakJalan(int berapaKM) {
        this.bergerak = berapaKM;
    }

    public int getBergerak() {
        return bergerak;
    }

    public String getNama() {
        return nama;
    }

    public void info() {
        System.out.println("Nama : " + nama);
        System.out.println("jumlah tangan : " + jumlahTangan);
    }
}
