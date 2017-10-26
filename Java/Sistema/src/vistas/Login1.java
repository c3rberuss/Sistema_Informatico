/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import factory.Factory;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import servicios.Configuracion;
import servicios.Usuarios;
import servicios.Ventana;
import sistema.Sistema;
import vistas.MensajePlantilla;

/**
 *
 * @author edwin
 */
public class Login1 extends javax.swing.JFrame implements Ventana{

    private Configuracion config;
    private Factory factory;
    
    //variables para mover ventana
    int x,y;
    public Login1() {
        initComponents();
        factory = new Factory();
        setIconImage(new ImageIcon(getClass().getResource("/Recursos/imagenes/icono2.png")).getImage());
    }
    
    public Configuracion getConfig() {
        return config;
    }

    public void setConfig(Configuracion config) {
        this.config = config;
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
        lbBolsa = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtPass = new javax.swing.JPasswordField();
        txtUser = new javax.swing.JTextField();
        btnCerrar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        btnCerrar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesion |  [Nombre de la empresa]");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(35, 48, 54));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("[NOMBRE DE LA EMPRESA]");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 340, 30));

        lbBolsa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBolsa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/gif.gif"))); // NOI18N
        jPanel1.add(lbBolsa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 340, 160));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 370));

        jPanel2.setBackground(new java.awt.Color(3, 19, 27));
        jPanel2.setMinimumSize(new java.awt.Dimension(240, 367));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONTRASEÑA:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 100, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INICIAR SESION");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 230, 30));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USUARIO:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 60, 30));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 200, 10));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 200, 10));

        txtPass.setBackground(new java.awt.Color(3, 19, 27));
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setToolTipText("Ingrese su contraseña");
        txtPass.setBorder(null);
        txtPass.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        jPanel2.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 200, 20));

        txtUser.setBackground(new java.awt.Color(3, 19, 27));
        txtUser.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setToolTipText("Ingrese su usuario");
        txtUser.setBorder(null);
        txtUser.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 200, 20));

        btnCerrar.setBackground(new java.awt.Color(3, 19, 27));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("_");
        btnCerrar.setToolTipText("Minimizar");
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.setFocusPainted(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 40, 20));

        btnIngresar.setBackground(new java.awt.Color(35, 48, 54));
        btnIngresar.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("INICIAR SESION");
        btnIngresar.setToolTipText("Iniciar sesion");
        btnIngresar.setBorder(null);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.setFocusPainted(false);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 90, 30));

        btnCerrar1.setBackground(new java.awt.Color(204, 0, 0));
        btnCerrar1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnCerrar1.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar1.setText("X");
        btnCerrar1.setToolTipText("Salir");
        btnCerrar1.setBorder(null);
        btnCerrar1.setBorderPainted(false);
        btnCerrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar1.setFocusPainted(false);
        btnCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnCerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 40, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 270, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        setExtendedState(JFrame.CROSSHAIR_CURSOR); 
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        Usuarios usuarios = Sistema.getFactory().usuarios();
        try {

            if(!(this.txtUser.getText().isEmpty() && this.txtPass.getText().isEmpty())){
                Sistema.getCon().setDb("Sistema_DB");
                boolean success = usuarios.login(this.txtUser.getText(), this.txtPass.getText());
                if(success){
                    setConfig(factory.configuraciones());
                    getConfig().setConfProperty("sesion.user", this.txtUser.getText());
                    getConfig().setConfProperty("sesion.active", "true");
                    getConfig().setConfProperty("sesion.pass", this.txtPass.getText());

                    Principal prin = Sistema.getFactory().ventanaPrincipal(null, false);
                    prin.setVisible(true);

                    if(Sistema.getCon().getConexion() != null){
                        Sistema.getCon().closeConexion();
                    }
                    try {
                        Sistema.setCon(Sistema.getFactory().conexion());
                    } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(Login1.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    this.dispose();

                }else{

                    Sistema.getMostrarMensaje().mensaje("error", "Usuario o contraseña incorrectos.\nIntente nuevamente", "ERROR");
                    limpiar("");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        this.setLocation(this.getLocation().x + evt.getX()- x , this.getLocation().y + evt.getY() - y );
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        this.setLocation(this.getLocation().x + evt.getX()- x , this.getLocation().y + evt.getY() - y );
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
         x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void btnCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar1ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnCerrar1ActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        btnIngresarActionPerformed(evt);
    }//GEN-LAST:event_txtPassActionPerformed

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
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCerrar1;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbBolsa;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    @Override
    public void limpiar(String lugar) {
        this.txtPass.setText("");
        this.txtUser.setText("");
    }
}
