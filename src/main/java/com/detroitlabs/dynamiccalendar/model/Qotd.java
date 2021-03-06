package com.detroitlabs.dynamiccalendar.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Qotd {
    Quote quote;
    String qotd_date;

    @JsonProperty("qotd_date")
    public String getQotd_date() {
        return qotd_date;
    }

    @JsonProperty("qotd_date")
    public void setQotd_date(String qotd_date) {
        this.qotd_date = qotd_date;
    }

    @JsonProperty("quote")
    public Quote getQuote() {
        return quote;
    }

    @JsonProperty("quote")
    public void setQuote(Quote quote) {
        this.quote = quote;
    }

    public String dateReformat() {
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MM/dd/yyyy");
        String dateTimeString = formatter.format(today);
        return dateTimeString;
    }


//    @JsonProperty("body")
//    public String getBody() {
//        return body;
//    }
//
//    @JsonProperty("body")
//    public void setBody(String body) {
//        this.body = body;
//    }
//
//    @JsonProperty("quote")
//    public String getAuthor() {
//        return author;
//    }
//
//    @JsonProperty("quote")
//    public void setAuthor(String author) {
//        this.author = author;
//    }

//    public Quote(String body, String author) {
//        this.body = body;
//        this.author = author;
}


