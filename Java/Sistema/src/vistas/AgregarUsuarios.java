/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import servicios.Usuarios;
import servicios.Ventana;
import sistema.Sistema;

/**
 *
 * @author edwin
 */
public class AgregarUsuarios extends javax.swing.JDialog implements Ventana{

    private Usuarios users;
    private String[] datos;
    
    public AgregarUsuarios(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        users = Sistema.getFactory().usuarios();
        datos = new String[4];
        this.txtID.setText(users.generateId());
        this.txtID.disable();
        
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
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        txtID = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtTipoUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtContra = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        BtnAgregarVistaPrevia = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        UsuariosAgregados = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BtnLimpiar = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BtnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/addPequeño.png"))); // NOI18N
        jLabel1.setText("AGREGAR USUARIOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 740, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 50));

        jPanel3.setBackground(new java.awt.Color(35, 48, 54));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(3, 19, 27));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PARA AGREGARLOS AL SISTEMA:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 280, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NOMBRE DE USUARIO:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 280, 20));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID DEL USUARIO:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 280, 20));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TIPO DE USUARIO:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 280, 20));

        txtUsuario.setBackground(new java.awt.Color(3, 19, 27));
        txtUsuario.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setToolTipText("Nombre de usuario");
        txtUsuario.setBorder(null);
        txtUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel4.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 260, 20));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 260, 10));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 260, 10));

        txtID.setBackground(new java.awt.Color(3, 19, 27));
        txtID.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        txtID.setForeground(new java.awt.Color(255, 255, 255));
        txtID.setToolTipText("ID");
        txtID.setBorder(null);
        txtID.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel4.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 260, 20));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 110, 10));

        txtTipoUsuario.setBackground(new java.awt.Color(3, 19, 27));
        txtTipoUsuario.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        txtTipoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtTipoUsuario.setText("Empleado");
        txtTipoUsuario.setToolTipText("Tipo de usuario");
        txtTipoUsuario.setBorder(null);
        txtTipoUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTipoUsuario.setEnabled(false);
        jPanel4.add(txtTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 110, 20));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("INGRESE TODOS LOS DATOS CORRECTAMENTE  ");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 280, 20));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CONTRASEÑA DE USUARIO:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 280, 20));

        txtContra.setBackground(new java.awt.Color(3, 19, 27));
        txtContra.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        txtContra.setForeground(new java.awt.Color(255, 255, 255));
        txtContra.setToolTipText("Contraseña para ingresar al sistema");
        txtContra.setBorder(null);
        txtContra.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel4.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 260, 20));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 260, 10));

        BtnAgregarVistaPrevia.setBackground(new java.awt.Color(0, 102, 0));
        BtnAgregarVistaPrevia.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        BtnAgregarVistaPrevia.setForeground(new java.awt.Color(255, 255, 255));
        BtnAgregarVistaPrevia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/listarSuperPequenho.png"))); // NOI18N
        BtnAgregarVistaPrevia.setText("AGREGAR A VISTA PREVIA");
        BtnAgregarVistaPrevia.setToolTipText("Agregar a vista previa");
        BtnAgregarVistaPrevia.setBorder(null);
        BtnAgregarVistaPrevia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAgregarVistaPrevia.setFocusPainted(false);
        BtnAgregarVistaPrevia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnAgregarVistaPreviaMousePressed(evt);
            }
        });
        BtnAgregarVistaPrevia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarVistaPreviaActionPerformed(evt);
            }
        });
        jPanel4.add(BtnAgregarVistaPrevia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 180, 30));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 460));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 10, 440));

        UsuariosAgregados.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        UsuariosAgregados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "USUARIO", "CONTRASEÑA", "TIPO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        UsuariosAgregados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(UsuariosAgregados);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 420, 300));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ESTAS POR AGREGAR AL SISTEMA:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 410, 30));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/vista.png"))); // NOI18N
        jLabel9.setText("ACA PUEDES TENER LA VISTA PREVIA DE LOS USUARIOS QUE");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 410, 20));

        BtnLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        BtnLimpiar.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        BtnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        BtnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/escoba.png"))); // NOI18N
        BtnLimpiar.setText("LIMPIAR");
        BtnLimpiar.setToolTipText("limpiar la tabla de articulos");
        BtnLimpiar.setBorder(null);
        BtnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnLimpiar.setFocusPainted(false);
        BtnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnLimpiarMousePressed(evt);
            }
        });
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 80, 30));

        BtnAgregar.setBackground(new java.awt.Color(0, 102, 0));
        BtnAgregar.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        BtnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        BtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/addSuperPequenho.png"))); // NOI18N
        BtnAgregar.setText("AGREGAR AL SISTEMA");
        BtnAgregar.setToolTipText("Agregar al sistema");
        BtnAgregar.setBorder(null);
        BtnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAgregar.setFocusPainted(false);
        BtnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnAgregarMousePressed(evt);
            }
        });
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        jPanel3.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 160, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 750, 460));

        jPanel2.setBackground(new java.awt.Color(3, 19, 27));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnCerrar.setBackground(new java.awt.Color(153, 0, 0));
        BtnCerrar.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        BtnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        BtnCerrar.setText("CERRAR");
        BtnCerrar.setToolTipText("Cerrar");
        BtnCerrar.setBorder(null);
        BtnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCerrar.setFocusPainted(false);
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 60, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 750, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAgregarVistaPreviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarVistaPreviaActionPerformed

    }//GEN-LAST:event_BtnAgregarVistaPreviaActionPerformed

    private void BtnLimpiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarMousePressed
        limpiar("tabla");
    }//GEN-LAST:event_BtnLimpiarMousePressed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed

    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed

        this.dispose();
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void BtnAgregarVistaPreviaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAgregarVistaPreviaMousePressed
        
        String[] datos ={
            this.txtID.getText(),
            this.txtUsuario.getText(),
            this.txtContra.getText(),
            this.txtTipoUsuario.getText()
        };
        
        if(!datos[0].isEmpty() && !datos[1].isEmpty() && !datos[2].isEmpty()){
            this.UsuariosAgregados.setModel(users.addTable(this.UsuariosAgregados, datos));
            this.UsuariosAgregados.repaint();
            limpiar("campos");
        }else{
            JOptionPane.showMessageDialog(null, "¡Algunos campos están vacíos!");
        }
 
    }//GEN-LAST:event_BtnAgregarVistaPreviaMousePressed

    private void BtnAgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAgregarMousePressed
        int cols = this.UsuariosAgregados.getModel().getColumnCount();
        int fils = this.UsuariosAgregados.getModel().getRowCount();
        for(int i=0; i<fils; i++) {
            for(int j=0; j<cols; j++){
                this.datos[j] = this.UsuariosAgregados.getModel().getValueAt(i,j).toString();
            }
            users.addUsers(getDatos());
        }
        
        limpiar("tabla");
        JOptionPane.showMessageDialog(null, "Usuarios Agregados Exitosamente");
    }//GEN-LAST:event_BtnAgregarMousePressed

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
            java.util.logging.Logger.getLogger(AgregarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgregarUsuarios dialog = new AgregarUsuarios(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnAgregarVistaPrevia;
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JTable UsuariosAgregados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField txtContra;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtTipoUsuario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    @Override
    public void limpiar(String lugar) {
        switch(lugar){
            case "campos":
                this.txtContra.setText("");
                this.txtID.setText("");
                this.txtUsuario.setText("");
                break;
            case "tabla":
                DefaultTableModel modelo=(DefaultTableModel) this.UsuariosAgregados.getModel();
                int filas=this.UsuariosAgregados.getRowCount();
                for (int i = 0;i<filas; i++) {
                    modelo.removeRow(0);
                }
                break;
        }
    }
    
    public String[] getDatos() {
        return datos;
    }
}
