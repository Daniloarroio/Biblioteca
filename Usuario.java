/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author alunocmc
 */
public class Usuario {
     private String nome;
     private String cpf;
     
     public Usuario(String nome, String cpf){
         this.cpf = cpf;
         this.nome = nome; 
 }   
     public String getNome(){
         return nome;
     }
     
     public String getcpf(){
         return cpf;
     }
}
