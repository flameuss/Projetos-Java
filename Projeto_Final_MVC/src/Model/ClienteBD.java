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
import Controller.Pagamentos;
import Controller.Cliente;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;




public class ClienteBD {

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
    
    public ClienteBD(){
        con = new ConnectFactory();
        }
public void inserirCliente(Cliente cliente) throws SQLException 
    {
        String sql = "INSERT INTO informacoespessoais VALUES ('" + cliente.getNome() + "','" + cliente.getData() + "','" + cliente.getEmail() + "','" + cliente.getTelefone() + "','" + cliente.getEndereco() + "','" + cliente.getPeso() + "','"+ cliente.getAltura()+ "','"+ cliente.getCardiaco()+"','"+ cliente.getRespiratorio()+"','"+ cliente.getTipoTreino() +"','"+ cliente.getLuta()+"',0,0);";
        if(con.stm.executeUpdate(sql)!=0){
            JOptionPane.showMessageDialog(null,"Cadastro realizado","Sucesso",JOptionPane.INFORMATION_MESSAGE);
            
        }
        else{
             JOptionPane.showMessageDialog(null,"Erro no cadastro!!!","Erro",JOptionPane.ERROR_MESSAGE);
        }
               
    } 

    public void atualizarCliente(Cliente cliente) throws SQLException 
    {
        String sql = "UPDATE informacoespessoais SET nome = '" + cliente.getNome() + "' , Data = '" + cliente.getData() + "', Email = '" + cliente.getEmail() + "', Telefone = '" + cliente.getTelefone() + "', Endereço = '" + cliente.getEndereco() + "', Peso = '" + cliente.getPeso() + "', Altura = '" + cliente.getAltura() + "', Cardiaco = '" + cliente.getCardiaco() + "', Respiratorio = '" + cliente.getRespiratorio() + "', Treino = '" + cliente.getTipoTreino() + "', Luta = '" + cliente.getLuta() + "' WHERE  Matricula = "+cliente.getMatricula()+" ;";
        if(con.stm.executeUpdate(sql) != 0 ){
            JOptionPane.showMessageDialog(null,"Editado com sucesso","Sucesso",JOptionPane.INFORMATION_MESSAGE);
            
        }
        else{
            JOptionPane.showMessageDialog(null,"Erro !!!","Erro",JOptionPane.ERROR_MESSAGE);
        }
        //return getStatus();     
    } 

   

    public boolean excluirCliente(Cliente cliente) 
    {
        String sql = "DELETE FROM informacoespessoais WHERE Matricula = " + cliente.setMatricula()+ ";";
        setStatus(con.excluir(sql));
        return getStatus();         
    }
    
    public void consultarClientes(){
        
    }
}
    

