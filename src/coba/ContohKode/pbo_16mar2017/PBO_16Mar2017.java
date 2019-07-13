package coba.ContohKode.pbo_16mar2017;

import com.sun.glass.events.MouseEvent;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class PBO_16Mar2017 {

    JFrame fr;
    GridBagConstraints c = new GridBagConstraints();

    public PBO_16Mar2017() {
        fr = new JFrame("Contoh ActionListener");
        fr.setLayout(new GridBagLayout());
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //nama
        c.gridx = 1;    //label nama
        c.gridy = 1;
        JLabel lNama = new JLabel("Nama");
        fr.add(lNama, c);
        c.gridx = 2;    //edit teks nama
        c.gridy = 1;
        JTextField fNama = new JTextField(10);
        fr.add(fNama, c);

        //Jenis Kelamin
        c.gridx = 1;
        c.gridy = 2;
        JLabel lKelamin = new JLabel("Jenis Kelamin");
        fr.add(lKelamin, c);

        ButtonGroup bKelamin = new ButtonGroup();

        c.gridx = 2;
        c.gridy = 2;
        JRadioButton rLaki = new JRadioButton("Laki - Laki", true);
        rLaki.setActionCommand("Laki - Laki");
        bKelamin.add(rLaki);
        fr.add(rLaki, c);

        c.gridx = 3;
        c.gridy = 2;
        JRadioButton rPerempuan = new JRadioButton("Perempuan");
        rLaki.setActionCommand("Perempuan");
        bKelamin.add(rPerempuan);
        fr.add(rPerempuan, c);

        c.gridx = 1;
        c.gridy = 4;
        c.gridwidth = 3;
        JButton bSimpan = new JButton("Simpan");
        fr.add(bSimpan, c);
        bSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fr.dispose();

                if (fNama.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(fr, "Anda Harus Mengisi Nama!!!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    int konfirmasi = JOptionPane.showConfirmDialog(fr, "Anda Yakin?", "Konfirmasi", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                    /**
                     * Option Type DEFAULT_OPTION YES_NO_OPTION
                     * YES_NO_CANCEL_OPTION OK_CANCEL_OPTION
                     */
                    if (konfirmasi == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(fr, "Data Berhasil Disimpan", "Informasi", JOptionPane.INFORMATION_MESSAGE);

                        JOptionPane.showMessageDialog(fr, "Nama : " + fNama.getText() + "\nJenis Kelamin : "
                                + bKelamin.getSelection().getActionCommand(),
                                "Hasil", JOptionPane.INFORMATION_MESSAGE);
                        /**
                         * Icon Type ERROR_MESSAGE INFORMATION_MESSAGE
                         * WARNING_MESSAGE QUESTION_MESSAGE PLAIN_MESSAGE
                         */
                        fNama.setText("");
                        rLaki.setSelected(true);
                    } else {
                        JOptionPane.showMessageDialog(fr, "Gagal", "Informasi", JOptionPane.ERROR_MESSAGE);
                    }
                }
                fr.show();
            }
        });
        fr.setSize(300, 300);
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        //  PBO_16Mar2017 a = new PBO_16Mar2017();
//        actionListener2();
//        actionListener3();

    }

    public static void actionListener2() {
        JFrame al2 = new JFrame("Action Listener 2");
        al2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel pn1 = new Panel();
        JLabel lbl1 = new JLabel("Mouse Listener");
        pn1.add(lbl1);
        pn1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
//                JOptionPane.showMessageDialog(fr, "Mouse clicked at x :" + e.getX() + "y " + e.getY());
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                //            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });

    }

    public static void actionListener3() {
        JFrame al3 = new JFrame("Action Listener 3");
        al3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel pn1 = new Panel();
        JLabel l1 = new JLabel("Mouse Clicked");
        pn1.add(l1);
        pn1.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent e) {
                System.out.println("Dragged X : " + e.getX() + " Y : " + e.getY());
            }

            @Override
            public void mouseMoved(java.awt.event.MouseEvent e) {
                System.out.println("Moved X : " + e.getX() + " Y : " + e.getY());
            }
        });
        
        al3.add(pn1, BorderLayout.CENTER);
        al3.setSize(300, 300);
        al3.setVisible(true);
    }

}
