/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author josuee
 */
public class Conexion {
    
    private Connection con = null;
    private String server="";
    private String db="";
    private String user="";
    private String pass="";
    private String url="";
    private String driver="com.mysql.jdbc.Driver";
    private Statement s = null;
    private PreparedStatement st;
    private ResultSet result = null;
    
    public Conexion(String server, String db, String user, String pass) throws ClassNotFoundException, SQLException{
       try{
            this.server = server;
            this.db = db;
            this.user = user;
            this.pass = pass;
            Class.forName(driver);
            url = "jdbc:mysql://"+server+"/"+db;
            con=DriverManager.getConnection(url, user, pass);
            System.out.println("<-------------------------------------->");
            System.out.println("Conectado a "+server+"/"+db);
            System.out.println("<-------------------------------------->");
       }catch(SQLException ex){
           System.out.println("Error al conectar\n"+ex.getMessage());
       }
    }
    
    public Connection getConexion(){
        return con;
    }
    
    public Connection closeConexion(){
        try{
            con.close();
            System.out.println("<-------------------------------------->");
            System.out.println("Conexion Cerrada Exitosamente");
            System.out.println("<-------------------------------------->");
        }catch(SQLException ex){
             System.out.println("<-------------------------------------->");
             System.out.println("Error al Cerrar la Conexion");
             System.out.println("<-------------------------------------->");
        }
        
        con = null;
        return con;
    }
    
    public ResultSet Select(String campos, String tabla, String condicion) throws SQLException{
        
        String sql = "SELECT "+campos+" FROM "+tabla+" WHERE "+condicion;
        
        this.s = getConexion().createStatement();
        this.result = s.executeQuery(sql);
        
        return this.result;
        
    }
    
    public void Delete(String tabla, String condicion) throws SQLException{
        
        String sql = "DELETE FROM "+tabla+" WHERE "+condicion;
        this.st = getConexion().prepareStatement(sql);
        this.st.executeUpdate();
        
    }
    
    public void Insert(String tabla, String valores) throws SQLException{
        
        String sql = "INSERT INTO "+tabla+" VALUES ("+valores+")";
        this.st = getConexion().prepareStatement(sql);
        this.st.executeUpdate();
        
    }
    
    
    
}
