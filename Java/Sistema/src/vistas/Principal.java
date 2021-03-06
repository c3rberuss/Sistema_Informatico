/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;


import factory.Factory;
import javax.swing.ImageIcon;
import servicios.Configuracion;
import servicios.Usuarios;
import servicios.Venta;


/**
 *
 * @author josuee
 */
public class Principal extends javax.swing.JFrame {

    private Factory factory;
    
    public Principal(){
        initComponents();
        System.out.println("ventana principal iniciada");
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        setIconImage(new ImageIcon(getClass().getResource("/Recursos/imagenes/icono2.png")).getImage());
        
        this.menuSesion.setText(Usuarios.nick().toUpperCase()+" | "+Usuarios.userType().toUpperCase());
        
        factory = new Factory();
        Configuracion config = factory.configuraciones();

        String userType = config.getConfProperty("user.type");
        if(userType.equalsIgnoreCase("empleado")){
           this.BtnConfiguracion.setEnabled(false);
           this.BtnInventario.setEnabled(false);
           this.BtnReportes.setEnabled(false);
           this.BtnUsuarios.setEnabled(false);
        }else if(userType.equalsIgnoreCase("admin")){
           this.BtnConfiguracion.setEnabled(true);
           this.BtnInventario.setEnabled(true);
           this.BtnReportes.setEnabled(true);
           this.BtnUsuarios.setEnabled(true);
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
        BtnConfiguracion = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        BtnInventario = new javax.swing.JButton();
        BtnUsuarios = new javax.swing.JButton();
        BtnCarrito = new javax.swing.JButton();
        BtnReportes = new javax.swing.JButton();
        BtnAyuda = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        BtnAcercaDe = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuSesion = new javax.swing.JMenu();
        closeSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de ventas |  [Nombre de la empresa]");
        setMinimumSize(new java.awt.Dimension(1090, 690));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(35, 48, 54));
        jPanel1.setMinimumSize(new java.awt.Dimension(1050, 630));

        BtnConfiguracion.setBackground(new java.awt.Color(3, 19, 27));
        BtnConfiguracion.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        BtnConfiguracion.setForeground(new java.awt.Color(255, 255, 255));
        BtnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/ajustes50.png"))); // NOI18N
        BtnConfiguracion.setText("CONFIGURACION");
        BtnConfiguracion.setBorder(null);
        BtnConfiguracion.setBorderPainted(false);
        BtnConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnConfiguracion.setFocusPainted(false);
        BtnConfiguracion.setIconTextGap(30);
        BtnConfiguracion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/ajustes.png"))); // NOI18N
        BtnConfiguracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnConfiguracionMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnConfiguracionMousePressed(evt);
            }
        });
        BtnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfiguracionActionPerformed(evt);
            }
        });

        BtnBuscar.setBackground(new java.awt.Color(3, 19, 27));
        BtnBuscar.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        BtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/buscar50.png"))); // NOI18N
        BtnBuscar.setText("BUSCAR");
        BtnBuscar.setBorder(null);
        BtnBuscar.setBorderPainted(false);
        BtnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnBuscar.setFocusPainted(false);
        BtnBuscar.setIconTextGap(30);
        BtnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/buscar1.png"))); // NOI18N
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        BtnInventario.setBackground(new java.awt.Color(3, 19, 27));
        BtnInventario.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        BtnInventario.setForeground(new java.awt.Color(255, 255, 255));
        BtnInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/inventario50.png"))); // NOI18N
        BtnInventario.setText("INVENTARIO");
        BtnInventario.setBorder(null);
        BtnInventario.setBorderPainted(false);
        BtnInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnInventario.setFocusPainted(false);
        BtnInventario.setIconTextGap(30);
        BtnInventario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/inventario.png"))); // NOI18N
        BtnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInventarioActionPerformed(evt);
            }
        });

        BtnUsuarios.setBackground(new java.awt.Color(3, 19, 27));
        BtnUsuarios.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        BtnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        BtnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/usuarios50.png"))); // NOI18N
        BtnUsuarios.setText("USUARIOS");
        BtnUsuarios.setBorder(null);
        BtnUsuarios.setBorderPainted(false);
        BtnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnUsuarios.setFocusPainted(false);
        BtnUsuarios.setIconTextGap(30);
        BtnUsuarios.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/usuarios.png"))); // NOI18N
        BtnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUsuariosActionPerformed(evt);
            }
        });

        BtnCarrito.setBackground(new java.awt.Color(3, 19, 27));
        BtnCarrito.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        BtnCarrito.setForeground(new java.awt.Color(255, 255, 255));
        BtnCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/vender50.png"))); // NOI18N
        BtnCarrito.setText("INICIAR VENTA");
        BtnCarrito.setBorder(null);
        BtnCarrito.setBorderPainted(false);
        BtnCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCarrito.setFocusPainted(false);
        BtnCarrito.setIconTextGap(30);
        BtnCarrito.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/vender.png"))); // NOI18N
        BtnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCarritoActionPerformed(evt);
            }
        });

        BtnReportes.setBackground(new java.awt.Color(3, 19, 27));
        BtnReportes.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        BtnReportes.setForeground(new java.awt.Color(255, 255, 255));
        BtnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/report50.png"))); // NOI18N
        BtnReportes.setText("REPORTES");
        BtnReportes.setBorder(null);
        BtnReportes.setBorderPainted(false);
        BtnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnReportes.setFocusPainted(false);
        BtnReportes.setIconTextGap(30);
        BtnReportes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/report.png"))); // NOI18N
        BtnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnReportesMouseClicked(evt);
            }
        });
        BtnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReportesActionPerformed(evt);
            }
        });

        BtnAyuda.setBackground(new java.awt.Color(3, 19, 27));
        BtnAyuda.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        BtnAyuda.setForeground(new java.awt.Color(255, 255, 255));
        BtnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/ayuda50.png"))); // NOI18N
        BtnAyuda.setText("AYUDA");
        BtnAyuda.setToolTipText("");
        BtnAyuda.setBorder(null);
        BtnAyuda.setBorderPainted(false);
        BtnAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAyuda.setFocusPainted(false);
        BtnAyuda.setIconTextGap(30);
        BtnAyuda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/ayuda.png"))); // NOI18N
        BtnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAyudaActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(3, 19, 27));
        jButton8.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("[POR ASIGNAR]");
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setFocusPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        BtnAcercaDe.setBackground(new java.awt.Color(3, 19, 27));
        BtnAcercaDe.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        BtnAcercaDe.setForeground(new java.awt.Color(255, 255, 255));
        BtnAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/dev50.png"))); // NOI18N
        BtnAcercaDe.setText("ACERCA DE");
        BtnAcercaDe.setBorder(null);
        BtnAcercaDe.setBorderPainted(false);
        BtnAcercaDe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAcercaDe.setFocusPainted(false);
        BtnAcercaDe.setIconTextGap(30);
        BtnAcercaDe.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/dev.png"))); // NOI18N
        BtnAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAcercaDeActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(3, 19, 27));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("[NOMBRE DE EMPRESA] | SISTEMA DE GESTION DE VENTAS");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/segundoIcono.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(76, 76, 76)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)))
        );

        jPanel3.setBackground(new java.awt.Color(3, 19, 27));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("[NOMBRE DE EMPRESA] | TODOS LOS DERECHOS RESERVADOS ® 2017");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnAyuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnUsuarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnConfiguracion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnInventario, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                    .addComponent(BtnReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnAcercaDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(BtnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(BtnCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnAyuda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnAcercaDe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setBackground(new java.awt.Color(3, 19, 27));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setAlignmentX(70.0F);
        jMenuBar1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        menuSesion.setBackground(new java.awt.Color(0, 153, 0));
        menuSesion.setBorder(null);
        menuSesion.setForeground(new java.awt.Color(255, 255, 255));
        menuSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/user.png"))); // NOI18N
        menuSesion.setText("NOMBRE DE USUARIO + TIPO DE USUARIO");
        menuSesion.setToolTipText("Su usuario");
        menuSesion.setBorderPainted(false);
        menuSesion.setContentAreaFilled(false);
        menuSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuSesion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        menuSesion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        menuSesion.setOpaque(false);

        closeSesion.setBackground(new java.awt.Color(3, 19, 27));
        closeSesion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        closeSesion.setForeground(new java.awt.Color(255, 255, 255));
        closeSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/cerrarSesion.png"))); // NOI18N
        closeSesion.setText("CERRAR SESION Y SALIR");
        closeSesion.setToolTipText("Cerrar sesion y salir");
        closeSesion.setBorder(null);
        closeSesion.setBorderPainted(false);
        closeSesion.setContentAreaFilled(false);
        closeSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeSesionActionPerformed(evt);
            }
        });
        menuSesion.add(closeSesion);

        jMenuBar1.add(menuSesion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnConfiguracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnConfiguracionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnConfiguracionMouseClicked

    private void BtnConfiguracionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnConfiguracionMousePressed

    }//GEN-LAST:event_BtnConfiguracionMousePressed

    private void BtnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfiguracionActionPerformed
        Config conf = new Config(this,true);
        conf.ventana();
        conf.setVisible(true);
    }//GEN-LAST:event_BtnConfiguracionActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        Busqueda bus = new Busqueda(this,true);
        bus.setVisible(true);
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInventarioActionPerformed
        Opciones_inventario opIn = new Opciones_inventario(new javax.swing.JDialog(),true);
        opIn.setVisible(true);
    }//GEN-LAST:event_BtnInventarioActionPerformed

    private void BtnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCarritoActionPerformed

        Carrito car = new Carrito(this,true);
        car.setVisible(true);
    }//GEN-LAST:event_BtnCarritoActionPerformed

    private void BtnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUsuariosActionPerformed
        Opciones_usuarios opUsu= new Opciones_usuarios(new javax.swing.JDialog(),true);
        opUsu.setVisible(true);
    }//GEN-LAST:event_BtnUsuariosActionPerformed

    private void closeSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeSesionActionPerformed
        Configuracion conf = factory.configuraciones();
        conf.setConfProperty("sesion.active", "false");
        conf.setConfProperty("sesion.close", "true");
        Login1 log = factory.ventanaLogin(null, false);
        log.setVisible(true);
        log.setLocationRelativeTo(null);  
        this.dispose();
    }//GEN-LAST:event_closeSesionActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void BtnReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnReportesMouseClicked

    }//GEN-LAST:event_BtnReportesMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       Venta venta = new Venta();
       venta.vaciarCarrito();
    }//GEN-LAST:event_formWindowClosing

    private void BtnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReportesActionPerformed
        Opciones_reportes opRe= new Opciones_reportes(this,true);
        opRe.setVisible(true);
    }//GEN-LAST:event_BtnReportesActionPerformed

    private void BtnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAyudaActionPerformed
        Ayuda ayu = new Ayuda(this,true);
        ayu.setVisible(true);
    }//GEN-LAST:event_BtnAyudaActionPerformed

    private void BtnAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAcercaDeActionPerformed
        AcercaDe ad = new AcercaDe(this,true);
        ad.setVisible(true);
    }//GEN-LAST:event_BtnAcercaDeActionPerformed

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
    private javax.swing.JButton BtnAcercaDe;
    private javax.swing.JButton BtnAyuda;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCarrito;
    private javax.swing.JButton BtnConfiguracion;
    private javax.swing.JButton BtnInventario;
    private javax.swing.JButton BtnReportes;
    private javax.swing.JButton BtnUsuarios;
    private javax.swing.JMenuItem closeSesion;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenu menuSesion;
    // End of variables declaration//GEN-END:variables
}
