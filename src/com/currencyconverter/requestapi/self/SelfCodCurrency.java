package com.currencyconverter.requestapi.self;

import com.currencyconverter.choice.ChoiceEvaluation;
import com.currencyconverter.requestapi.RequestApi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SelfCodCurrency {

    public String makingCodAndAmountAndCallApi() {
        String currency1 = "";
        String currency2 = "";
        double amount = 0;
        boolean inputValid = false;

        while (!inputValid) {
            try {
                Scanner scanner = new Scanner(System.in);

                String option1 = """
                        
                        Digite o código de três letras da moeda que você quer converter.
                        Exemplo: USD, EUR, BRL...
                        
                        """;
                System.out.println(option1);
                currency1 = scanner.nextLine().trim();

                String option2 = """
                        
                        Agora digite o código de três letras da moeda para a qual você quer que seja convertida,
                        seguindo o mesmo padrão.
                        
                        """;
                System.out.println(option2);
                currency2 = scanner.nextLine().trim();

                String option3 = """
                        
                        Qual o valor você quer converter?
                        
                        """;
                System.out.println(option3);
                amount = scanner.nextDouble();

                if (currency1.isEmpty() && currency2.isEmpty() && amount <= 0) {
                    throw new IllegalArgumentException("Códigos de moeda não podem ser vazios e o valor deve ser maior que zero.");
                }

                inputValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro! Valor inválido. Use números para o valor e vírgula para decimais.");

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        String customUrlPart = SelfUrl.getPairUrlPart(currency1, currency2);

        String baseUrl = "https://v6.exchangerate-api.com/v6/537af6ee7f0d0cc83a1b6c87/pair/";

        String finalUrl = new ChoiceEvaluation().choiceNumberForCustom(currency1, currency2, amount);

        RequestApi requestApi = new RequestApi(finalUrl, amount);
        return requestApi.callApi();
    }
}
