/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_0301;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author PCG
 */
public class Ventana1 extends JFrame {
    private JPanel jPanel1;
    private List<JLabel> jLabelList; 
    
   public Ventana1(String title) {
        super(title);
        this.setSize(325, 125);
        this.setLocation(100, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }

   public void iniciarComponentes(){
        this.iniciarPanel();
        this.iniciarEtiquetas();
   }
   
   public void iniciarPanel(){
       this.jPanel1 = new JPanel();
       this.jPanel1.setBackground(Color.ORANGE);
       this.jPanel1.setBorder(BorderFactory.createTitledBorder("Panel Principal"));
       this.jPanel1.setLayout(new BorderLayout());
   }
   
   public void iniciarEtiquetas(){
       this.jLabelList = new ArrayList<>();
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       
       this.jLabelList.get(0).setBackground(Color.GRAY);
       this.jLabelList.get(0).setOpaque(true);
       this.jLabelList.get(0).setText("                                          Button 1");
       this.jLabelList.get(1).setBackground(Color.RED);
       this.jLabelList.get(1).setOpaque(true);
       this.jLabelList.get(1).setText("                             Long-Named Button 4 ");
       this.jLabelList.get(2).setBackground(Color.CYAN);
       this.jLabelList.get(2).setOpaque(true);
       this.jLabelList.get(2).setText("Button 5");
       this.jLabelList.get(3).setBackground(Color.YELLOW);
       this.jLabelList.get(3).setOpaque(true);
       this.jLabelList.get(3).setText("Button 3");
       this.jLabelList.get(4).setBackground(Color.MAGENTA);
       this.jLabelList.get(4).setOpaque(true);
       this.jLabelList.get(4).setText("                           Button 2");
       
       this.jPanel1.add(this.jLabelList.get(0),BorderLayout.NORTH);
       this.jPanel1.add(this.jLabelList.get(1),BorderLayout.SOUTH);
       this.jPanel1.add(this.jLabelList.get(2),BorderLayout.EAST);
       this.jPanel1.add(this.jLabelList.get(3),BorderLayout.WEST);
       this.jPanel1.add(this.jLabelList.get(4),BorderLayout.CENTER);
   }
}
