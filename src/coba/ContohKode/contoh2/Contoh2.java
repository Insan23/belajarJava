/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.ContohKode.contoh2;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Aleq
 */
public class Contoh2 {

    public Contoh2() {
        Frame fr = new Frame();
        fr.setSize(300,300);
        fr.setVisible(true);
        
        fr.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        Contoh2 c2 = new Contoh2();
    }
    
}
