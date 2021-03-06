/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.app.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Demo01 extends javax.swing.JFrame {

  /**
   * Creates new form Demo01
   */
  public Demo01() {
    initComponents();
    this.setLocationRelativeTo(null);
    llenarCiudades();
  }

  private void llenarCiudades() {
    cboCiudad.removeAllItems();
    cboCiudad.addItem("Chiclayo");
    cboCiudad.addItem("Arequipa");
    cboCiudad.addItem("Cuzco");
    cboCiudad.addItem("Huancayo");
    cboCiudad.addItem("Ayacucho");
    cboCiudad.setSelectedIndex(-1);
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    cboProducto = new javax.swing.JComboBox<>();
    jLabel1 = new javax.swing.JLabel();
    btnVerProducto = new javax.swing.JButton();
    cboCiudad = new javax.swing.JComboBox<>();
    jLabel2 = new javax.swing.JLabel();
    btnVerCiudad = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    cboProducto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    cboProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coca Cola", "Inka Cola", "Peru Cola", "Free Tea", "San Mateo", " " }));

    jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel1.setText("Producto");

    btnVerProducto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    btnVerProducto.setText("Ver");
    btnVerProducto.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnVerProductoActionPerformed(evt);
      }
    });

    cboCiudad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    cboCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coca Cola", "Inka Cola", "Peru Cola", "Free Tea", "San Mateo", " " }));

    jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel2.setText("Ciudad");

    btnVerCiudad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    btnVerCiudad.setText("Ver");
    btnVerCiudad.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnVerCiudadActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(28, 28, 28)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(cboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnVerProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(cboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnVerCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(26, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(41, 41, 41)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(cboProducto)
          .addComponent(btnVerProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(cboCiudad)
          .addComponent(btnVerCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(151, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnVerProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerProductoActionPerformed
    // Item seleccinado
    int index = cboProducto.getSelectedIndex();
    String texto = cboProducto.getSelectedItem().toString();
    // Mostrar
    String repo = index + " - " + texto;
    JOptionPane.showMessageDialog(rootPane, repo);
  }//GEN-LAST:event_btnVerProductoActionPerformed

  private void btnVerCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCiudadActionPerformed
    // Item seleccinado
    int index = cboCiudad.getSelectedIndex();
    String texto = "No hay ningun elemento seleccionado";
    if (index > -1) {
      texto = cboCiudad.getSelectedItem().toString();
    }
    // Mostrar
    String repo = index + " - " + texto;
    JOptionPane.showMessageDialog(rootPane, repo);
  }//GEN-LAST:event_btnVerCiudadActionPerformed

  /**
   * @param args the command line arguments
   */
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
      java.util.logging.Logger.getLogger(Demo01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Demo01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Demo01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Demo01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Demo01().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnVerCiudad;
  private javax.swing.JButton btnVerProducto;
  private javax.swing.JComboBox<String> cboCiudad;
  private javax.swing.JComboBox<String> cboProducto;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  // End of variables declaration//GEN-END:variables
}
