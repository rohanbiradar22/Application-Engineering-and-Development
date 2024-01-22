/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import model.product;

/**
 *
 * @author rohan
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    
    product productObj;
    
    public CreateJPanel(product productObj) {
        initComponents();
        this.productObj=productObj;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelName = new javax.swing.JLabel();
        labelDescription = new javax.swing.JLabel();
        labelAvailability = new javax.swing.JLabel();
        labelPrice = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        textDescription = new javax.swing.JTextField();
        textAvailability = new javax.swing.JTextField();
        textPrice = new javax.swing.JTextField();
        buttonSave = new javax.swing.JButton();
        labelTitle = new javax.swing.JLabel();

        labelName.setText("Name:");

        labelDescription.setText("Description:");

        labelAvailability.setText("Availability:");

        labelPrice.setText("Price:");

        textName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNameActionPerformed(evt);
            }
        });

        textAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAvailabilityActionPerformed(evt);
            }
        });

        buttonSave.setText("Save");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        labelTitle.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("Create Product");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelPrice)
                            .addComponent(labelAvailability)
                            .addComponent(labelDescription)
                            .addComponent(labelName))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textAvailability, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textDescription, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(buttonSave)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(labelTitle)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName)
                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDescription)
                    .addComponent(textDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAvailability)
                    .addComponent(textAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPrice)
                    .addComponent(textPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonSave)
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNameActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed

        productObj.setName(textName.getText());
        productObj.setDescription(textDescription.getText());
        productObj.setAvailableNumbers(textAvailability.getText());
        productObj.setPrice(textPrice.getText());
        
        JOptionPane.showMessageDialog(this, "Product Information Saved.");
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void textAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAvailabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAvailabilityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSave;
    private javax.swing.JLabel labelAvailability;
    private javax.swing.JLabel labelDescription;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPrice;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JTextField textAvailability;
    private javax.swing.JTextField textDescription;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textPrice;
    // End of variables declaration//GEN-END:variables
}
