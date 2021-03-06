/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.app.view;

import javax.swing.JOptionPane;
import pe.egcc.app.model.Producto;

/**
 *
 * @author Administrador
 */
public class Demo02 extends javax.swing.JFrame {

  /**
   * Creates new form Demo01
   */
  public Demo02() {
    initComponents();
    this.setLocationRelativeTo(null);
    llenarProductos();
  }

  private void llenarProductos() {
    cboProducto.removeAllItems();
    cboProducto.addItem(new Producto(100, "Coca Cola", 3.5, 1000));
    cboProducto.addItem(new Producto(200, "Cafe Colombiana", 10.5, 2000));
    cboProducto.addItem(new Producto(300, "Empanada de Pollo", 8.2, 2000));
    cboProducto.addItem(new Producto(400, "Inka Cola", 3.5, 800));
    cboProducto.addItem(new Producto(500, "Peru Cola", 2.5, 500));
    cboProducto.setSelectedIndex(-1);
    lblPrecio.setText("Precio: ");
    lblStock.setText("Stock: ");
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
    lblPrecio = new javax.swing.JLabel();
    lblStock = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    cboProducto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    cboProducto.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cboProductoActionPerformed(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel1.setText("Producto");

    btnVerProducto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    btnVerProducto.setText("Ver");
    btnVerProducto.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnVerProductoActionPerformed(evt);
      }
    });

    lblPrecio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    lblPrecio.setText("Precio: ");

    lblStock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    lblStock.setText("Stock:");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(28, 28, 28)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(lblPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(cboProducto, 0, 237, Short.MAX_VALUE))
          .addComponent(lblStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(18, 18, 18)
        .addComponent(btnVerProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(41, 41, 41)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(cboProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
            .addComponent(btnVerProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)))
        .addGap(45, 45, 45)
        .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(lblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(67, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnVerProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerProductoActionPerformed
    // Item seleccinado
    int index = cboProducto.getSelectedIndex();
    String texto = cboProducto.getSelectedItem().toString();
    // Mostrar
    String repo = index + " ==> " + texto;
    JOptionPane.showMessageDialog(rootPane, repo);
  }//GEN-LAST:event_btnVerProductoActionPerformed

  private void cboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProductoActionPerformed
    int index = cboProducto.getSelectedIndex();
    if (index == -1) {
      return;
    }
    Producto p = (Producto) cboProducto.getSelectedItem();
    lblPrecio.setText("Precio: " + p.getPrecio());
    lblStock.setText("Stock: " + p.getStock());
  }//GEN-LAST:event_cboProductoActionPerformed

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
      java.util.logging.Logger.getLogger(Demo02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Demo02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Demo02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Demo02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Demo02().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnVerProducto;
  private javax.swing.JComboBox<Producto> cboProducto;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel lblPrecio;
  private javax.swing.JLabel lblStock;
  // End of variables declaration//GEN-END:variables
}
