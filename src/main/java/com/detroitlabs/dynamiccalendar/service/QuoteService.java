package com.detroitlabs.dynamiccalendar.service;

import com.detroitlabs.dynamiccalendar.model.qotd;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class QuoteService {

    public qotd fetchQuote() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(
                "https://favqs.com/api/qotd?App %232825=	5f2bb8d743613775b4cb8987e9961b2a", qotd.class);

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

