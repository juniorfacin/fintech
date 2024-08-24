package br.com.moneyiteasy;

import br.com.moneyiteasy.model.User;
import br.com.moneyiteasy.service.RevenueManager;

import java.util.Scanner;

public class FintechApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User usuario = null;
        RevenueManager revenueManager = null;
        int op;

        do {
            System.out.println("Sejam bem-vindo(a) ao Money It Easy! Escolha uma opção: ");
            System.out.println("1-Cadastrar Usuário: ");
            System.out.println("2-Cadastrar Receita: ");
            System.out.println("0-Sair");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Cadastro de Usuário.");
                    usuario = new User();
                    usuario.createUser(scanner);
                    break;
                case 2:
                    revenueManager = new RevenueManager();
                    revenueManager.addRevenue(scanner);
                break;
                case 0:
                    System.out.println("Finalizando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (op != 0);

        scanner.close();
    }
}
