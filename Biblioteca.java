package com.mycompany.biblioteca;
 
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Biblioteca {
 
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Nome do cliente:");
        String nome = scanner.nextLine();
 
        System.out.println("CPF do cliente:");
        String cpf = scanner.nextLine();
 
        Usuario usuario = new Usuario(nome, cpf);
 
        System.out.println("Nome do livro:");
        String nomeLivro = scanner.nextLine();
 
        System.out.println("Categoria do livro:");
        String categoria = scanner.nextLine();
 
        Livro livro = new Livro(nomeLivro, categoria);
 
        System.out.println("Data retirada (AAAA-MM-DD):");
        LocalDate retirada = LocalDate.parse(scanner.nextLine());
 
        System.out.println("Data entrega (AAAA-MM-DD):");
        LocalDate entrega = LocalDate.parse(scanner.nextLine());
 
        long dias = ChronoUnit.DAYS.between(retirada, entrega);
        
        double ValorPorDia = 5.0;
        double ValorTotal = dias * ValorPorDia;
 
        ValorTotal = dias * ValorPorDia;
 
            Connection conn = Conexao.conectar();
 
            String sqlUsuario = "INSERT INTO usuario (nome, cpf) VALUES (?, ?)";
            PreparedStatement stmtUsuario = conn.prepareStatement(sqlUsuario);
            stmtUsuario.setString(1, usuario.getNome());
            stmtUsuario.setString(2, usuario.getcpf());
            stmtUsuario.executeUpdate();
        
        System.out.println("\n===== DADOS DO EMPRÉSTIMO =====");
 
        System.out.println("Cliente: " + usuario.getNome());
        System.out.println("CPF: " + usuario.getcpf());
        System.out.println("Livro: " + livro.getNomeLivro());
        System.out.println("Categoria: " + livro.getCategoria());
        System.out.println("Data retirada: " + retirada);
        System.out.println("Data entrega: " + entrega);
        System.out.println("Dias com o livro: " + dias);
        System.out.println("Valor total a pagar: R$ " + ValorTotal );
    }
}
