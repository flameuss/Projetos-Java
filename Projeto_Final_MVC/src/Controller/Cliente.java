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

public class Cliente {
     private String nome, email, telefone, endereco,data,peso,cardiaco,altura,respiratorio,indicacao,tipoTreino,luta;
     private int id,matricula;
     
     public Cliente(){
         nome=null; 
         email=null; 
         telefone=null; 
         endereco=null;
         data=null;
         peso=null;
         cardiaco=null;
         altura=null;
         respiratorio=null;
         indicacao=null;
         tipoTreino=null;
         luta=null;
         id=0;
         matricula=0;
     }
     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getCardiaco() {
        return cardiaco;
    }

    public void setCardiaco(String cardiaco) {
        this.cardiaco = cardiaco;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getRespiratorio() {
        return respiratorio;
    }

    public void setRespiratorio(String respiratorio) {
        this.respiratorio = respiratorio;
    }

    public String getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(String indicacao) {
        this.indicacao = indicacao;
    }

    public String getTipoTreino() {
        return tipoTreino;
    }

    public void setTipoTreino(String tipoTreino) {
        this.tipoTreino = tipoTreino;
    }

    public String getLuta() {
        return luta;
    }

    public void setLuta(String luta) {
        this.luta = luta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
      public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String setMatricula() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
