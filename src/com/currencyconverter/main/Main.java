package com.currencyconverter.main;

import com.currencyconverter.menu.ChoiceEvaluation;
import com.currencyconverter.menu.Menu;
import com.currencyconverter.requestapi.RequestApi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 10;
        Menu menu = new Menu();
        while (i != 0) {
            System.out.println(menu.showMenu());

            Scanner scanner = new Scanner(System.in);
            i = scanner.nextInt();

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Qual valor você quer converter? ");
            int valui = scanner1.nextInt();

            if (i != 0) {
                RequestApi requestApi = new RequestApi(i, valui);
                requestApi.callApi();
            } else {
                break;
            }
        }
    }
}
