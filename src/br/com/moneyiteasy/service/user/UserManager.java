package br.com.moneyiteasy.service.user;

import br.com.moneyiteasy.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserManager {
    private List<User> users = new ArrayList<>();

    public void addUser(Scanner scanner) {
        System.out.println("Cadastro de Usuário.");
        User user = new User();

        try {
            String name, email, cpf, password;

            System.out.println("Nome: ");
            name = scanner.nextLine();
            System.out.println("Email: ");
            email = scanner.nextLine();
            System.out.println("CPF: ");
            cpf = scanner.nextLine();
            System.out.println("Senha: ");
            password = scanner.nextLine();

            User tempUser = new User();
            tempUser.setName(name);
            tempUser.setEmail(email);
            tempUser.setCpf(cpf);
            tempUser.setPassword(password);

            boolean exists = users.stream()
                    .anyMatch(u -> u.getEmail().equals(tempUser.getEmail()) || u.getCpf().equals(tempUser.getCpf()));

            if (!exists) {
                user = new User(null, name, email, cpf, password);
                users.add(user);
                System.out.println("Usuário cadastrado com sucesso!");
            } else {
                System.out.println("Usuário com o mesmo email ou CPF já cadastrado.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao cadastrar usuário: " + e.getMessage());
        }
    }

    public void displayUsers() {
        if (!users.isEmpty()) {
            for (User user : users) {
                user.displayUser();
            }
        } else {
            System.out.println("Nenhum usuário cadastrado!");
        }
    }
}