package br.com.moneyiteasy.service;

import br.com.moneyiteasy.model.Revenue;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RevenueManager {
    List<Revenue> revenues = new ArrayList<>();

    public void addRevenue(Scanner scanner) {
        System.out.println("Digite a categoria da receita: ");
        String category = scanner.nextLine();
        System.out.println("Digite o valor da receita: ");
        double value = scanner.nextDouble();
        scanner.nextLine();

        Revenue revenue = new Revenue(category, value);
        revenues.add(revenue);
    }

    public double getTotalRevenue() {
        double total = 0;
        for (Revenue revenue : revenues) {
            total += revenue.getValue();
        }
        return total;
    }

    public void displayRevenues() {
        if (revenues.isEmpty()) {
            System.out.println("Nenhuma receita cadastrada.");
        } else {
            System.out.println("Receitas cadastradas:");
            for (Revenue revenue : revenues) {
                System.out.printf("Categoria: %s | Valor: R$ %.2f\n", revenue.getCategory(), revenue.getValue());
            }
            System.out.printf("Total de Receitas: R$ %.2f\n", getTotalRevenue());
        }
    }
}

