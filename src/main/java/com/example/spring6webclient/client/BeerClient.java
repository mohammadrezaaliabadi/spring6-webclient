package com.example.spring6webclient.client;

import com.example.spring6webclient.model.BeerDTO;
import com.fasterxml.jackson.databind.JsonNode;
import reactor.core.publisher.Flux;

import java.util.Map;

public interface BeerClient {
    Flux<String> listBeer();
    Flux<Map> listBeerMap();
    Flux<JsonNode> listBeersJsonNode();

    Flux<BeerDTO> listBeerDtos();

}
