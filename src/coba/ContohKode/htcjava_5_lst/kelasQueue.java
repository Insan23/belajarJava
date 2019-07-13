package coba.ContohKode.htcjava_5_lst;

public class kelasQueue {

    double array[];
    int first, last;

    public kelasQueue(int length) {
        array = new double[length];
        first = -1;
        last = -1;
    }

    public void enqueue(double value) {
        if (last > array.length) {
            System.out.println("Data Penuh!!!");
        } else {
            array[++last] = value;
        }
    }

    public void dequeue() {
        if (first == last) {
            System.out.println("Data Kosong");
        } else {
            array[++first] = 0.0;
        }
    }

    public void peek(int index) {
        System.out.println("Data di index " + index + " : " + array[index]);
    }

    public void position() {
        System.out.println("First : " + first + ", Last : " + last);
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
    }

    public void cari(double objek) {
        boolean cr = false;
        int j = 0;
        int in[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == objek) {
                cr = true;
                in[j] = i;
                j++;
            }
        }
        if (cr) {
            System.out.print("Data " + objek + " ditemukan pada index ");
            for (int i = 0; i < in.length; i++) {
                if (in[i] == 0) {

                } else {
                    System.out.print(in[i] + ", ");
                }
            }
            System.out.println("");
        }
    }

    public void total() {
        double total = 0.0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        System.out.println("Totalnya : " + total);
    }

    public void rata_rata() {
        double rata = 0.0;
        int jml = 0;
        for (int i = 0; i < array.length; i++) {
            rata += array[i];
            if (array[i] != 0.0) {
                jml++;
            }
        }
        System.out.println("Rata-ratanya : " + (rata / jml));
    }

    public void maks() {
        double maks = 0.0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maks) {
                maks = array[i];
            }
        }
        System.out.println("Nilai tertinggi : " + maks);
    }

    public void min() {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0.0) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
        }
        System.out.println("Nilai Terendahnya : " + min);
    }
}

