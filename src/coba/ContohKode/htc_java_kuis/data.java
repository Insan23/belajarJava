package coba.ContohKode.htc_java_kuis;

public class data {

    String namaPen[];
    String noKtpPen[];
    int jmlKiloPen[];
    int noUrutPen[];
    int first, last;

    public void dataPen(int jumlah) {
        namaPen = new String[jumlah];
        noKtpPen = new String[jumlah];
        jmlKiloPen = new int[jumlah];
        noUrutPen = new int[jumlah];
        first = -1;
        last = -1;
    }

    public void enqueue(String nama, String noKtp, int jmlKilo, int noUrut) {
        if (last > namaPen.length) {
            System.out.println("Data Penuh!!!");
        } else {
            namaPen[++last] = nama;
            noKtpPen[++last] = noKtp;
            jmlKiloPen[++last] = jmlKilo;
            noUrutPen[++last] = noUrut;
        }
    }

    public void getUrut(String noKtp) {
        for (int i = 0; i < noKtpPen.length; i++) {
            if (noKtp.equalsIgnoreCase(noKtpPen[i])) {
                System.out.println("Nomor urut anda adalah : " + noUrutPen[i]);
            }
        }
    }

    public void print() {
        for (int i = 0; i < namaPen.length; i++) {
            System.out.println("<" + (i + 1) + ">");
            System.out.println("Nomor KTP\t\t: " + noKtpPen[i]);
            System.out.println("nama\t\t\t: " + namaPen[i]);
            System.out.println("nomor urut\t\t: " + noUrutPen[i]);
            System.out.println("Jumlah beras (Kg)\t: " + jmlKiloPen[i]);
        }
    }

    public void urutData() {
        String tmp;
        int tmp1, tmp2;
        String tmp3;
        for (int i = 0; i < noUrutPen.length - 1; i++) {
            for (int j = 0; j < noUrutPen.length - i - 1; j++) {
                if (noUrutPen[j] > noUrutPen[j + 1]) {
                    tmp = noKtpPen[j];
                    tmp1 = noUrutPen[j];
                    tmp2 = jmlKiloPen[j];
                    tmp3 = namaPen[j];

                    noKtpPen[j] = noKtpPen[j + 1];
                    noUrutPen[j] = noUrutPen[j + 1];
                    jmlKiloPen[j] = jmlKiloPen[j + 1];
                    namaPen[j] = namaPen[j + 1];

                    noKtpPen[j + 1] = tmp;
                    noUrutPen[j + 1] = tmp1;
                    jmlKiloPen[j + 1] = tmp2;
                    namaPen[j + 1] = tmp3;
                }
            }
        }
    }

    public void hapusData(String noKtp) {
        boolean ktp = false;
        int hapusIndeks = 0;
        for (int i = 0; i < noKtpPen.length; i++) {
            if (noKtp.equalsIgnoreCase(noKtpPen[i])) {
                ktp = true;
                hapusIndeks = i;
                break;
            }
        }
        int start = hapusIndeks;
        if (ktp == true) {
            for (int i = start; i < namaPen.length - 1; i++) {
                namaPen[i] = namaPen[i + 1];
                noKtpPen[i] = noKtpPen[i + 1];
                noUrutPen[i] = noUrutPen[i + 1];
                jmlKiloPen[i] = jmlKiloPen[i + 1];
            }
        }
    }
}
