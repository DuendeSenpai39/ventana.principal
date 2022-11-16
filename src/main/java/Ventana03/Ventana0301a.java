/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventana03;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author LAB-2
 */
public class Ventana0301a extends JFrame {
    
    private List<JPanel> jPanelList;

    public Ventana0301a(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 600);
        this.setLocation(100, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.jPanelList= new ArrayList<>();
        this.setLayout(new FlowLayout());
        
        
    }
    public void iniciarComponentes() {
        var jPanelrojo = new JPanel();
        jPanelrojo.setBackground(Color.RED);
        var jPanelazul = new JPanel();
        jPanelazul.setBackground(Color.BLUE);
        var jPanelverde = new JPanel();
        jPanelverde.setBackground(Color.GREEN);
        var jPaneldark = new JPanel();
        jPaneldark.setBackground(Color.DARK_GRAY);
        var jPanelcyan = new JPanel();
        jPanelcyan.setBackground(Color.cyan);
        
        this.jPanelList.add(jPanelrojo);
        this.jPanelList.add(jPanelazul);
        this.jPanelList.add(jPanelverde);
        this.jPanelList.add(jPaneldark);
        this.jPanelList.add(jPanelcyan);
        for(var jPanel:this.jPanelList)
        this.getContentPane().add(jPanel);
    }
}
    
  
    
    
    

