package com.detroitlabs.dynamiccalendar.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class qotdTest {

    @Test
    void dateReformat() {

        Qotd testQotd = new Qotd();

        String result = testQotd.dateReformat();

        assertEquals(result, "Tue, 03/22/2022");
    }
}