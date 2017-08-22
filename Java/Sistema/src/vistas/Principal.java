/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;


import servicios.Configuracion;

/**
 *
 * @author josuee
 */
public class Principal extends javax.swing.JFrame {

    public Principal(){
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        Configuracion config = new Configuracion();
        boolean sesionActive = Boolean.valueOf(config.getConfProperty("sesion.active"));
        
        if(!sesionActive){
            Login log = new Login(this, true);
            log.setLocationRelativeTo(null);
            log.setVisible(true);
        }
        
        String userType = config.getConfProperty("user.type");
        if(!userType.equalsIgnoreCase("admin")){
            this.MenuBar.getMenu(1).disable();
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

        MenuBar = new javax.swing.JMenuBar();
        MenuVentas = new javax.swing.JMenu();
        buscar_ventas = new javax.swing.JMenuItem();
        MenuAdmin = new javax.swing.JMenu();
        MenuInventario = new javax.swing.JMenu();
        MenuUsuarios = new javax.swing.JMenu();
        MenuConfiguracion = new javax.swing.JMenu();
        MenuConexion = new javax.swing.JMenuItem();
        AcercaDe = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuBar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        MenuBar.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        MenuBar.setMargin(new java.awt.Insets(5, 5, 5, 5));

        MenuVentas.setText("Ventas");

        buscar_ventas.setText("Buscar");
        buscar_ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buscar_ventasMousePressed(evt);
            }
        });
        MenuVentas.add(buscar_ventas);

        MenuBar.add(MenuVentas);

        MenuAdmin.setText("Administración");

        MenuInventario.setText("Inventario");
        MenuAdmin.add(MenuInventario);

        MenuUsuarios.setText("Usuarios");
        MenuAdmin.add(MenuUsuarios);

        MenuConfiguracion.setText("Configuración");

        MenuConexion.setText("Conexión");
        MenuConexion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuConexionMousePressed(evt);
            }
        });
        MenuConfiguracion.add(MenuConexion);

        MenuAdmin.add(MenuConfiguracion);

        MenuBar.add(MenuAdmin);

        AcercaDe.setText("Acerca de");
        MenuBar.add(AcercaDe);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuConexionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuConexionMousePressed
            Config cfg = new Config(this, true);
            cfg.setLocationRelativeTo(null);
            cfg.setVisible(true);
            
            
    }//GEN-LAST:event_MenuConexionMousePressed

    private void buscar_ventasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_ventasMousePressed
        Busqueda search = new Busqueda(this, true);
        search.setLocationRelativeTo(null);
        search.setVisible(true);
    }//GEN-LAST:event_buscar_ventasMousePressed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AcercaDe;
    private javax.swing.JMenu MenuAdmin;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem MenuConexion;
    private javax.swing.JMenu MenuConfiguracion;
    private javax.swing.JMenu MenuInventario;
    private javax.swing.JMenu MenuUsuarios;
    private javax.swing.JMenu MenuVentas;
    private javax.swing.JMenuItem buscar_ventas;
    // End of variables declaration//GEN-END:variables
}
