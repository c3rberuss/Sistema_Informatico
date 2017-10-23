/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.awt.Frame;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import sistema.Sistema;
import servicios.*;
import vistas.*;

/**
 *
 * @author josuee
 */
public class Factory {
    
    public Factory(){
        
    }
    
    public Conexion connect(){
        return Sistema.getCon();
    }
    
    public Configuracion configuraciones(){
        return new Configuracion();
    }
    
    public Utilidades herramientas(){
        return new Utilidades();
    }
    
    public Busqueda ventanaBusqueda(java.awt.Frame parent, boolean modal){
        return new Busqueda(parent, modal);
    }
    
    public Config ventanaConfiguracion(java.awt.Frame parent, boolean modal){
        return new Config(parent, modal);
    }
    
    public Login1 ventanaLogin(java.awt.Frame parent, boolean modal){
        return new Login1();
    }
    
    public Principal ventanaPrincipal(java.awt.Frame parent, boolean modal){
        return new Principal();
    }
    
    public DefaultTableModel modelo(){
        return new DefaultTableModel();
    }
    
    public File createFile(String ruta){
        return new File(ruta);
    }
    
    public BufferedWriter bufferWriter(File archivo){
        BufferedWriter buffer = null;
        try {
            buffer =  new BufferedWriter(new FileWriter(archivo));
        } catch (IOException ex) {
            Logger.getLogger(Factory.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return buffer;
    }
    
    public Properties properties(){
        return new Properties();
    }
    
    public FileInputStream fileInputStream(String path) throws FileNotFoundException{
        return new FileInputStream(path);
    }
    
    public Reportes generateReport(){
        return new Reportes();
    }
    
    public Usuarios usuarios(){
        return new Usuarios();
    }
    
    public Conexion conexion() throws ClassNotFoundException, SQLException{
        return new Conexion();
    }
    
    public Venta venta(){
        return new Venta();
    }
    
    public DatosFactura facturacion(Frame padre, boolean modal){
        return new DatosFactura(padre, modal);
    }
    
    public ImageIcon icono(URL url){
        return new ImageIcon(url);
    }
    
    public MensajePlantilla mostrarMensaje(Frame padre, boolean modal){
        return new MensajePlantilla(padre, modal);
    }
    
    public SpinnerNumberModel modeloSpinner(){
        return new SpinnerNumberModel();
    }
    
    public ArrayList arrayList(){
        return new ArrayList<>();
    }
    
    public String[] arregloString(int elementos){
        return new String[elementos];
    }
    
}
