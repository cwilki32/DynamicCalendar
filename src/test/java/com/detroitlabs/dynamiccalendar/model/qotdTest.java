package com.detroitlabs.dynamiccalendar.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class qotdTest {

    @Test
    void dateReformat() {

        qotd testQotd = new qotd();

        String result = testQotd.dateReformat();

        assertEquals(result, "Tue, 03/22/2022");
    }
}