/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.ContohKode.contoh7;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BoxLayout;

/**
 *
 * @author Aleq
 */
public class Contoh7 {

    Contoh7() {
        Frame fr = new Frame(); //konstruktor tanpa parameter
        fr.setSize(300, 300);    //method
        fr.setVisible(true);    //

        /*
        X_AXIS
        Y_AXIS
        LINE_AXIS
        PAGE_AXIS
         */
        fr.setLayout(new BoxLayout(fr, BoxLayout.LINE_AXIS));
        
        //membuat tombol
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");
        Button btn5 = new Button("Button 5");
        Button btn6 = new Button("Button 6");
        
        //menambahkan tombol tombol dalam frame fr
        fr.add(btn1);
        fr.add(btn2);
        fr.add(btn3);
        fr.add(btn4);
        fr.add(btn5);
        fr.add(btn6);

        fr.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        Contoh7 c7 = new Contoh7();
    }

}
