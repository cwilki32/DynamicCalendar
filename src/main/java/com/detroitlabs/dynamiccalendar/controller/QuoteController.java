package com.detroitlabs.dynamiccalendar.controller;

import com.detroitlabs.dynamiccalendar.model.Quote;
import com.detroitlabs.dynamiccalendar.model.qotd;
import com.detroitlabs.dynamiccalendar.service.QuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuoteController {
    QuoteService quoteService = new QuoteService();


//        @ResponseBody
    @RequestMapping("/")
    public String displayQuote(ModelMap modelMap) {
        qotd qotd = quoteService.fetchQuote();
        Quote quote = qotd.getQuote();
        String quoteBody = quote.getBody();
        modelMap.put("quoteBody", quoteBody);
        String date = qotd.dateReformat();
        modelMap.put("date", date);
        String author = quote.getAuthor();
        modelMap.put("author", author);
        return "quote";
//        return
//                "<h1 style=color:MediumSeaGreen>Quote Output</h1>" +
//
//                "Quote of the day:" + qotd.dateReformat() + "<br>"+ quote.getBody() +"<br>"+ quote.getAuthor();

    }
}
