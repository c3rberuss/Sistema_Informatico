/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import factory.Factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josuee
 */
public class Conexion {

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriver() {
        return driver;
    }

    public Statement getS() {
        return s;
    }

    public void setS(Statement s) {
        this.s = s;
    }

    public PreparedStatement getSt() {
        return st;
    }

    public void setSt(PreparedStatement st) {
        this.st = st;
    }

    public ResultSet getResult() {
        return result;
    }

    public void setResult(ResultSet result) {
        this.result = result;
    }
    
    private Connection con = null;
    private String server="";
    private String db="";
    private String user="";
    private String pass="";
    private String url="";
    private final String driver="com.mysql.jdbc.Driver";
    private Statement s = null;
    private PreparedStatement st;
    private ResultSet result = null;
    private Factory factory;
    
    public Conexion() throws ClassNotFoundException, SQLException{
        
        factory = new Factory();
        Configuracion config = factory.configuraciones();
        this.server = config.getConfProperty("data.server");
        this.db = config.getConfProperty("data.db");
        this.user = config.getConfProperty("data.user");
        this.pass = config.getConfProperty("data.pass");
        Class.forName(driver);
        url = "jdbc:mysql://"+server+"/"+db;
    }
    
    public Connection getConexion(){
        try {
            con=DriverManager.getConnection(getUrl(), getUser(), getPass());
            System.out.println("<-------------------------------------->");
            System.out.println("Conectado a "+getServer()+"/"+getDb());
            System.out.println("<-------------------------------------->");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        
        this.setS(getConexion().createStatement());
        this.setResult(getS().executeQuery(sql));
        
        return this.getResult();
        
    }
    
     public ResultSet Search(String campos, String tabla, String condicion, String palabra) throws SQLException{
        
        String sql = "SELECT "+campos+" FROM "+tabla+" WHERE "+condicion+" LIKE '%"+palabra+"%';";
        
        this.setS(getConexion().createStatement());
        this.setResult(getS().executeQuery(sql));
        
        return this.getResult();
        
    }
    
    public void Delete(String tabla, String condicion) throws SQLException{
        
        String sql = "DELETE FROM "+tabla+" WHERE "+condicion;
        this.setSt(getConexion().prepareStatement(sql));
        this.getSt().executeUpdate();
        
    }
    
    public void Insert(String tabla, String valores) throws SQLException{
        
        String sql = "INSERT INTO "+tabla+" VALUES ("+valores+")";
        this.setSt(getConexion().prepareStatement(sql));
        this.getSt().executeUpdate();
       
    }
      
    
}
