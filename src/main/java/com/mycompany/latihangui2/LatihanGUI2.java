/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihangui2;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author KHAIRANI
 */
public class LatihanGUI2 extends JFrame1{
    

    public static void main(String[] args) {
        JFrame form = new JFrame("Data Mahasiswa");
        form.setSize(400,400);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setLayout(null);
        
        JLabel labelJudul = new JLabel("PENDATAAN MAHASISWA");
        labelJudul.setBounds(100, 30,150,30);
        form.add(labelJudul);
       
        
        JLabel labelNama = new JLabel("Nama Lengkap");
        labelNama.setBounds(20,80,150,30);
        form.add(labelNama);
         JTextField textNama = new JTextField();
        textNama.setBounds(150, 80, 200, 25);
        form.add(textNama);
        
        
        JLabel labelLahir = new JLabel ("Tanggal Lahir");
        labelLahir.setBounds(20,110,150,30);
        form.add(labelLahir);
        JTextField textLahir = new JTextField();
        textLahir.setBounds(150, 110, 200, 25);
        form.add(textLahir);
        
        
        JLabel labelPendaftaran = new JLabel("Nomor Pendaftaran");
        labelPendaftaran.setBounds(20,140,150,30);
        form.add(labelPendaftaran);
        JTextField textPendaftaran = new JTextField();
        textPendaftaran.setBounds(150,140,200,25);
        form.add(textPendaftaran);
        
        
        JLabel labelNoTelp = new JLabel("No. Telp");
        labelNoTelp.setBounds(20,170,150,30);
        form.add(labelNoTelp);
        JTextField textNoTelp = new JTextField();
        textNoTelp.setBounds(150,170,200,25);
        form.add(textNoTelp);
        
        
        JLabel labelAlamat = new JLabel("Alamat");
        labelAlamat.setBounds(20,200,150,30);
        form.add(labelAlamat);
        JTextField textAlamat = new JTextField();
        textAlamat.setBounds(150,200,200,50);
        form.add(textAlamat);
        
        
        JLabel labelEmail = new JLabel("E-mail");
        labelEmail.setBounds(20,240,150,40);
        form.add(labelEmail);
        JTextField textEmail = new JTextField();
        textEmail.setBounds(150,255,200,25);
        form.add(textEmail);
        
        
        JButton buttonSubmit = new JButton("SUBMIT");
        buttonSubmit.setBounds(250, 300, 100, 30);
        buttonSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textNama.getText();
                String tglLahir = textLahir.getText();
                String noPendaftaran = textPendaftaran.getText();
                String noTelp = textNoTelp.getText();
                String alamat = textAlamat.getText();
                String email = textEmail.getText();
                JOptionPane.showMessageDialog(null, "Nama : " + nama + "\nTanggal Lahir : " + tglLahir + "\nNomor Pendaftaran : " + noPendaftaran + "\nNo Telp: " + noTelp + "\nAlamat : " + alamat + "\nE-mail : " + email);
            }
        });
        form.add(buttonSubmit);

        form.setVisible(true);
    }
}