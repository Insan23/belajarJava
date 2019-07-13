package coba.ContohKode.htcjava_5_lst;

public class kelasStack {

    int array[];
    int index;

    public kelasStack(int length) {
        array = new int[length];
        index = 0;
    }

    public void push(int value) {
        array[index++] = value;
    }

    public void pop() {
        if (index == 0) {
            System.out.println("Data telah kosong!!");
        } else {
            array[index--] = 0;
        }
    }

    public int getIndex() {
        System.out.println("Indeks ada pada letak ke :" + index);
        return index;
    }

    public void peek(int index) {
        if (index < 0 || index > 9) {
            System.out.println("Maaf, input anda out of range");
        } else {
            System.out.println("" + array[index]);
        }
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.println("indeks ke " + (i + 1) + " : " + array[i]);
        }
    }

//    public void reverse(int index) {
//        String hasilRev = "";
//        for (int i = array[index].length(); i >= 0; i--) {
//            hasilRev += array[index].charAt(i);
//        }
//        System.out.println(hasilRev);
//    }
    
    //5,10,15,20,25,0,0,0,0,0
    //
    //
    //
    //
    public void rata() {
        int total = 0;
        int jumlah = 0;
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
            if (array[i]!=0) {
                jumlah++;
            }
        }
        int rata = total/jumlah;
        System.out.println(rata);
    }
}

