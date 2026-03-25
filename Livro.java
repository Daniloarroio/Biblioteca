/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;
 
public class Livro {
 
    private String nomeLivro;
    private String categoria;
 
    public Livro(String nomeLivro, String categoria) {
        this.nomeLivro = nomeLivro;
        this.categoria = categoria;
    }
 
    public String getNomeLivro() {
        return nomeLivro;
    }
 
    public String getCategoria() {
        return categoria;
    }
}

