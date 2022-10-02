/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matheus Salazar
 */
public class Autenticar {

    List<Usuario> list = new ArrayList<>();

    String caminho = "c:\\Users\\Matheus Salazar\\Downloads\\dados.csv";

    public List<Usuario> getUsuarios() {
        return list;
    }

    public void carregarDados() {
        try ( BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            String line = br.readLine();
            line = br.readLine();
            while (line != null) {

                String[] vect = line.split(";");
                String login = vect[0];
                String senha = vect[1];
                String perfil = vect[2];
                
                try {
                    Usuario user = new Usuario(login, senha, perfil);
                    list.add(user);
                }catch(Exception e) {
                    System.out.println(e.getMessage());
                }

                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void autenticarLogin(Usuario usuario) {
        carregarDados();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLogin().equals(usuario.getLogin()) && list.get(i).getSenha().equals(usuario.getSenha())) {
                usuario.setPerfil(list.get(i).getPerfil().trim());
                if (usuario.getPerfil() == null || usuario.getPerfil().isEmpty()) {
                    System.out.println("Usuário sem perfil !");
                } else {
                    System.out.println("Bem vindo " + usuario.getPerfil());
                }
                break;
            } else {
                if (i == list.size() - 1) {
                    System.out.println("Credenciais inválidas");
                }
            }
        }
    }
}
