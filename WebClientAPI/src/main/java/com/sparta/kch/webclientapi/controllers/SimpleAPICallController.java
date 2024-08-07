package com.sparta.kch.webclientapi.controllers;

import com.sparta.kch.webclientapi.models.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/api")
public class SimpleAPICallController {

    private final WebClient webClient;

    public SimpleAPICallController(WebClient webClient) {
        this.webClient = webClient;
    }

    @GetMapping("/")
    public String welcome() {
        return webClient.get().uri("postcodes/co77ud")
                .retrieve().bodyToMono(String.class)
                .block();
    }
    @GetMapping("/again")
    public ResponseEntity<Response>welcomeAgain() {
        return ResponseEntity.ok(
                webClient.get().uri("postcodes/co77ud")
                    .retrieve()
                    .bodyToMono(Response.class)
                    .block());
    }


}
