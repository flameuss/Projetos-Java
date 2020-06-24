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
public class ClienteBD {
    private ConnectFactory con;
    private Boolean status;
    
    public ClienteBD(){
        con = new ConnectFactory();
        }
public boolean inserirCliente(Cliente cliente) 
    {
        String sql = "INSERT INTO informacoespessoais VALUES (" + cliente.getNome() + "," + cliente.getData() + "," + cliente.getEmail() + "," + cliente.getTelefone() + "," + cliente.getEndereco() + "," + cliente.getPeso() + ","+ cliente.getAltura()+ ","+ cliente.getCardiaco()+","+ cliente.getRespiratorio()+","+ cliente.getTipoTreino() +","+ cliente.getLuta()+");";
        status = con.Cadastrar(sql);
        return status;        
    } 

    public boolean atualizarCliente(Cliente cliente) 
    {
        String sql = "UPDATE informacoespessoais SET nome = '" + cliente.getNome() + "' WHERE Data = '" + cliente.getData() + "'WHERE Email = '" + cliente.getEmail() + "'WHERE Telefone = '" + cliente.getTelefone() + "'WHERE Endereço = '" + cliente.getEndereco() + "'WHERE Peso = '" + cliente.getPeso() + "'WHERE Altura = '" + cliente.getAltura() + "'WHERE Cardiaco = '" + cliente.getCardiaco() + "'WHERE Respiratorio = '" + cliente.getRespiratorio() + "'WHERE Treino = '" + cliente.getTipoTreino() + "'WHERE Luta = '" + cliente.getLuta() + "';";
        status = con.atualizar(sql);
        return status;     
    } 

    /*public ArrayList<Aluno> getListaCliente() 
    {
        ArrayList<Aluno> listaAlunos = null;      
        String sql = "SELECT * FROM aluno ORDER BY codaluno";
        
        listaAlunos = con.consultaAluno(sql);
        
        return listaAlunos;
    }*/ 

    public boolean excluirCliente(Cliente cliente) 
    {
        String sql = "DELETE FROM informacoespessoais WHERE Matricula = " + cliente.setMatricula()+ ";";
        status = con.excluir(sql);
        return status;         
    }
}
    

