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
public class pnlInsideCarouselDynamic extends javax.swing.JPanel {

    Font poppinsLight14 = null;

    /**
     * Creates new form pnlUtilityBill
     */
    public pnlInsideCarouselDynamic() {
        try {
            poppinsLight14 = Font.createFont(Font.TRUETYPE_FONT, new File("src/com/theanasuddin/bros/fonts/PoppinsLight.ttf")).deriveFont(14f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(poppinsLight14);
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

        lblItemFiveValue = new javax.swing.JLabel();
        lblItemThree = new javax.swing.JLabel();
        lblItemTwoValue = new javax.swing.JLabel();
        lblItemThreeValue = new javax.swing.JLabel();
        lblItemFourValue = new javax.swing.JLabel();
        lblItemFour = new javax.swing.JLabel();
        lblItemFive = new javax.swing.JLabel();
        lblItemOneValue = new javax.swing.JLabel();
        lblItemTwo = new javax.swing.JLabel();
        lblItemOne = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0,0,0,0));
        setForeground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        setPreferredSize(new java.awt.Dimension(150, 120));
        setLayout(null);

        lblItemFiveValue.setFont(poppinsLight14);
        lblItemFiveValue.setForeground(new java.awt.Color(255, 255, 255));
        lblItemFiveValue.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        add(lblItemFiveValue);
        lblItemFiveValue.setBounds(80, 100, 70, 20);

        lblItemThree.setFont(poppinsLight14);
        lblItemThree.setForeground(new java.awt.Color(255, 255, 255));
        add(lblItemThree);
        lblItemThree.setBounds(0, 50, 70, 20);

        lblItemTwoValue.setFont(poppinsLight14);
        lblItemTwoValue.setForeground(new java.awt.Color(255, 255, 255));
        lblItemTwoValue.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        add(lblItemTwoValue);
        lblItemTwoValue.setBounds(80, 25, 70, 20);

        lblItemThreeValue.setFont(poppinsLight14);
        lblItemThreeValue.setForeground(new java.awt.Color(255, 255, 255));
        lblItemThreeValue.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        add(lblItemThreeValue);
        lblItemThreeValue.setBounds(80, 50, 70, 20);

        lblItemFourValue.setFont(poppinsLight14);
        lblItemFourValue.setForeground(new java.awt.Color(255, 255, 255));
        lblItemFourValue.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        add(lblItemFourValue);
        lblItemFourValue.setBounds(80, 75, 70, 20);

        lblItemFour.setFont(poppinsLight14);
        lblItemFour.setForeground(new java.awt.Color(255, 255, 255));
        add(lblItemFour);
        lblItemFour.setBounds(0, 75, 70, 20);

        lblItemFive.setFont(poppinsLight14);
        lblItemFive.setForeground(new java.awt.Color(255, 255, 255));
        add(lblItemFive);
        lblItemFive.setBounds(0, 100, 70, 20);

        lblItemOneValue.setFont(poppinsLight14);
        lblItemOneValue.setForeground(new java.awt.Color(255, 255, 255));
        lblItemOneValue.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        add(lblItemOneValue);
        lblItemOneValue.setBounds(80, 0, 70, 20);

        lblItemTwo.setFont(poppinsLight14);
        lblItemTwo.setForeground(new java.awt.Color(255, 255, 255));
        add(lblItemTwo);
        lblItemTwo.setBounds(0, 25, 70, 20);

        lblItemOne.setFont(poppinsLight14);
        lblItemOne.setForeground(new java.awt.Color(255, 255, 255));
        add(lblItemOne);
        lblItemOne.setBounds(0, 0, 70, 20);
        //Added

        lblItem[0] = lblItemOne;
        lblItem[1] = lblItemTwo;
        lblItem[2] = lblItemThree;
        lblItem[3] = lblItemFour;
        lblItem[4] = lblItemFive;

        lblItemValue[0] = lblItemOneValue;
        lblItemValue[1] = lblItemTwoValue;
        lblItemValue[2] = lblItemThreeValue;
        lblItemValue[3] = lblItemFourValue;
        lblItemValue[4] = lblItemFiveValue;
    }// </editor-fold>//GEN-END:initComponents

    JLabel[] lblItem = new JLabel[5];
    JLabel[] lblItemValue = new JLabel[5];


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel lblItemFive;
    public javax.swing.JLabel lblItemFiveValue;
    public javax.swing.JLabel lblItemFour;
    public javax.swing.JLabel lblItemFourValue;
    public javax.swing.JLabel lblItemOne;
    public javax.swing.JLabel lblItemOneValue;
    public javax.swing.JLabel lblItemThree;
    public javax.swing.JLabel lblItemThreeValue;
    public javax.swing.JLabel lblItemTwo;
    public javax.swing.JLabel lblItemTwoValue;
    // End of variables declaration//GEN-END:variables
}
