package com.detroitlabs.dynamiccalendar.service;

import com.detroitlabs.dynamiccalendar.model.Quote;
import org.springframework.http.*;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Component
public class KanyeService {

    public Quote fetchQuote() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(
                "https://api.kanye.rest", Quote.class);

    }

//    public ResponseEntity<Quote> fetchQuote() {
//        RestTemplate restTemplate = new RestTemplate();
//        HttpHeaders headers = new HttpHeaders();
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
//        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
//
//        return restTemplate.exchange("https://api.kanye.rest", HttpMethod.GET, entity, Quote.class);
//    }
}

