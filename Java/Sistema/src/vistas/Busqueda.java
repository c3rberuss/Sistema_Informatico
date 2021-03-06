/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.HeadlessException;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import servicios.Utilidades;
import servicios.Venta;
import servicios.Ventana;
import sistema.Sistema;

/**
 *
 * @author josuee
 */
public class Busqueda extends javax.swing.JDialog implements Ventana {

    private DefaultTableModel modelo;
    private Utilidades utilidades;
    private TableRowSorter trsFiltro;
    private Venta venta;
    private IngresarCantidad vCantidad;
    
    //variables para mover ventana
    int x,y;
    
    public Busqueda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.txtBusqueda.requestFocus();
        modelo = Sistema.getFactory().modelo();
        utilidades = Sistema.getFactory().herramientas();
        setVenta(Sistema.getFactory().venta());
        utilidades.mostrar(this.Resultados, getVenta().mostrarItems());
        setvCantidad(Sistema.getFactory().cantidad(null, true));
       
    }
    


    public DefaultTableModel getModelo() {
        return modelo;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public void setModelo(DefaultTableModel modelo) {
        this.modelo = modelo;
    }

    public Utilidades getUtilidades() {
        return utilidades;
    }

    public void setUtilidades(Utilidades utilidades) {
        this.utilidades = utilidades;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuFlotante = new javax.swing.JPopupMenu();
        addCartito = new javax.swing.JMenuItem();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        BtnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultados = new javax.swing.JTable();
        paramBusqueda = new javax.swing.JComboBox<>();

        addCartito.setText("Agregar al Carrito");
        addCartito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addCartitoMousePressed(evt);
            }
        });
        MenuFlotante.add(addCartito);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(3, 19, 27));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel5MouseDragged(evt);
            }
        });
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenes/buscar pequeño.png"))); // NOI18N
        jLabel1.setText("BÚSQUEDA");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 60));

        jPanel6.setBackground(new java.awt.Color(3, 19, 27));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnCancelar.setBackground(new java.awt.Color(153, 0, 0));
        BtnCancelar.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        BtnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        BtnCancelar.setText("CERRAR");
        BtnCancelar.setToolTipText("Cerrar panel de busqueda");
        BtnCancelar.setBorder(null);
        BtnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCancelar.setFocusPainted(false);
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        jPanel6.add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 50, 20));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 476, 500, 40));

        jPanel2.setBackground(new java.awt.Color(35, 48, 54));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BUSCAR");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        txtBusqueda.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtBusqueda.setForeground(new java.awt.Color(0, 0, 0));
        txtBusqueda.setToolTipText("Inserte nombre de producto o sus iniciales");
        txtBusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBusqueda.setMaximumSize(new java.awt.Dimension(2, 17));
        txtBusqueda.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        txtBusqueda.setSelectionColor(new java.awt.Color(0, 102, 102));
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyTyped(evt);
            }
        });
        jPanel2.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 360, 20));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 460, 10));

        Resultados.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Resultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PRODUCTO", "DESCRIPCION", "PRECIO", "CTD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Resultados.setComponentPopupMenu(MenuFlotante);
        Resultados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Resultados.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(Resultados);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 460, 310));

        paramBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOMBRE", "ID" }));
        jPanel2.add(paramBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 90, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 59, 500, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //Sistema.getCon().closeConexion();
    }//GEN-LAST:event_formWindowClosing

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed

   public void filtro() {
        int columnaABuscar;
        if(this.paramBusqueda.getSelectedIndex() == 0){
            columnaABuscar = 1;
            this.trsFiltro.setRowFilter(RowFilter.regexFilter(this.txtBusqueda.getText().toUpperCase(), columnaABuscar));
        }else{
            columnaABuscar = 0;
            this.trsFiltro.setRowFilter(RowFilter.regexFilter(this.txtBusqueda.getText().toUpperCase(), columnaABuscar));
        }
   }
    
    private void txtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyTyped
         txtBusqueda.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtBusqueda.getText());
                txtBusqueda.setText(cadena);
                repaint();
                filtro();
            }
        });
        this.trsFiltro = new TableRowSorter(this.Resultados.getModel());
        this.Resultados.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtBusquedaKeyTyped

    private void addCartitoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCartitoMousePressed

        int fila = this.Resultados.getSelectedRow();
        int c = 0;
        try{
            if(fila > -1){
            
                int n = this.Resultados.getSelectedRow();
                boolean agregar = true;
                
                String[] datos = new String[4];
                datos[0] = (String) this.Resultados.getValueAt(n, 0);
                datos[1] = (String) this.Resultados.getValueAt(n, 1);
                datos[2] = (String) this.Resultados.getValueAt(n, 3);
                
                getvCantidad().setVisible(true);
                
                datos[3] = String.valueOf(getvCantidad().getCantidad());
                c = Integer.valueOf(datos[3]);

                int cantidad = Integer.valueOf(datos[3]) + getVenta().buscarCantidadAgregada(datos[0]);
                
                if(getVenta().buscarCantidadAgregada(datos[0]) > 0){
                    agregar = false;
                }
                
                int max = Integer.valueOf(this.Resultados.getValueAt(n, 4).toString());
                

                if((cantidad > 0 && cantidad <= max)){
                    
                    cantidad = Integer.valueOf(datos[3]);
                    
                    if(!(datos[3].equals("null")) && (cantidad >= 1 && cantidad <= max)){

                        String[] prod = new String[3];
                        prod[0] = datos[0];
                        prod[1] = String.valueOf(max);
                        prod[2] = datos[3];
                        
                        if(agregar){
                            getVenta().arrayAdd(prod);
                            getVenta().insertarItem(datos[0], datos[1], Double.valueOf(datos[2]), 
                                    Integer.valueOf(datos[3]));
                        }else{
                             
                            cantidad = cantidad + getVenta().buscarCantidadAgregada(datos[0]);
                            getVenta().actualizarCantidadAgregada(datos[0], String.valueOf(cantidad));
                            getVenta().actualizarItem(cantidad, datos[0]); 
                        }
           
                      
                        Sistema.getMostrarMensaje().mensaje("exito", 
                            "Producto agregado al carrito exitosamente.", 
                            "Ventas");

                    }else{
                        Sistema.getMostrarMensaje().mensaje("advertencia", 
                            "Ingrese una cantidad válida.\n Entre 1 y "+max, 
                            "Ventas");
                    }
                }else{
                    if(cantidad > 0){
                        Sistema.getMostrarMensaje().mensaje("advertencia", 
                            "Productos insuficientes.", 
                            "Ventas");
                    }
                }


            }else{
               
                Sistema.getMostrarMensaje().mensaje("advertencia", 
                "Debe de Seleccionar el producto a agregar al Carrito.", 
                "Ventas");
            }
        }catch(HeadlessException | NumberFormatException e){
            System.out.println("Causa: "+e.getCause()+"\n Error: "+e.getCause());
        }

    }//GEN-LAST:event_addCartitoMousePressed

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel5MousePressed

    private void jPanel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseDragged
        this.setLocation(this.getLocation().x + evt.getX()- x , this.getLocation().y + evt.getY() - y );
    }//GEN-LAST:event_jPanel5MouseDragged

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
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            Busqueda dialog = new Busqueda(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JPopupMenu MenuFlotante;
    private javax.swing.JTable Resultados;
    private javax.swing.JMenuItem addCartito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JComboBox<String> paramBusqueda;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables

    @Override
    public void limpiar(String lugar) {
        this.txtBusqueda.setText("");
    }

    private IngresarCantidad getvCantidad() {
        return vCantidad;
    }

    private void setvCantidad(IngresarCantidad vCantidad) {
        this.vCantidad = vCantidad;
    }
}
