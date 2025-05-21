package com.currencyconverter.main;

import com.currencyconverter.choice.ChoiceValue;
import com.currencyconverter.menu.Menu;
import com.currencyconverter.requestapi.RequestApi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int decision = 0;

        while (decision != 10) {

            Menu menu = new Menu();
            System.out.println(menu.showMenu());

            Scanner scanner = new Scanner(System.in);
            decision = scanner.nextInt();

            if ( decision != 10 && decision <= 9) {

                Scanner scanner1 = new Scanner(System.in);
                ChoiceValue choiceValue = new ChoiceValue();
                System.out.println(choiceValue.howMoneyRequest(decision));
                double value = scanner1.nextDouble();

                RequestApi requestApi = new RequestApi(decision, value);
                requestApi.callApi();
            } else if (decision == 10) {
                break;
            }else {
                System.out.println("Opção inválida, escolha uma das opções do menu:");
            }
            decision = 0;
        }
    }
}
