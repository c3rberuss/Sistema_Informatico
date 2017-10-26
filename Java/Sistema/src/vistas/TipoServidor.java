/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.swing.ImageIcon;

/**
 *
 * @author edwin
 */
public class TipoServidor extends javax.swing.JFrame {

    private int respuesta;
    
    public TipoServidor() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Recursos/imagenes/icono2.png")).getImage());
        setRespuesta(2);
    }

    private void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }
    private int getRespuesta() {
        return this.respuesta;
    }
    
    public int elegirServidor(){
        
        return getRespuesta();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTipoMensaje = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtTipoMensaje1 = new javax.swing.JLabel();
        btnLocal = new javax.swing.JButton();
        btnRemoto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(3, 19, 27));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTipoMensaje.setBackground(new java.awt.Color(3, 19, 27));
        txtTipoMensaje.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtTipoMensaje.setForeground(new java.awt.Color(255, 255, 255));
        txtTipoMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTipoMensaje.setText("BIENVENIDO AL SISTEMA DE GESTION DE VENTAS");
        jPanel1.add(txtTipoMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 40));

        jPanel2.setBackground(new java.awt.Color(3, 19, 27));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancelar.setBackground(new java.awt.Color(102, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnCancelar.setText("CANCELAR Y CERRAR");
        btnCancelar.setBorder(null);
        btnCancelar.setFocusPainted(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 130, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 450, 40));

        jPanel3.setBackground(new java.awt.Color(35, 48, 54));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTipoMensaje1.setBackground(new java.awt.Color(3, 19, 27));
        txtTipoMensaje1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTipoMensaje1.setForeground(new java.awt.Color(255, 255, 255));
        txtTipoMensaje1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTipoMensaje1.setText("SELECCIONE EL TIPO DE SERVIDOR A UTILIZAR");
        jPanel3.add(txtTipoMensaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 450, 20));

        btnLocal.setBackground(new java.awt.Color(3, 19, 27));
        btnLocal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnLocal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/local.png"))); // NOI18N
        btnLocal.setText("LOCAL");
        btnLocal.setBorder(null);
        btnLocal.setFocusPainted(false);
        btnLocal.setIconTextGap(10);
        btnLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalActionPerformed(evt);
            }
        });
        jPanel3.add(btnLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 130, 50));

        btnRemoto.setBackground(new java.awt.Color(3, 19, 27));
        btnRemoto.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnRemoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/remoto.png"))); // NOI18N
        btnRemoto.setText("REMOTO");
        btnRemoto.setBorder(null);
        btnRemoto.setFocusPainted(false);
        btnRemoto.setIconTextGap(10);
        btnRemoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemotoActionPerformed(evt);
            }
        });
        jPanel3.add(btnRemoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 130, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 450, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        setRespuesta(2);
        elegirServidor();
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalActionPerformed
        setRespuesta(0);
        elegirServidor();
        this.dispose();
    }//GEN-LAST:event_btnLocalActionPerformed

    private void btnRemotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemotoActionPerformed
        setRespuesta(1);
        elegirServidor();
        this.dispose();
    }//GEN-LAST:event_btnRemotoActionPerformed

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
            java.util.logging.Logger.getLogger(TipoServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipoServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipoServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipoServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TipoServidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLocal;
    private javax.swing.JButton btnRemoto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtTipoMensaje;
    private javax.swing.JLabel txtTipoMensaje1;
    // End of variables declaration//GEN-END:variables
}


