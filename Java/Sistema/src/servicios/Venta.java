/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sistema.Sistema;
import vistas.Carrito;

/**
 *
 * @author josuee
 */
public class Venta {
    
    private PreparedStatement statement;
    private ResultSet result;
    private DefaultTableModel modelo;
    
    public Venta(){
        setModelo(Sistema.getFactory().modelo());
    }
    
    public String obtenertotal(Connection con){
        
        String total = "000.00";
        
        try {
            setStatement(con.prepareStatement("call subtotal_carrito()"));
            setResult(getStatement().executeQuery());
            
            getResult().first();
            total = getResult().getString("total");

        } catch (SQLException ex) {
            Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        return "SUBTOTAL: $"+total;
    }
    
    public ResultSet obtenerProductos(Connection con){
        
        try {
            setStatement(con.prepareStatement("CALL carrito()"));
            setResult(getStatement().executeQuery());
        } catch (SQLException ex) {
            Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return getResult();
    }
    
     public void limpiarTabla(JTable tabla){
        setModelo((DefaultTableModel) tabla.getModel());
        int a = tabla.getRowCount()-1;
        for (int i = a; i >= 0; i--) {           
        getModelo().removeRow(getModelo().getRowCount()-1);
        } 

    }
    
    public void cargarDatos(JLabel total, JTable resultados){
        
        try {
            limpiarTabla(resultados);
            getModelo().setColumnIdentifiers(new Object[]{"ID",  "PRODUCTO", "PRECIO", "CANTIDAD"});
            setResult(obtenerProductos(Sistema.getCon().getConexion()));
            
            while(getResult().next()){
                modelo.addRow(new Object[]{getResult().getString("id"), getResult().getString("producto"), 
                    getResult().getString("precio"), getResult().getString("cantidad")});
            }
            
            resultados.setModel(modelo);
            resultados.updateUI();
            
            if(resultados.getModel().getRowCount() > 0){
                total.setText(obtenertotal(Sistema.getCon().getConexion()));
            }else{
                total.setText("SUBTOTAL: $000.00");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Carrito.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void borrarItem(JTable resultados, String id){
        
        if(resultados.getSelectedRow() > 0){
            try {
                setStatement(Sistema.getCon().getConexion().prepareStatement("CALL borrarItem(?)"));
                getStatement().setString(1, id);
                getStatement().executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public void actualizarItem(int cantidad, String id){
        try {
            setStatement(Sistema.getCon().getConexion().prepareStatement("CALL actualizarItem(?, ?)"));
            getStatement().setInt(1, cantidad);
            getStatement().setString(2, id);
            getStatement().executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet buscarItem(String id){
        try {
            setStatement(Sistema.getCon().getConexion().prepareStatement("CALL buscarItem(?)"));
            getStatement().setString(1, id);
            setResult(getStatement().executeQuery());
        } catch (SQLException ex) {
            Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return getResult();
    }
    
    public void vaciarCarrito(){
        try {
            setStatement(Sistema.getCon().getConexion().prepareStatement("CALL vaciarCarrito()"));
            setResult(getStatement().executeQuery());
        } catch (SQLException ex) {
            Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet mostrarItems(){
         try {
            if(Sistema.getCon() != null){
                setStatement(Sistema.getCon().getConexion().prepareStatement("CALL mostrarItems()"));
            setResult(getStatement().executeQuery());
            }
            
        } catch (SQLException ex) {
            
            Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return getResult();
    }
    
    public void insertarItem(String id, String producto, double precio, int cantidad){
        
        try {
            
            if(existe(id)){
                actualizarItem(cantidad, id);
            }else{
                setStatement(Sistema.getCon().getConexion().prepareStatement("CALL insertarItem(?, ?, ?, ?)"));
                getStatement().setString(1, id);
                getStatement().setString(2, producto);
                getStatement().setDouble(3, precio);
                getStatement().setInt(4, cantidad);
                getStatement().executeUpdate();
            }
    
        } catch (SQLException ex) {
            Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public boolean existe(String id){
        boolean existe = false;
        
        try {
            setStatement(Sistema.getCon().getConexion().prepareStatement("CALL existeItem(?)"));
            getStatement().setString(1, id);
            setResult(getStatement().executeQuery());
            getResult().first();
            existe = getResult().getBoolean(1);
        } catch (SQLException ex) {
            Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return existe;
    }
    

    public PreparedStatement getStatement() {
        return statement;
    }

    public void setStatement(PreparedStatement statement) {
        this.statement = statement;
    }

    public ResultSet getResult() {
        return result;
    }

    public void setResult(ResultSet result) {
        this.result = result;
    }

    public DefaultTableModel getModelo() {
        return modelo;
    }

    public void setModelo(DefaultTableModel modelo) {
        this.modelo = modelo;
    }
    
}
