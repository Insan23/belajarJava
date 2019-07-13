package coba.ContohKode.kalkulator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.BoxLayout;

public class Kalkulator extends Frame{

    String tampil;
    Double angka1, angka2;
    Double jumlah;
    Kalkulator() {
        setSize(300, 400);
        setVisible(true);
        setResizable(false);
        
        Panel p1 = new Panel(); //panel layar
        Panel p2 = new Panel(); //panel tombol baris 1
        Panel p3 = new Panel(); //panel tombol baris 2
        Panel p4 = new Panel(); //panel tombol baris 3
        Panel p5 = new Panel(); //panel tombol baris 4
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        
        //panel untuk layar ketikan
        p1.setLayout(new BorderLayout());
        TextField layar = new TextField();
        layar.setEditable(false);
        //layar.setSize(300, 150);
        p1.add(layar, BorderLayout.CENTER);
        
        //panel untuk tombol
        p2.setLayout(new BoxLayout(p2, BoxLayout.LINE_AXIS));
        p3.setLayout(new BoxLayout(p3, BoxLayout.LINE_AXIS));
        p4.setLayout(new BoxLayout(p4, BoxLayout.LINE_AXIS));
        p5.setLayout(new BoxLayout(p5, BoxLayout.LINE_AXIS));
        Button angka1 = new Button("1");
        Button angka2 = new Button("2");
        Button angka3 = new Button("3");
        Button angka4 = new Button("4");
        Button angka5 = new Button("5");
        Button angka6 = new Button("6");
        Button angka7 = new Button("7");
        Button angka8 = new Button("8");
        Button angka9 = new Button("9");
        Button angka0 = new Button("0");
        Button titik = new Button(".");
        
        Button tambah = new Button("+");
        Button kurang = new Button("-");
        Button kali = new Button("x");
        Button bagi = new Button(":");
        Button hasil = new Button("=");
        
        //memasukkan tombol tombol di atas kedalam layout
        p2.add(angka1);
        p2.add(angka2);
        p2.add(angka3);
        p2.add(bagi);
        
        p3.add(angka4);
        p3.add(angka5);
        p3.add(angka6);
        p3.add(kali);
        
        p4.add(angka7);
        p4.add(angka8);
        p4.add(angka9);
        p4.add(kurang);
        
        p5.add(angka0);
        p5.add(titik);
        p5.add(hasil);
        p5.add(tambah);
        
        setLayout(new GridLayout(5,1));
        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);
    }
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();
    }
    
    
}
