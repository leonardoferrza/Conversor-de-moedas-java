package com.example.conversordemoedas;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiConnector {

    public String fetchExchangeRates(String baseCurrency) {
        // CONFIRA SE SUA CHAVE DE API ESTÁ CORRETA AQUI
        String apiKey = "c320b9c79b87cefd3b48d658";

        URI uri = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + baseCurrency);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() != 200) {
                throw new RuntimeException("Falha na requisição: Código " + response.statusCode());
            }
            return response.body();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Não foi possível conectar à API. Verifique sua conexão ou a chave da API.", e);
        }
    }
}