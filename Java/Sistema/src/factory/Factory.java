/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public Inventario_Menu mainInv(java.awt.Frame parent, boolean modal){
    return new Inventario_Menu(parent,modal);
    }
    
    public Inventario_ingresar inv_ingr(java.awt.Frame parent, boolean modal){
    return new Inventario_ingresar(parent,modal);
    }
    
    public Inventario_listar inv_list(java.awt.Frame parent, boolean modal){
    return new Inventario_listar(parent,modal);
    }
    
    public Inventario_modificar inv_edit(java.awt.Frame parent, boolean modal){
    return new Inventario_modificar(parent,modal);
    }
    
    public Busqueda ventanaBusqueda(java.awt.Frame parent, boolean modal){
        return new Busqueda(parent, modal);
    }
    
    public Config ventanaConfiguracion(java.awt.Frame parent, boolean modal){
        return new Config(parent, modal);
    }
    
    public Login ventanaLogin(java.awt.Frame parent, boolean modal){
        return new Login(parent, modal);
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
    
}
