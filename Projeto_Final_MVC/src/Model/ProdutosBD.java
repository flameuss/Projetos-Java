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
import Controller.Produtos;
import java.sql.*;
import java.util.ArrayList;
public class ProdutosBD {
    private ConnectFactory con;
    public Boolean status;
    
    public ProdutosBD(){
    con = new ConnectFactory();
    }
     public boolean inserirProduto(Produtos produto) 
    {
        String sql = "INSERT INTO produtos VALUES (" + produto.getNome() + "," + produto.getTipo() + ","+ produto.getValor() +","+ produto.setQnts() +");";
        status = con.Cadastrar(sql);
        return status;        
    } 

    public boolean atualizarProduto(Produtos produto) 
    {
        String sql = "UPDATE produtos SET Nome = '" + produto.getNome() + "' WHERE Tipo = '" + produto.getTipo() + "'WHERE Valor = '" + produto.getValor() + "'WHERE Quantidade = '" + produto.getQnts() + "';";
        status = con.atualizar(sql);
        return status;     
    } 
      public boolean excluirProduto(Produtos produto) 
    {
        String sql = "DELETE FROM produtos WHERE Nome = " + produto.getNome() + ";";
        status = con.excluir(sql);
        return status;         
    }
}
