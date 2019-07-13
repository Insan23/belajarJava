/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.ContohKode.contoh6;

import java.awt.Button;
import java.awt.Frame;
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Aleq
 */
public class Contoh6 {

    Contoh6() {
        Frame fr = new Frame(); //konstruktor tanpa parameter
        fr.setSize(300, 300);    //method
        fr.setVisible(true);    //

        fr.setLayout(new BorderLayout());
        //membuat tombol
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");
        Button btn5 = new Button("Button 5");
        Button btn6 = new Button("Button 6");

        //menambahkan tombol tombol dalam frame fr
        fr.add(btn1, BorderLayout.WEST);
        fr.add(btn2, BorderLayout.NORTH);
        fr.add(btn3, BorderLayout.EAST);
        fr.add(btn4, BorderLayout.SOUTH);
        fr.add(btn5, BorderLayout.CENTER);
        
        
        //event jika menekan tombol close di pojok kanan atas
        fr.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        Contoh6 c6 = new Contoh6();
    }

}
