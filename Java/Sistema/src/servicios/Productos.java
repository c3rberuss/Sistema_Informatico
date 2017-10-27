/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sistema.Sistema;

/**
 *
 * @author Je_pa
 */
public class Productos {
    
    private String sql;
    private PreparedStatement statement;
    private static Configuracion conf;
    private ResultSet result;
    
    public Productos(){
        conf = Sistema.getFactory().configuraciones();
    }
    
    public String[] searchProducts(String id){
        
        String[] datos = new String[6];
        
        try {
            setSql("CALL search_product(?);");
            setStatement(Sistema.getCon().getConexion().prepareStatement(getSql()));
            getStatement().setString(1, id);            
            setResult(getStatement().executeQuery());
            
            if(getResult().first()){
                getResult().beforeFirst();
                while(getResult().next()){
                    datos[0] = getResult().getString("id");
                    datos[1] = getResult().getString("producto");
                    datos[2] = getResult().getString("descripcion");
                    datos[3] = getResult().getString("precio");
                    datos[4] = getResult().getString("stock");
                    datos[5] = getResult().getString("precio_costo");
                }
            }else{
                JOptionPane.showMessageDialog(null, "No se encontró ninguna coincidencia");
            }
            

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return datos; 
    }

    public void deleteProduct(String id){
        try {
            setSql("CALL delete_product(?);");
            setStatement(Sistema.getCon().getConexion().prepareStatement(sql));
            getStatement().setString(1, id);
            getStatement().executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public void listarProductos(JTable tabla){
        try {
            setSql("CALL mostrar_productos()");
            setStatement(Sistema.getCon().getConexion().prepareStatement(getSql()));
            setResult(getStatement().executeQuery());
            DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
            
           Object [] fila=new Object[6];
            
            while(getResult().next()){
                fila[0] = getResult().getString("id");
                fila[1] = getResult().getString("producto");
                fila[2] = getResult().getString("descripcion");
                fila[3] = getResult().getString("stock");
                fila[4] = getResult().getString("precio");
                fila[5] = getResult().getString("precio_costo");
                modelo.addRow(fila);
            }
            
            tabla.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateProducts(String[] datos){
        try {
            setSql("CALL update_product(?, ?, ?, ?, ?, ?);");
            setStatement(Sistema.getCon().getConexion().prepareStatement(sql));
            getStatement().setString(1, datos[0]);
            getStatement().setString(2, datos[1]);
            getStatement().setString(3, datos[2]);
            getStatement().setString(4, datos[3]);
            getStatement().setString(5, datos[4]);
            getStatement().setString(6, datos[5]);
            getStatement().executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public DefaultTableModel addTable(JTable tabla, String[] datos){
        
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        
        Object[] fila=new Object[6];
        
        for(int i = 0; i<6; i++){
          fila[i]=datos[i];  
        }
        
        modelo.addRow(fila);

        return modelo;
    }
    
    public String generateId(){
        return String.valueOf((java.util.UUID.randomUUID().getLeastSignificantBits()*-1)/10000).substring(0, 9);
    }
    
     public void addProduct(String[] datos){
        try {
            setSql( "CALL add_product(?, ?, ?, ?, ?, ?);");
            
            setStatement(Sistema.getCon().getConexion().prepareStatement(getSql()));
            getStatement().setString(1, datos[1]);
            getStatement().setString(2, datos[0]);
            getStatement().setString(3, datos[2]);
            getStatement().setInt(4, Integer.valueOf(datos[4]));
            getStatement().setDouble(5, Double.valueOf(datos[3]));
            getStatement().setDouble(6, Double.valueOf(datos[5]));
            getStatement().executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print("Error en addproduct");
        }
        
    }

    /**
     * @return the sql
     */
    public String getSql() {
        return sql;
    }

    /**
     * @param sql the sql to set
     */
    public void setSql(String sql) {
        this.sql = sql;
    }

    /**
     * @return the statement
     */
    public PreparedStatement getStatement() {
        return statement;
    }

    /**
     * @param statement the statement to set
     */
    public void setStatement(PreparedStatement statement) {
        this.statement = statement;
    }

    /**
     * @return the conf
     */
    public static Configuracion getConf() {
        return conf;
    }

    /**
     * @param aConf the conf to set
     */
    public static void setConf(Configuracion aConf) {
        conf = aConf;
    }

    /**
     * @return the result
     */
    public ResultSet getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(ResultSet result) {
        this.result = result;
    }
}
