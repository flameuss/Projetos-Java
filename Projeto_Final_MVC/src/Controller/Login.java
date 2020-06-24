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
public class Login {
    private String id,password;
    
    public Login()
    {
        id = null;
        password = null;
    }

    public String getLogin() {
        return id;
    }

    public void setLogin(String login) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
}
