/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.ContohKode.contoh8;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author Aleq
 */
public class Contoh8 {

    Contoh8 () {
        JFrame fr = new JFrame();
        fr.setSize(300,300);
        fr.setVisible(true);
        
        CardLayout crd = new CardLayout();
        Container cn = fr.getContentPane();
        
        cn.setLayout(crd);
        
        Button btn1 = new Button("Button 1");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crd.next(cn);
            }
        });
        Button btn2 = new Button("Button 2");
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crd.next(cn);
            }
        });
        Button btn3 = new Button("Button 3");
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crd.next(cn);
            }
        });
        Button btn4 = new Button("Button 4");
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crd.next(cn);
            }
        });
        
        fr.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        Contoh8 c8 = new Contoh8();
    }
    
    private void tekanAngka1(ActionEvent e) {
        
    }
}
