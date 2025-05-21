package com.currencyconverter.menu;

public class Menu {
    String menu = """
                
                $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
                $        BEM-VINDO(A) AO CONVERSOR DE MOEDAS!       $
                $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
                $                                                   $
                $ Digite [1] para converter REAL/BRL para DÓLAR/USD $
                $ Digite [2] para converter DÓLAR/USD para REAL/BRL $
                $ Digite [3] para converter REAL/BRL para EURO/EUR  $
                $ Digite [4] para converter EURO/EUR para REAL/BRL  $
                $ Digite [5] para converter LIBRA/GBP para REAL/BRL $
                $ Digite [6] para converter REAL/BRL para LIBRA/GBP $
                $ Digite [7] para converter YEN/JPY para DOLAR/USD  $
                $ Digite [8] para converter YEN/JPY para EURO/EUR   $
                $ Digite [9] para converter YEN/JPY para LIBRA/GBP  $
                $ Digite [10] para SAIR                             $
                $                                                   $
                $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
                """;
    public String showMenu() {
        return menu;
    }
}
