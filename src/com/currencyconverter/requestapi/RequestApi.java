package com.currencyconverter.requestapi;

import com.currencyconverter.choice.ChoiceEvaluation;
import com.currencyconverter.requestapi.handlingapi.HandlingApiResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestApi {
private int option;
private double valueChoice;

    public RequestApi(int option, double valueChoice) {
        this.option = option;
        this.valueChoice = valueChoice;
    }

    public int getOption() {
        return option;
    }

    public double getValueChoice() {
        return valueChoice;
    }
    Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();
    public void callApi() {

        try {
            ChoiceEvaluation choiceEvaluation = new ChoiceEvaluation();
            String url = choiceEvaluation.choiceNumber(getOption(), getValueChoice());
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String jason = response.body();

            HandlingApiResponse handlingApiResponse = gson.fromJson(jason, HandlingApiResponse.class);
            System.out.println(handlingApiResponse);

        } catch (NumberFormatException | InterruptedException e) {
            throw new RuntimeException(e);
        } catch (RuntimeException e) {
            System.out.println("Aconteceu um erro: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}