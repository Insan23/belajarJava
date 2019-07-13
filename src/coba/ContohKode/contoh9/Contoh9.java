/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.ContohKode.contoh9;

/**
 *
 * @author Aleq
 */
import java.awt.Frame;
import java.awt.Button;
import java.awt.Label;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Contoh9 {

    Contoh9() {
        Frame fr = new Frame();
        Panel p1 = new Panel();
        Panel p2 = new Panel();

        //Panel untuk menu
        p1.setLayout(new FlowLayout(FlowLayout.LEADING));
        Button bLogin = new Button("Login");
        Button bHelp = new Button("Help");
        Button bSimpan = new Button("Simpan");
        p1.add(bLogin);
        p1.add(bHelp);

        //Panel untuk form
        p2.setLayout(new GridLayout(3, 2));
        Label lUname = new Label("Username");
        Label lPassword = new Label("Password");
        TextField tUname = new TextField();
        TextField tPassword = new TextField();
        p2.add(lUname);
        p2.add(tUname);
        p2.add(lPassword);
        p2.add(tPassword);
        p2.add(bSimpan);

        fr.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        fr.add(p1, BorderLayout.NORTH);
        fr.add(p2, BorderLayout.CENTER);

        fr.setSize(300, 300);
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        Contoh9 c9 = new Contoh9();
    }

}
