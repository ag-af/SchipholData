package org.northcoders.dao;

import org.northcoders.Flight;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;

public class SchipholDAO {
    public static Data getFlights(String appId, String appKey){
        WebClient client = WebClient.builder()
                .baseUrl("https://api.schiphol.nl/")
                .build();
        Data result = client.get().uri("public-flights/flights").header("ResourceVersion", "v4")
                .header("app_id", appId).header("app_key", appKey)
                .retrieve().bodyToMono(Data.class).block();
        return result;
    }
}

