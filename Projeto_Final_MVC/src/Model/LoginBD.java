/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.*;
import javax.swing.JOptionPane;
import Controller.Login;

/**
 *
 * @author luish
 */
import Controller.Login;
public class LoginBD {

    /**
     * @return the status
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
    private ConnectFactory con;
    private Boolean status;
    
    public LoginBD () {
         con = new ConnectFactory();
         status =  false;
    
}
   
 public void verificarUsuario (String id, String password) throws SQLException{
     int encontrou = 0;
     String n, s;
     String sql = "SELECT * FROM logar ";
     con.rs = con.stm.executeQuery(sql);
     
     while(con.rs.next())
            {
                n = con.rs.getString("nome");
                s = con.rs.getString("senha");
                
                if(id.equals(n) && password.equals(s))
                {
                    encontrou = 1;
                }
                else
                {
                    encontrou = 0;
                }
            }
            if(encontrou == 1)
            {
                
              setStatus((Boolean) true);
            }
            else
            {
                status =  false;
            }
     
     
 }
    
    
}
