package com.detroitlabs.dynamiccalendar.service;

import com.detroitlabs.dynamiccalendar.model.Qotd;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class QuoteService {

    public Qotd fetchQuote() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(
                "https://favqs.com/api/qotd?App %232825=	5f2bb8d743613775b4cb8987e9961b2a", Qotd.class);

    }

}

