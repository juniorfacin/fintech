package br.com.moneyiteasy.service;

import br.com.moneyiteasy.model.DataHorario;
import br.com.moneyiteasy.model.Revenue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RevenueManager {
    List<Revenue> revenues = new ArrayList<>();
    DataHorario dataHorario = new DataHorario();

    public void addRevenue(Scanner scanner) {
        System.out.println("Digite a categoria da receita: ");
        String category = scanner.nextLine();
        System.out.println("Digite o valor da receita: ");
        double value = scanner.nextDouble();
        scanner.nextLine();

        String timestamp = dataHorario.getDateTime();
        Revenue revenue = new Revenue(category, value, timestamp);
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
                System.out.printf("Categoria: %s | Valor: R$ %.2f | Data e Hora: %s\n", revenue.getCategory(), revenue.getValue(), revenue.getTimestamp());
            }
            System.out.printf("Total de Receitas: R$ %.2f\n", getTotalRevenue());
        }
    }
}