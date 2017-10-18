/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

/**
 *
 * @author edwin
 */
public class MensajePlantilla extends javax.swing.JDialog {

    /**
     * Creates new form MensajePlantilla
     */
    public MensajePlantilla(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.icono.setVisible(false);
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
        jPanel2 = new javax.swing.JPanel();
        BtnCancelar1 = new javax.swing.JButton();
        txtMensaje = new javax.swing.JLabel();
        icono = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtTipoMensaje = new javax.swing.JLabel();
        BtnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(35, 48, 54));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(3, 19, 27));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnCancelar1.setBackground(new java.awt.Color(153, 0, 0));
        BtnCancelar1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        BtnCancelar1.setForeground(new java.awt.Color(255, 255, 255));
        BtnCancelar1.setText("CERRAR");
        BtnCancelar1.setBorder(null);
        BtnCancelar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCancelar1.setFocusPainted(false);
        BtnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelar1ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 60, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 370, 40));

        txtMensaje.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtMensaje.setForeground(new java.awt.Color(255, 255, 255));
        txtMensaje.setText("Mensaje--->");
        jPanel1.add(txtMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 280, 30));

        icono.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        icono.setForeground(new java.awt.Color(255, 255, 255));
        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/advertencia.png"))); // NOI18N
        icono.setFocusable(false);
        icono.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        icono.setIconTextGap(-10);
        jPanel1.add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 40, 40));

        jPanel3.setBackground(new java.awt.Color(3, 19, 27));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTipoMensaje.setBackground(new java.awt.Color(3, 19, 27));
        txtTipoMensaje.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtTipoMensaje.setForeground(new java.awt.Color(255, 255, 255));
        txtTipoMensaje.setText("TIPO DE MENSAJE");
        jPanel3.add(txtTipoMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 340, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 20));

        BtnCancelar.setBackground(new java.awt.Color(153, 0, 0));
        BtnCancelar.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        BtnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        BtnCancelar.setText("mostrar icono");
        BtnCancelar.setBorder(null);
        BtnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCancelar.setFocusPainted(false);
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 100, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed

        this.icono.setVisible(true);
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnCancelar1ActionPerformed

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
            java.util.logging.Logger.getLogger(MensajePlantilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MensajePlantilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MensajePlantilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MensajePlantilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MensajePlantilla dialog = new MensajePlantilla(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnCancelar1;
    private javax.swing.JLabel icono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtMensaje;
    private javax.swing.JLabel txtTipoMensaje;
    // End of variables declaration//GEN-END:variables
}