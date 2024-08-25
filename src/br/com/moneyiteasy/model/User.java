package br.com.moneyiteasy.model;

import java.util.Scanner;
import java.util.UUID;

public class User {
    String id;
    String name;
    String email;
    String cpf;
    String password;

    public User() {
        this.id = UUID.randomUUID().toString();
    }

    public User(String id, String name, String email, String cpf, String password ) {
        this();
        this.name = name;
        setEmail(email);
        setCpf(cpf);
        setPassword(password);
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    // Validação de CPF com Exp Regulares; Requisitos: email@email.com
    public void setEmail(String email) {
        if (email == null || !email.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")) {
            throw new IllegalArgumentException("E-mail inválido!");
        }
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    // Validação de CPF com Exp Regulares; Requisitos: 11 dígitos.
    public void setCpf(String cpf) {
        if (cpf == null || cpf.length() != 11 || !cpf.matches("^\\d{11}$")) {
            throw new IllegalArgumentException("CPF inválido!");
        } this.cpf = cpf;
    }

    public String getPassword() {
        return password;
    }

    // Validação de Senha com Exp Regulares - Requisitos: 1 letra maiúscula, 1 caracter especial e no min 8 dígitos.
    public void setPassword(String password) {
        if (password == null || password.length() < 8 || !password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[\\W_]).{8,}")) {
            throw new IllegalArgumentException("Senha inválida!");
        } this.password = password;
    }

    public void createUser(Scanner scanner) {
        try {
            System.out.println("Nome: ");
            setName(scanner.nextLine());
            System.out.println("Email: ");
            setEmail(scanner.nextLine());
            System.out.println("CPF: ");
            setCpf(scanner.nextLine());
            System.out.println("Senha: ");
            setPassword(scanner.nextLine());
            System.out.printf("ID do usuário gerado: %s\n", id);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao cadastrar usuário: " + e.getMessage());
        }
    }

    public void displayUser() {
        System.out.println("Detalhes do Usuário: ");
        System.out.printf("Nome: %s | E-mail: %s | CPF: %s%n", name, email, cpf);
    }
}
