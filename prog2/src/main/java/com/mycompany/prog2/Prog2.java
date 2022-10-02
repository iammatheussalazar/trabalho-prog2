/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.prog2;

import java.util.Scanner;

/**
 *
 * @author Matheus Salazar
 */
public class Prog2 {

    public static void main(String[] args) {

        Autenticar autenticar = new Autenticar();
        Scanner entrada = new Scanner(System.in);
        Usuario usuario = new Usuario();

        try {
            System.out.println("Login: ");
            usuario.setLogin(entrada.nextLine());

            System.out.println("Senha: ");
            usuario.setSenha(entrada.nextLine());
            autenticar.autenticarLogin(usuario);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
