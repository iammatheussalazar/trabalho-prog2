/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog2;

/**
 *
 * @author Matheus Salazar
 */
public class Usuario {
    
    private String login;
    private String senha;
    private String perfil;

    public Usuario(){
        
    }
    
    public Usuario(String login, String senha, String perfil) throws Exception {
        setLogin(login);
        setSenha(senha);
        setPerfil(perfil);
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) throws Exception {
        if(login.length() <= 0 || login.length() > 10) {
            throw new Exception("Login inválido");
        } else {
            this.login = login;
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) throws Exception {
        if(senha.length() <= 0 || senha.length() > 20) {
            throw new Exception("Senha inválida");
        }
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}
