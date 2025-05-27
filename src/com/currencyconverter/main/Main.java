package com.currencyconverter.main;

import com.currencyconverter.choice.ChoiceValue;
import com.currencyconverter.exchange.MoneyExchange;
import com.currencyconverter.menu.Menu;
import com.currencyconverter.requestapi.RequestApi;
import com.currencyconverter.requestapi.history.Historical;
import com.currencyconverter.requestapi.self.SelfCodCurrency;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MoneyExchange moneyExchange = new MoneyExchange();
        moneyExchange.setDecision(1);

        Historical langList = new Historical();

        while (moneyExchange.condition(moneyExchange.getDecision())) {

            try {
                Menu menu = new Menu();
                System.out.println(menu.showMenu());

                Scanner scanner = new Scanner(System.in);
                moneyExchange.setDecision(scanner.nextInt());

                if (moneyExchange.condition(moneyExchange.getDecision()) && moneyExchange.getDecision() != 0) {
                    if (moneyExchange.getDecision() == 18) {
                        if (!langList.historicalExchange.isEmpty()) {
                            langList.showRecord();
                        } else {
                            System.out.println("Você ainda não fez nenhuma converção");
                        }
                    } else if (moneyExchange.getDecision() == 17) {
                        SelfCodCurrency selfCodCurrency = new SelfCodCurrency();

                        String respSelf = selfCodCurrency.makingCodAndAmountAndCallApi();
                        langList.addRecord(respSelf);
                        System.out.println(respSelf);
                    } else {

                        Scanner scanner1 = new Scanner(System.in);
                        ChoiceValue choiceValue = new ChoiceValue();

                        System.out.println(choiceValue.howMoneyRequest(moneyExchange.getDecision()));
                        moneyExchange.setValue(scanner1.nextDouble());

                        RequestApi requestApi = new RequestApi(moneyExchange.getDecision(), moneyExchange.getValue());
                        String resp = requestApi.callApi();

                        langList.addRecord(resp);
                        System.out.println(resp);
                    }
                } else if (moneyExchange.getDecision() == 0) {
                    System.out.println("Saindo...");
                    break;
                } else {
                    System.out.println("Opção inválida, escolha uma das opções do menu:");
                    moneyExchange.setDecision(1);
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro! Caractere não permitido. Digite uma das opções do menu e use vírgula para números decimais.");

                Scanner scanner = new Scanner(System.in);
                scanner.nextLine();
            }
        }
    }
}

