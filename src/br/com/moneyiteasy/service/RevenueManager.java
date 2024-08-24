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
}
