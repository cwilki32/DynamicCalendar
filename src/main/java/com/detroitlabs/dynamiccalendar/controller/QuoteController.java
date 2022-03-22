package com.detroitlabs.dynamiccalendar.controller;

import com.detroitlabs.dynamiccalendar.model.Quote;
import com.detroitlabs.dynamiccalendar.service.QuoteService;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuoteController {
    QuoteService quoteService = new QuoteService();


    @ResponseBody
    @RequestMapping("/")
    public String displayQuote() {
        Quote quote = quoteService.fetchQuote();
//        modelMap.put("quote", quote);
//        return "quote";
        return
                "Quote of the day:" + quote.getQotd_date() + "<br>" + quote.getAuthor() + "<br>" +
                        quote.getBody();

    }
}
