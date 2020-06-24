/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author luish
 */

import Controller.Cliente;
import Controller.Login;
import Controller.Produtos;
import Controller.Pagamentos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ConnectFactory {
    
    Connection con;
    Statement stm;
    ResultSet rs;
    Boolean status;
    
    public ConnectFactory(){
        con = null;
        stm = null;
        rs = null;
        carregaDriver();
    }
    
    public Boolean carregaDriver(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/academia","root","");
            stm = con.createStatement();
            status = true;
        }
        catch (ClassNotFoundException e){
            status = false;          
        }
        catch(SQLException e){
            status = false;
        }
        return status;
    }
    public Boolean Cadastrar(String sql){
        try{
            stm.executeUpdate(sql);
            stm.close();
            con.close();
            status = true;
        }
        catch (SQLException e) {
            status = false;
        }
        return(status);
    }
    public Boolean atualizar(String sql)
    {
        Boolean status;
        try 
        {
            stm.executeUpdate(sql);
            
            status = true;
        }
        catch (SQLException e) 
        {
            status = false;
        }
        return status;
    }
    
    public Boolean excluir(String sql)
    {
        Boolean status;
        try 
        {
            stm.executeUpdate(sql);
            stm.close();
            con.close();
            status = true;
        }
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
            status = false;
        }
        return status;
    }

    Boolean Produtos(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
