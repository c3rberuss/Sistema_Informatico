/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import sistema.Sistema;

/**
 *
 * @author josuee
 */
public class Usuarios {
    
    private Statement statement;
    private ResultSet result;
    
    public boolean login(String user, String pass) throws SQLException{
        
        boolean success = false;
        String sql; //= "CALL login('"+user+"', '"+pass+"');";
        sql = "SELECT COUNT(*) FROM users WHERE nick_usr='"+user+"' AND pwd_usr='"+pass+"';";
        
        setStatement(Sistema.getCon().getConexion().createStatement());
        setResult(getStatement().executeQuery(sql));
        
        getResult().first();
        success = getResult().getBoolean(1);
        
        return success;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ResultSet getResult() {
        return result;
    }

    public void setResult(ResultSet result) {
        this.result = result;
    }
    
}
