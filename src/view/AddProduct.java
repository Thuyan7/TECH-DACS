/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;



import com.formdev.flatlaf.themes.FlatMacLightLaf;
import controller.AddProductController;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author AN
 */
public class AddProduct extends javax.swing.JFrame {

    /**
     * Creates new form AddProduct
     */
    public AddProduct() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        destxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        pricetxt = new javax.swing.JTextField();
        img = new javax.swing.JButton();
        imgtxt = new javax.swing.JTextField();
        kButton1 = new com.k33ptoo.components.KButton();
        savebt = new com.k33ptoo.components.KButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        SpinnerNumberModel model = new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1);
        quantityTxt = new javax.swing.JSpinner(model);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Type:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 60, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 60, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Price:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 60, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Description:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 110, -1));

        destxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        destxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destxtActionPerformed(evt);
            }
        });
        jPanel1.add(destxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 300, 30));

        nametxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });
        jPanel1.add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 300, 30));

        pricetxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pricetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pricetxtActionPerformed(evt);
            }
        });
        jPanel1.add(pricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 300, 30));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/image.png"))); // NOI18N
        img.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgActionPerformed(evt);
            }
        });
        jPanel1.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 50, 40));
        jPanel1.add(imgtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 240, 40));

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

        savebt.setText("SAVE");
        savebt.setkBorderRadius(20);
        savebt.setkEndColor(new java.awt.Color(255, 255, 255));
        savebt.setkHoverEndColor(new java.awt.Color(51, 153, 255));
        savebt.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        savebt.setkHoverStartColor(new java.awt.Color(51, 153, 255));
        savebt.setkSelectedColor(new java.awt.Color(51, 153, 255));
        savebt.setkStartColor(new java.awt.Color(51, 153, 255));
        savebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtActionPerformed(evt);
            }
        });
        jPanel1.add(savebt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Image:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 60, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop", "Smartphone" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Quantity:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 90, 30));
        jPanel1.add(quantityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
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

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtActionPerformed

    private void pricetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pricetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pricetxtActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void imgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        java.io.File file = chooser.getSelectedFile();
        String filename = file.getAbsolutePath();
        imgtxt.setText(filename);
    }//GEN-LAST:event_imgActionPerformed

    private void savebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtActionPerformed
        String name = nametxt.getText();
        String price = pricetxt.getText();
        int quantity = (int) quantityTxt.getValue();
        String description = destxt.getText();
        String img = imgtxt.getText();
        String type = jComboBox1.getSelectedItem().toString();
        
        if (name.isEmpty() || description.isEmpty() || img.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
       
        if (price.matches(".*[a-zA-Z].*")) {
            JOptionPane.showMessageDialog(this, "Price should not contain letters.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(quantity == 0 ){
            JOptionPane.showMessageDialog(this, "Quantity must be greater than 0", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        AddProductController.addProduct(name, price, quantity, description,img, type);
       
        JOptionPane.showMessageDialog(this, "Product added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_savebtActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        nametxt.setText("");
        pricetxt.setText("");
        destxt.setText("");
        imgtxt.setText("");
    }//GEN-LAST:event_kButton1ActionPerformed
                                                                                                                                                                                     


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
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        FlatMacLightLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField destxt;
    private javax.swing.JButton img;
    private javax.swing.JTextField imgtxt;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private com.k33ptoo.components.KButton kButton1;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField pricetxt;
    private javax.swing.JSpinner quantityTxt;
    private com.k33ptoo.components.KButton savebt;
    // End of variables declaration//GEN-END:variables
}
