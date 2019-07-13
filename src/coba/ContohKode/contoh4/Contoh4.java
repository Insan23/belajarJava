/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.ContohKode.contoh4;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.FlowLayout;

/**
 *
 * @author Aleq
 */
public class Contoh4 {

    Contoh4() {
        Frame fr = new Frame();
        fr.setSize(300,300);
        fr.setVisible(true);
        
        /*
        LEFT
        RIGHT
        CENTER
        LEADING
        TRAILING
        */
        
        //mengatur bentuk layout dalam frame fr
        fr.setLayout(new FlowLayout(FlowLayout.LEADING));
        
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
        
        //event jika menekan tombol close di pojok kanan atas
        fr.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        Contoh4 c4 = new Contoh4();
    }
    
}
