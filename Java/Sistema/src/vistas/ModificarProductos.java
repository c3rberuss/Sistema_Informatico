/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;
import servicios.Productos;
import servicios.Ventana;
import sistema.Sistema;

/**
 *
 * @author edwin
 */
public class ModificarProductos extends javax.swing.JDialog implements Ventana {

    //variables para mover ventana
    int x,y;
    private Productos product;
    private String[] datos;
    public ModificarProductos(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        product = Sistema.getFactory().productos();
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtCodigo = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtPrecio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        BtnAgregarVistaPrevia = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jSeparator9 = new javax.swing.JSeparator();
        txtBuscarCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BtnCargarDatos = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPrecioAdqui = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txtProducto2 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        txtCantidad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductosAgregados = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        BtnLimpiar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BtnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
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
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/ediPequenho.png"))); // NOI18N
        jLabel1.setText("MODIFICAR PRODUCTOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 740, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 50));

        jPanel3.setBackground(new java.awt.Color(35, 48, 54));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(3, 19, 27));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MODIFICAR");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 300, 20));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("CODIGO DE PRODUCTO:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 280, 20));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("PRECIO DE PRODUCTO:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 280, 20));

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 180, 10));

        txtCodigo.setEditable(false);
        txtCodigo.setBackground(new java.awt.Color(3, 19, 27));
        txtCodigo.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setToolTipText("Codigo de producto");
        txtCodigo.setBorder(null);
        txtCodigo.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoFocusLost(evt);
            }
        });
        jPanel4.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 260, 20));

        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 55, 10));

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
        jPanel4.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 110, 20));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("DESCRIPCION DE PRODUCTO");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 280, 20));

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
        jPanel4.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 260, 20));

        jSeparator6.setForeground(new java.awt.Color(102, 102, 102));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 180, 10));

        BtnAgregarVistaPrevia.setBackground(new java.awt.Color(0, 102, 102));
        BtnAgregarVistaPrevia.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        BtnAgregarVistaPrevia.setForeground(new java.awt.Color(255, 255, 255));
        BtnAgregarVistaPrevia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/vista.png"))); // NOI18N
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
        jPanel4.add(BtnAgregarVistaPrevia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 180, 30));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 90, 10));

        txtBuscarCodigo.setBackground(new java.awt.Color(0, 0, 0));
        txtBuscarCodigo.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        txtBuscarCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscarCodigo.setToolTipText("Nombre de productor");
        txtBuscarCodigo.setBorder(null);
        txtBuscarCodigo.setCaretColor(new java.awt.Color(255, 255, 255));
        txtBuscarCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarCodigoKeyPressed(evt);
            }
        });
        jPanel5.add(txtBuscarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 90, 20));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CODIGO:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 60, 20));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("DESEA MODIFICAR:");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 280, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("INGRESE EL CODIGO DEL PRODUCTO QUE");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 20));

        BtnCargarDatos.setBackground(new java.awt.Color(0, 0, 0));
        BtnCargarDatos.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        BtnCargarDatos.setForeground(new java.awt.Color(255, 255, 255));
        BtnCargarDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/ediSuperPequenho.png"))); // NOI18N
        BtnCargarDatos.setText("CARGAR DATOS");
        BtnCargarDatos.setToolTipText("Cargar datos y modificar");
        BtnCargarDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BtnCargarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCargarDatos.setFocusPainted(false);
        BtnCargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCargarDatosActionPerformed(evt);
            }
        });
        jPanel5.add(BtnCargarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 120, 30));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 100));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("$");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 10, 20));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("PRECIO DE ADQUISICION DE PRODUCTO:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 280, 20));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("$");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 10, 20));

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
        jPanel4.add(txtPrecioAdqui, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 110, 20));

        jSeparator8.setForeground(new java.awt.Color(102, 102, 102));
        jPanel4.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 55, 10));

        jSeparator10.setForeground(new java.awt.Color(102, 102, 102));
        jPanel4.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 55, 10));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("NOMBRE DE PRODUCTO:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 280, 20));

        txtProducto2.setBackground(new java.awt.Color(3, 19, 27));
        txtProducto2.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        txtProducto2.setForeground(new java.awt.Color(255, 255, 255));
        txtProducto2.setToolTipText("Nombre de productor");
        txtProducto2.setBorder(null);
        txtProducto2.setCaretColor(new java.awt.Color(255, 255, 255));
        txtProducto2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtProducto2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProducto2FocusLost(evt);
            }
        });
        jPanel4.add(txtProducto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 260, 20));

        jSeparator7.setForeground(new java.awt.Color(102, 102, 102));
        jPanel4.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 180, 10));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("CANTIDAD EN STOCK DE ESTE  DE PRODUCTO:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 280, 20));

        jSeparator5.setForeground(new java.awt.Color(102, 102, 102));
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 40, 10));

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
        jPanel4.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 80, 20));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 470));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 10, 440));

        ProductosAgregados.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ProductosAgregados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Producto", "Descripcion", "Stock", "Precio", "Costo"
            }
        ));
        ProductosAgregados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(ProductosAgregados);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 420, 300));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/vista.png"))); // NOI18N
        jLabel3.setText("VISTA PREVIA DE LOS PRODUCTOS POR MODIFICAR:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 410, 30));

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
        jPanel3.add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 80, 30));

        BtnModificar.setBackground(new java.awt.Color(0, 102, 102));
        BtnModificar.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        BtnModificar.setForeground(new java.awt.Color(255, 255, 255));
        BtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/ediSuperPequenho.png"))); // NOI18N
        BtnModificar.setText("GUARDAR MODIFICACIONES");
        BtnModificar.setToolTipText("Agregar al inventario");
        BtnModificar.setBorder(null);
        BtnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnModificar.setEnabled(false);
        BtnModificar.setFocusPainted(false);
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        jPanel3.add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 200, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 750, 470));

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
        jPanel2.add(BtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 60, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 750, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnLimpiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarMousePressed
        limpiar("tabla");
    }//GEN-LAST:event_BtnLimpiarMousePressed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed

    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        int cols = this.ProductosAgregados.getModel().getColumnCount();
        int fils = this.ProductosAgregados.getModel().getRowCount();
        for(int i=0; i<fils; i++) {
            for(int j=0; j<cols; j++){
                this.datos[j] = this.ProductosAgregados.getModel().getValueAt(i,j).toString();
            }
            product.updateProducts(getDatos());
        }
        
        limpiar("tabla");
        Sistema.getMostrarMensaje().mensaje("exito", "Datos de productos MODIFICADOS exitosamente.\nNota: Puedes obtener un reporte actualizado de lo que haz modificado en el apartado de reportes", "MODIFACION CON EXITO");
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed

        this.dispose();
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
         x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        this.setLocation(this.getLocation().x + evt.getX()- x , this.getLocation().y + evt.getY() - y );
    }//GEN-LAST:event_jPanel1MouseDragged

    private void BtnAgregarVistaPreviaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAgregarVistaPreviaMousePressed
        String[] datos ={
            this.txtCodigo.getText(),
            this.txtProducto2.getText(),
            this.txtDescripcion.getText(),
            this.txtCantidad.getText(),
            this.txtPrecio.getText(),
            this.txtPrecioAdqui.getText()
        };
        
        if(!datos[0].isEmpty() && !datos[1].isEmpty() && !datos[2].isEmpty() && !datos[3].isEmpty()
                && !datos[4].isEmpty() && !datos[5].isEmpty()){
            this.ProductosAgregados.setModel(product.addTable(this.ProductosAgregados, datos));
            this.ProductosAgregados.repaint();
            limpiar("campos");
            this.BtnModificar.setEnabled(true);
        }else{
            Sistema.getMostrarMensaje().mensaje("error", "No se puede agregar a vista previa.\n Algunos campos estan vacios", "CAMPOS VACIOS");
        }
    }//GEN-LAST:event_BtnAgregarVistaPreviaMousePressed

    private void txtBuscarCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCodigoKeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           if(!this.txtBuscarCodigo.getText().isEmpty()){
               setDatos(product.searchProducts(this.txtBuscarCodigo.getText()));
               this.txtProducto2.setText(getDatos()[1]);
               this.txtCodigo.setText(getDatos()[0]);
               this.txtDescripcion.setText(getDatos()[2]);
               this.txtPrecio.setText(getDatos()[3]);
               this.txtCantidad.setText(getDatos()[4]);
               this.txtPrecioAdqui.setText(getDatos()[5]);
           }else{
               System.out.println("campos vacios");
           }
        }
    }//GEN-LAST:event_txtBuscarCodigoKeyPressed

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

    private void txtProducto2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProducto2FocusGained
         this.jLabel9.setForeground(new Color(255,255,255,255));
        this.jSeparator7.setForeground(new Color(255,255,255,255));
        this.jSeparator7.setSize(260,10);
    }//GEN-LAST:event_txtProducto2FocusGained

    private void txtProducto2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProducto2FocusLost
        this.jLabel9.setForeground(new Color(102,102,102,102));
        this.jSeparator7.setForeground(new Color(102,102,102,102));
        this.jSeparator7.setSize(180,10);
    }//GEN-LAST:event_txtProducto2FocusLost

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

    private void txtPrecioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioFocusGained
        this.jLabel7.setForeground(new Color(255,255,255,255));
        this.jLabel12.setForeground(new Color(255,255,255,255));
        this.jSeparator4.setForeground(new Color(255,255,255,255));
        this.jSeparator4.setSize(110,10);
    }//GEN-LAST:event_txtPrecioFocusGained

    private void txtPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioFocusLost
       this.jLabel7.setForeground(new Color(102,102,102,102));
       this.jLabel12.setForeground(new Color(102,102,102,102));
        this.jSeparator4.setForeground(new Color(102,102,102,102));
        this.jSeparator4.setSize(55,10);
    }//GEN-LAST:event_txtPrecioFocusLost

    private void BtnCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargarDatosActionPerformed
        if(!this.txtBuscarCodigo.getText().isEmpty()){
               setDatos(product.searchProducts(this.txtBuscarCodigo.getText()));
               this.txtProducto2.setText(getDatos()[1]);
               this.txtCodigo.setText(getDatos()[0]);
               this.txtDescripcion.setText(getDatos()[2]);
               this.txtPrecio.setText(getDatos()[3]);
               this.txtCantidad.setText(getDatos()[4]);
               this.txtPrecioAdqui.setText(getDatos()[5]);
           }else{
               Sistema.getMostrarMensaje().mensaje("error", "No ha agregado el CODIGO del producto para cargar los datos a MODIFICAR", "CAMPO CODIGO VACIO");
                System.out.println("campos vacios");
           }
    }//GEN-LAST:event_BtnCargarDatosActionPerformed

    private void txtPrecioAdquiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioAdquiFocusGained
        this.jLabel13.setForeground(new Color(255,255,255,255));
        this.jLabel14.setForeground(new Color(255,255,255,255));
        this.jSeparator10.setForeground(new Color(255,255,255,255));
        this.jSeparator10.setSize(110,10);
    }//GEN-LAST:event_txtPrecioAdquiFocusGained

    private void txtPrecioAdquiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioAdquiFocusLost
        this.jLabel13.setForeground(new Color(102,102,102,102));
       this.jLabel14.setForeground(new Color(102,102,102,102));
        this.jSeparator10.setForeground(new Color(102,102,102,102));
        this.jSeparator10.setSize(55,10);
    }//GEN-LAST:event_txtPrecioAdquiFocusLost

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
            java.util.logging.Logger.getLogger(ModificarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModificarProductos dialog = new ModificarProductos(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton BtnAgregarVistaPrevia;
    private javax.swing.JButton BtnCargarDatos;
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JTable ProductosAgregados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField txtBuscarCodigo;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioAdqui;
    private javax.swing.JTextField txtProducto2;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the product
     */
    public Productos getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Productos product) {
        this.product = product;
    }

    /**
     * @return the datos
     */
    public String[] getDatos() {
        return datos;
    }

    /**
     * @param datos the datos to set
     */
    public void setDatos(String[] datos) {
        this.datos = datos;
    }

    @Override
    public void limpiar(String lugar) {
        switch(lugar){
            case "campos":
                this.txtBuscarCodigo.setText("");
                this.txtProducto2.setText("");
                this.txtCodigo.setText("");
                this.txtDescripcion.setText("");
                this.txtPrecio.setText("");
                this.txtCantidad.setText("");
                this.txtPrecioAdqui.setText("");
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
}
