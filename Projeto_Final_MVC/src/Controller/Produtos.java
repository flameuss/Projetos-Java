/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*importando pacote Controller*/
package Controller;

/**
 *
 * @author luish
 */
public class Produtos {
    
    private String nome, tipo;
    private int qnts;
    private double valor;

    public Produtos(){
        nome = null;
        tipo = null;
        qnts = 0;
        valor = 0;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQnts() {
        return qnts;
    }

    public void setQnts(int qnts) {
        this.qnts = qnts;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String setQnts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
