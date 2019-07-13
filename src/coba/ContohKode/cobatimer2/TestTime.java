/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.ContohKode.cobatimer2;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author blegoh
 */
public class TestTime {

    static int timer = 0;

    /**
     * @param args the command line arguments
     */
    static int count = 0;

    public static void main(String[] args) {
        new Thread() {
            public void run() {
                try {
                    while (count < 4) {
                        sleep(1000);
                        if (timer > 5) {
                            timer = 0;
                            count++;
                            break;
                        }
                        timer++;
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(TestTime.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();
//        int count = 1;
        Scanner a = new Scanner(System.in);
        String angka;
//        do {
        System.out.println("count ke " + count);
        for (int i = 0; i < 100; i++) {
//                if (timer > 5) {
//                    timer = 0;
//                    break;
//                }
            System.out.println("masukan angka ke " + i);
            angka = a.nextLine();
        }
//            count++;
//        } while (count < 4);

    }

}
