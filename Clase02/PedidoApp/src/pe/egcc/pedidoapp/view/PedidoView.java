package pe.egcc.pedidoapp.view;

import javax.swing.JOptionPane;
import pe.egcc.pedidoapp.service.PedidoService;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog gcoronelc.blogspot.com
 * @github github.com/gcoronelc
 */
public class PedidoView extends javax.swing.JFrame {

  /**
   * Creates new form PedidoView
   */
  public PedidoView() {
    initComponents();
    this.setLocationRelativeTo(null);
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    txtImporte = new javax.swing.JTextField();
    btnProcesar = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("PEDIDO APP");

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel1.setText("Importe:");

    txtImporte.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

    btnProcesar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    btnProcesar.setText("Procesar");
    btnProcesar.setName(""); // NOI18N
    btnProcesar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnProcesarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(60, 60, 60)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
          .addComponent(txtImporte))
        .addGap(41, 41, 41)
        .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(92, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(55, 55, 55)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(btnProcesar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(72, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
    // Dato
    double importe;
    importe = Double.parseDouble( txtImporte.getText() );
    // Proceso
    PedidoService service;
    service = new PedidoService();
    double impuesto  = service.calcularImpuesto(importe);
    double total  = service.calcularTotal(importe);
    // Reporte
    String repo = "";
    repo += "Importe: " + importe + "\n";
    repo += "Impuesto: " + impuesto + "\n";
    repo += "Total: " + total + "\n";
    JOptionPane.showMessageDialog(rootPane, repo);
  }//GEN-LAST:event_btnProcesarActionPerformed

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
      java.util.logging.Logger.getLogger(PedidoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(PedidoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(PedidoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(PedidoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new PedidoView().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnProcesar;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JTextField txtImporte;
  // End of variables declaration//GEN-END:variables
}
