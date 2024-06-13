/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DataBase.LaptopManager;
import static DataBase.LaptopManager.addLaptop;
import static DataBase.LaptopManager.updateLaptop;
import DataBase.PhoneManager;
import static DataBase.PhoneManager.addPhone;
import java.sql.*;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.mysql.cj.xdevapi.PreparableStatement;
import com.sun.jdi.connect.spi.Connection;
import database.DatabaseConnection;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import model.Laptop;
import model.Phone;

/**
 *
 * @author AN
 */
public class UpdateProduct extends javax.swing.JFrame {

    /**
     * Creates new form AddProduct
     */
    public UpdateProduct(String ids, String type) {
        initComponents();
        idtxt.setText(ids);
        typetxt.setText(type);
        if(type.equals("LAPTOP")){
            getLaptop(Integer.parseInt(ids));
        }else if(type.equals("SMARTPHONE")){
            getPhone(Integer.parseInt(ids));
        }
    }
    private void getLaptop(int id) {
    Laptop laptop = LaptopManager.getLaptopById(id);
    if (laptop != null) {
        nametxt.setText(laptop.getName());
        pricetxt.setText(laptop.getPrice());
        quantityTxt.setValue(laptop.getQuantity());
        imgtxt.setText(laptop.getImage());
        destxt.setText(laptop.getDescription());
        typecb.setSelectedItem("Laptop");
    } else {
        JOptionPane.showMessageDialog(this, "No laptop found with the given ID.");
    }
}
    
    private void getPhone(int id) {
    Phone phone = PhoneManager.getPhoneById(id);
    if (phone != null) {
        nametxt.setText(phone.getName());
        pricetxt.setText(phone.getPrice());
        quantityTxt.setValue(phone.getQuantity());
        imgtxt.setText(phone.getImage());
        destxt.setText(phone.getDescription());
        typecb.setSelectedItem("Smartphone"); 
    } else {
        JOptionPane.showMessageDialog(this, "No phone found with the given ID.");
    }
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        pricetxt = new javax.swing.JTextField();
        img = new javax.swing.JButton();
        imgtxt = new javax.swing.JTextField();
        kButton1 = new com.k33ptoo.components.KButton();
        updatebt = new com.k33ptoo.components.KButton();
        typelb = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        destxt = new javax.swing.JTextField();
        typecb = new javax.swing.JComboBox<>();
        idtxt = new javax.swing.JTextField();
        typetxt = new javax.swing.JTextField();
        quantitylb = new javax.swing.JLabel();
        SpinnerNumberModel model = new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1);
        quantityTxt = new javax.swing.JSpinner(model);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 60, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Price:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 60, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Description:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 110, -1));

        nametxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });
        jPanel1.add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 300, 30));

        pricetxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pricetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pricetxtActionPerformed(evt);
            }
        });
        jPanel1.add(pricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 300, 30));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/image.png"))); // NOI18N
        img.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgActionPerformed(evt);
            }
        });
        jPanel1.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 50, 40));
        jPanel1.add(imgtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 240, 40));

        kButton1.setText("CANCEL");
        kButton1.setkBorderRadius(20);
        kButton1.setkEndColor(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverEndColor(new java.awt.Color(51, 153, 255));
        kButton1.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverStartColor(new java.awt.Color(51, 153, 255));
        kButton1.setkSelectedColor(new java.awt.Color(51, 153, 255));
        kButton1.setkStartColor(new java.awt.Color(51, 153, 255));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        updatebt.setText("UPDATE");
        updatebt.setkBorderRadius(20);
        updatebt.setkEndColor(new java.awt.Color(255, 255, 255));
        updatebt.setkHoverEndColor(new java.awt.Color(51, 153, 255));
        updatebt.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        updatebt.setkHoverStartColor(new java.awt.Color(51, 153, 255));
        updatebt.setkSelectedColor(new java.awt.Color(51, 153, 255));
        updatebt.setkStartColor(new java.awt.Color(51, 153, 255));
        updatebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtActionPerformed(evt);
            }
        });
        jPanel1.add(updatebt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        typelb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        typelb.setText("Type:");
        jPanel1.add(typelb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 60, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Image:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 60, -1));

        destxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        destxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destxtActionPerformed(evt);
            }
        });
        jPanel1.add(destxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 300, 30));

        typecb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop", "Smartphone" }));
        typecb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typecbActionPerformed(evt);
            }
        });
        jPanel1.add(typecb, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, 30));

        idtxt.setVisible(false);
        idtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtxtActionPerformed(evt);
            }
        });
        jPanel1.add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        typetxt.setVisible(false);
        jPanel1.add(typetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        quantitylb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        quantitylb.setText("Quantity:");
        jPanel1.add(quantitylb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 90, 30));
        jPanel1.add(quantityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void destxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destxtActionPerformed

    private void updatebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtActionPerformed
     try {
        int idd = Integer.parseInt(idtxt.getText());
        String name = nametxt.getText();
        String price = pricetxt.getText();
        int quantity = (int) quantityTxt.getValue();
        String des = destxt.getText();
        String img = imgtxt.getText();
        String type = typetxt.getText();
        
        if (type.equals("LAPTOP")) {
            Laptop laptop = new Laptop(idd, name, price,quantity,img, des);
            LaptopManager.updateLaptop(laptop);
        } else if (type.equals("SMARTPHONE")) {
            Phone phone = new Phone(idd, name, price,quantity,img, des);
            PhoneManager.updatePhone(phone);
        }
        JOptionPane.showMessageDialog(this, "Product updated successfully!");
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid ID format.");
    }
    }//GEN-LAST:event_updatebtActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        nametxt.setText("");
        pricetxt.setText("");
        destxt.setText("");
        imgtxt.setText("");
    }//GEN-LAST:event_kButton1ActionPerformed

    private void imgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        java.io.File file = chooser.getSelectedFile();
        String filename = file.getAbsolutePath();
        imgtxt.setText(filename);
    }//GEN-LAST:event_imgActionPerformed

    private void pricetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pricetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pricetxtActionPerformed

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtActionPerformed

    private void typecbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typecbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typecbActionPerformed

    private void idtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtxtActionPerformed
                                                                                                                                                                                     


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        FlatMacLightLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateProduct("id","type").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField destxt;
    private javax.swing.JTextField idtxt;
    private javax.swing.JButton img;
    private javax.swing.JTextField imgtxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private com.k33ptoo.components.KButton kButton1;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField pricetxt;
    private javax.swing.JSpinner quantityTxt;
    private javax.swing.JLabel quantitylb;
    private javax.swing.JComboBox<String> typecb;
    private javax.swing.JLabel typelb;
    private javax.swing.JTextField typetxt;
    private com.k33ptoo.components.KButton updatebt;
    // End of variables declaration//GEN-END:variables
    
    public javax.swing.JTextField getDestxt() { return destxt; }
    public javax.swing.JTextField getIdtxt() { return idtxt; }
    public javax.swing.JButton getImg() { return img; }
    public javax.swing.JTextField getImgtxt() { return imgtxt; }
    public com.k33ptoo.components.KButton getKButton1() { return kButton1; }
    public javax.swing.JTextField getNametxt() { return nametxt; }
    public javax.swing.JTextField getPricetxt() { return pricetxt; }
    public javax.swing.JSpinner getQuantityTxt() { return quantityTxt; }
    public javax.swing.JComboBox<String> getTypecb() { return typecb; }
    public javax.swing.JTextField getTypetxt() { return typetxt; }
    public com.k33ptoo.components.KButton getUpdatebt() { return updatebt; }
}
