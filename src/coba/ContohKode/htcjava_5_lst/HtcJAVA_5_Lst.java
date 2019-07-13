package coba.ContohKode.htcjava_5_lst;

import java.util.*;

public class HtcJAVA_5_Lst {

    public static void main(String[] args) {
        kelasStack one = new kelasStack(20);
        one.rata();
        one.push(5);
        one.push(33);
        one.push(2);
        one.push(42);
        one.push(12);
        one.push(3);
        one.push(34);
        one.print();
        
        kelasQueue satu = new kelasQueue(10);
        satu.enqueue(100.5);
        satu.enqueue(200.5);
        satu.enqueue(225.5);
        satu.enqueue(250.0);
        satu.enqueue(325.5);
        satu.enqueue(400.5);
        satu.enqueue(500.5);
        
        
        satu.cari(250.0);
        satu.total();
        satu.rata_rata();
        satu.maks();
        satu.min();
    }

}
