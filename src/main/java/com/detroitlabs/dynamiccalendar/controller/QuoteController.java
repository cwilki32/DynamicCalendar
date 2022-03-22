package com.detroitlabs.dynamiccalendar.controller;

import com.detroitlabs.dynamiccalendar.model.Quote;
import com.detroitlabs.dynamiccalendar.model.qotd;
import com.detroitlabs.dynamiccalendar.service.QuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuoteController {
    QuoteService quoteService = new QuoteService();


    @ResponseBody
    @RequestMapping("/")
    public String displayQuote() {
        qotd quote = quoteService.fetchQuote();
        Quote body = quote.getQuote();

//        modelMap.put("quote", quote);
//        return "quote";
        return
                "Quote of the day:" + quote.getQotd_date() + "<br>"+ body.getBody() +"<br>"+ body.getAuthor();

    }
}
