/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import servicios.Productos;
import servicios.Ventana;
import sistema.Sistema;

/**
 *
 * @author edwin
 */
public class AgregarProductos extends javax.swing.JDialog implements Ventana {


    private String[] datos = new String[6];
    private Productos product;
    
    private int x, y;
    
     /* Creates new form AgregarUsuario
     * @param parent
     * @param modal
     */
    public AgregarProductos(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.product = Sistema.getFactory().productos();
        this.txtCodigo.setText(product.generateId());
        this.txtCodigo.disable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        txtCodigo = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtPrecio = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtCantidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        BtnAgregarVistaPrevia = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPrecioAdqui = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductosAgregados = new javax.swing.JTable();
        BtnLimpiar = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BtnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
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

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/addPequeño.png"))); // NOI18N
        jLabel1.setText("AGREGAR PRODUCTOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 740, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 50));

        jPanel3.setBackground(new java.awt.Color(35, 48, 54));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(3, 19, 27));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("CANTIDAD EN STOCK DE ESTE  DE PRODUCTO:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 280, 20));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PARA AGREGARLOS A STOCK:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 280, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("NOMBRE DE PRODUCTO:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 280, 20));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("CODIGO DE PRODUCTO:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 280, 20));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("PRECIO DE PRODUCTO:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 280, 20));

        txtProducto.setBackground(new java.awt.Color(3, 19, 27));
        txtProducto.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        txtProducto.setForeground(new java.awt.Color(255, 255, 255));
        txtProducto.setToolTipText("Nombre de producto");
        txtProducto.setBorder(null);
        txtProducto.setCaretColor(new java.awt.Color(255, 255, 255));
        txtProducto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtProductoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProductoFocusLost(evt);
            }
        });
        jPanel4.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 260, 20));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 180, 10));

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 180, 10));

        txtCodigo.setBackground(new java.awt.Color(3, 19, 27));
        txtCodigo.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setToolTipText("Codigo de producto");
        txtCodigo.setBorder(null);
        txtCodigo.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoFocusLost(evt);
            }
        });
        jPanel4.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 260, 20));

        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 55, 10));

        txtPrecio.setBackground(new java.awt.Color(3, 19, 27));
        txtPrecio.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio.setToolTipText("Precio");
        txtPrecio.setBorder(null);
        txtPrecio.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecioFocusLost(evt);
            }
        });
        jPanel4.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 110, 20));

        jSeparator5.setForeground(new java.awt.Color(102, 102, 102));
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 40, 10));

        txtCantidad.setBackground(new java.awt.Color(3, 19, 27));
        txtCantidad.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad.setToolTipText("Cantidad en existencia");
        txtCantidad.setBorder(null);
        txtCantidad.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCantidadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCantidadFocusLost(evt);
            }
        });
        jPanel4.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 80, 20));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("INGRESE TODOS LOS DATOS CORRECTAMENTE  ");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 280, 20));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("DESCRIPCION DE PRODUCTO");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 280, 20));

        txtDescripcion.setBackground(new java.awt.Color(3, 19, 27));
        txtDescripcion.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setToolTipText("Precio");
        txtDescripcion.setBorder(null);
        txtDescripcion.setCaretColor(new java.awt.Color(255, 255, 255));
        txtDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescripcionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescripcionFocusLost(evt);
            }
        });
        jPanel4.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 260, 20));

        jSeparator6.setForeground(new java.awt.Color(102, 102, 102));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 180, 10));

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
        jPanel4.add(BtnAgregarVistaPrevia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 180, 30));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("$");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 10, 20));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("PRECIO DE ADQUISICION PRODUCTO:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 280, 20));

        txtPrecioAdqui.setBackground(new java.awt.Color(3, 19, 27));
        txtPrecioAdqui.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        txtPrecioAdqui.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecioAdqui.setToolTipText("Precio");
        txtPrecioAdqui.setBorder(null);
        txtPrecioAdqui.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPrecioAdqui.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecioAdquiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecioAdquiFocusLost(evt);
            }
        });
        jPanel4.add(txtPrecioAdqui, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 110, 20));

        jSeparator7.setForeground(new java.awt.Color(102, 102, 102));
        jPanel4.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 55, 10));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("$");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 10, 20));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 460));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 10, 440));

        ProductosAgregados.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ProductosAgregados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "CODIGO", "DESCRIPCION", "PRECIO", "STOCK", "COSTO"
            }
        ));
        ProductosAgregados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(ProductosAgregados);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 420, 300));

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
        jPanel3.add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 80, 30));

        BtnAgregar.setBackground(new java.awt.Color(0, 102, 0));
        BtnAgregar.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        BtnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        BtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/addSuperPequenho.png"))); // NOI18N
        BtnAgregar.setText("AGREGAR A INVENTARIO");
        BtnAgregar.setToolTipText("Agregar al inventario");
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
        BtnAgregar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BtnAgregarKeyReleased(evt);
            }
        });
        jPanel3.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 170, 30));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/vista.png"))); // NOI18N
        jLabel9.setText("ACA PUEDES TENER LA VISTA PREVIA DE LOS PRODUCTOS QUE");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 410, 20));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ESTAS POR AGREGAR AL INVENTARIO:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 410, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 750, 460));

        jPanel2.setBackground(new java.awt.Color(3, 19, 27));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnCerrar.setBackground(new java.awt.Color(153, 0, 0));
        BtnCerrar.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        BtnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        BtnCerrar.setText("CERRAR");
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

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed

        this.dispose();
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void BtnLimpiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarMousePressed
        limpiar("tabla");
    }//GEN-LAST:event_BtnLimpiarMousePressed

    private void BtnAgregarVistaPreviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarVistaPreviaActionPerformed
        
    }//GEN-LAST:event_BtnAgregarVistaPreviaActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnAgregarVistaPreviaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAgregarVistaPreviaMousePressed
        String[] datos ={
            this.txtProducto.getText(),
            this.txtCodigo.getText(),
            this.txtDescripcion.getText(),
            this.txtPrecio.getText(),
            this.txtCantidad.getText(),
            this.txtPrecioAdqui.getText()
        };
        
        if(!datos[0].isEmpty() && !datos[1].isEmpty() && !datos[2].isEmpty() && 
                !datos[3].isEmpty() && !datos[4].isEmpty() && !datos[5].isEmpty()){
            this.ProductosAgregados.setModel(product.addTable(this.ProductosAgregados, datos));
            this.ProductosAgregados.repaint();
            limpiar("campos");
        }else{
            JOptionPane.showMessageDialog(null, "¡Algunos campos están vacíos!");
        }
    }//GEN-LAST:event_BtnAgregarVistaPreviaMousePressed

    private void BtnAgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAgregarMousePressed
        int cols = this.ProductosAgregados.getModel().getColumnCount();
        int fils = this.ProductosAgregados.getModel().getRowCount();
        for(int i=0; i<fils; i++) {
            for(int j=0; j<cols; j++){
               
                this.datos[j] = this.ProductosAgregados.getModel().getValueAt(i,j).toString();
                
            }
            product.addProduct(getDatos());
        }
        
        limpiar("tabla");
        JOptionPane.showMessageDialog(null, "Usuarios Agregados Exitosamente");
    }//GEN-LAST:event_BtnAgregarMousePressed

    private void BtnAgregarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnAgregarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAgregarKeyReleased

    private void txtProductoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductoFocusGained
        this.jLabel5.setForeground(new Color(255,255,255,255));
        this.jSeparator2.setForeground(new Color(255,255,255,255));
        this.jSeparator2.setSize(260,10);
    }//GEN-LAST:event_txtProductoFocusGained

    private void txtProductoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductoFocusLost
        this.jLabel5.setForeground(new Color(102,102,102,102));
        this.jSeparator2.setForeground(new Color(102,102,102,102));
        this.jSeparator2.setSize(180,10);
    }//GEN-LAST:event_txtProductoFocusLost

    private void txtCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusGained
        this.jLabel6.setForeground(new Color(255,255,255,255));
        this.jSeparator3.setForeground(new Color(255,255,255,255));
        this.jSeparator3.setSize(260,10);
    }//GEN-LAST:event_txtCodigoFocusGained

    private void txtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusLost
        this.jLabel6.setForeground(new Color(102,102,102,102));
        this.jSeparator3.setForeground(new Color(102,102,102,102));
        this.jSeparator3.setSize(180,10);
    }//GEN-LAST:event_txtCodigoFocusLost

    private void txtDescripcionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescripcionFocusGained
       this.jLabel10.setForeground(new Color(255,255,255,255));
        this.jSeparator6.setForeground(new Color(255,255,255,255));
        this.jSeparator6.setSize(260,10);
    }//GEN-LAST:event_txtDescripcionFocusGained

    private void txtDescripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescripcionFocusLost
        this.jLabel10.setForeground(new Color(102,102,102,102));
        this.jSeparator6.setForeground(new Color(102,102,102,102));
        this.jSeparator6.setSize(180,10);
    }//GEN-LAST:event_txtDescripcionFocusLost

    private void txtPrecioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioFocusGained
        this.jLabel7.setForeground(new Color(255,255,255,255));
        this.jLabel11.setForeground(new Color(255,255,255,255));
        this.jSeparator4.setForeground(new Color(255,255,255,255));
        this.jSeparator4.setSize(110,10);
    }//GEN-LAST:event_txtPrecioFocusGained

    private void txtPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioFocusLost
        this.jLabel7.setForeground(new Color(102,102,102,102));
         this.jLabel11.setForeground(new Color(102,102,102,102));
        this.jSeparator4.setForeground(new Color(102,102,102,102));
        this.jSeparator4.setSize(55,10);
    }//GEN-LAST:event_txtPrecioFocusLost

    private void txtCantidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantidadFocusGained
        this.jLabel2.setForeground(new Color(255,255,255,255));
        this.jSeparator5.setForeground(new Color(255,255,255,255));
        this.jSeparator5.setSize(80,10);
    }//GEN-LAST:event_txtCantidadFocusGained

    private void txtCantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantidadFocusLost
       this.jLabel2.setForeground(new Color(102,102,102,102));
        this.jSeparator5.setForeground(new Color(102,102,102,102));
        this.jSeparator5.setSize(40,10);
    }//GEN-LAST:event_txtCantidadFocusLost

    private void txtPrecioAdquiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioAdquiFocusGained
       this.jLabel12.setForeground(new Color(255,255,255,255));
        this.jLabel13.setForeground(new Color(255,255,255,255));
        this.jSeparator7.setForeground(new Color(255,255,255,255));
        this.jSeparator7.setSize(110,10);
    }//GEN-LAST:event_txtPrecioAdquiFocusGained

    private void txtPrecioAdquiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioAdquiFocusLost
       this.jLabel12.setForeground(new Color(102,102,102,102));
         this.jLabel13.setForeground(new Color(102,102,102,102));
        this.jSeparator7.setForeground(new Color(102,102,102,102));
        this.jSeparator7.setSize(55,10);
    }//GEN-LAST:event_txtPrecioAdquiFocusLost

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
       this.setLocation(this.getLocation().x + evt.getX()- x , this.getLocation().y + evt.getY() - y );
    }//GEN-LAST:event_jPanel1MouseDragged

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
            java.util.logging.Logger.getLogger(AgregarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgregarProductos dialog = new AgregarProductos(new javax.swing.JDialog(), true);
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
    private javax.swing.JTable ProductosAgregados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioAdqui;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables

    public void limpiar(String lugar) {
        switch(lugar){
            case "campos":
                this.txtCantidad.setText("");
                this.txtCodigo.setText("");
                this.txtDescripcion.setText("");
                this.txtPrecio.setText("");
                this.txtProducto.setText("");
                this.txtPrecioAdqui.setText("");
                this.txtCodigo.setText(product.generateId());
                break;
            case "tabla":
                DefaultTableModel modelo=(DefaultTableModel) this.ProductosAgregados.getModel();
                int filas=this.ProductosAgregados.getRowCount();
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