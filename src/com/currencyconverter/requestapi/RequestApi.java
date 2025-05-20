package com.currencyconverter.requestapi;

import com.currencyconverter.menu.ChoiceEvaluation;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestApi {
private int option;
private int valui;

    public RequestApi(int option, int valui) {
        this.option = option;
        this.valui = valui;
    }

    public int getOption() {
        return option;
    }

    public int getValui() {
        return valui;
    }

    public void callApi() {

        try {
            ChoiceEvaluation choiceEvaluation = new ChoiceEvaluation();
            String url = choiceEvaluation.choiceNumber(getOption(), getValui());
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String jason = response.body();
            System.out.println("A cotação é: " + jason);
        } catch (RuntimeException e) {
            System.out.println("Aconteceu um erro: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}