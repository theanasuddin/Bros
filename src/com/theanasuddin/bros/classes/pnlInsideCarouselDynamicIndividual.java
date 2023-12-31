/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.theanasuddin.bros.classes;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Anas
 */
public class pnlInsideCarouselDynamicIndividual extends javax.swing.JPanel {

    Font poppinsLight14 = null;
    Font poppinsRegular18 = null;

    /**
     * Creates new form pnlUtilityBill
     */
    public pnlInsideCarouselDynamicIndividual() {
        try {
            poppinsLight14 = Font.createFont(Font.TRUETYPE_FONT, new File("src/com/theanasuddin/bros/fonts/PoppinsLight.ttf")).deriveFont(14f);
            poppinsRegular18 = Font.createFont(Font.TRUETYPE_FONT, new File("src/com/theanasuddin/bros/fonts/PoppinsRegular.ttf")).deriveFont(18f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(poppinsLight14);
            ge.registerFont(poppinsRegular18);
        } catch (FontFormatException | IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        lblItemFiveValue = new javax.swing.JLabel();
        lblItemThree = new javax.swing.JLabel();
        lblItemTwoValue = new javax.swing.JLabel();
        lblItemThreeValue = new javax.swing.JLabel();
        lblItemFourValue = new javax.swing.JLabel();
        lblItemFour = new javax.swing.JLabel();
        lblItemFive = new javax.swing.JLabel();
        lblItemTwo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0,0,0,0));
        setForeground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        setPreferredSize(new java.awt.Dimension(150, 158));
        setLayout(null);

        lblName.setFont(poppinsRegular18);
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setPreferredSize(new java.awt.Dimension(150, 30));
        add(lblName);
        lblName.setBounds(0, 0, 150, 30);

        lblItemFiveValue.setFont(poppinsLight14);
        lblItemFiveValue.setForeground(new java.awt.Color(255, 255, 255));
        lblItemFiveValue.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        add(lblItemFiveValue);
        lblItemFiveValue.setBounds(80, 138, 70, 20);

        lblItemThree.setFont(poppinsLight14);
        lblItemThree.setForeground(new java.awt.Color(255, 255, 255));
        lblItemThree.setText("Meal");
        add(lblItemThree);
        lblItemThree.setBounds(0, 88, 70, 20);

        lblItemTwoValue.setFont(poppinsLight14);
        lblItemTwoValue.setForeground(new java.awt.Color(255, 255, 255));
        lblItemTwoValue.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        add(lblItemTwoValue);
        lblItemTwoValue.setBounds(80, 63, 70, 20);

        lblItemThreeValue.setFont(poppinsLight14);
        lblItemThreeValue.setForeground(new java.awt.Color(255, 255, 255));
        lblItemThreeValue.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        add(lblItemThreeValue);
        lblItemThreeValue.setBounds(80, 88, 70, 20);

        lblItemFourValue.setFont(poppinsLight14);
        lblItemFourValue.setForeground(new java.awt.Color(255, 255, 255));
        lblItemFourValue.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        add(lblItemFourValue);
        lblItemFourValue.setBounds(80, 113, 70, 20);

        lblItemFour.setFont(poppinsLight14);
        lblItemFour.setForeground(new java.awt.Color(255, 255, 255));
        lblItemFour.setText("Meal Cost");
        add(lblItemFour);
        lblItemFour.setBounds(0, 113, 70, 20);

        lblItemFive.setFont(poppinsLight14);
        lblItemFive.setForeground(new java.awt.Color(255, 255, 255));
        add(lblItemFive);
        lblItemFive.setBounds(0, 138, 70, 20);

        lblItemTwo.setFont(poppinsLight14);
        lblItemTwo.setForeground(new java.awt.Color(255, 255, 255));
        lblItemTwo.setText("Bazaar");
        add(lblItemTwo);
        lblItemTwo.setBounds(0, 63, 70, 20);
    }// </editor-fold>//GEN-END:initComponents

    JLabel[] lblItemValue = new JLabel[4];


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel lblItemFive;
    public javax.swing.JLabel lblItemFiveValue;
    public javax.swing.JLabel lblItemFour;
    public javax.swing.JLabel lblItemFourValue;
    public javax.swing.JLabel lblItemThree;
    public javax.swing.JLabel lblItemThreeValue;
    public javax.swing.JLabel lblItemTwo;
    public javax.swing.JLabel lblItemTwoValue;
    public javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables
}
