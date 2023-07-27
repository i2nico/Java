package com.qa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account act;

    @BeforeEach
    void setUp() {
        act = new Account(new String[]{"Link","Visa"},"10-10-22","11223344","1234");
    }

    @Test
    @DisplayName("Match Accounts")
    void testCompareToAccounts() {
        Account inputObject = new Account(new String[]{"Link"}, "10-10-22","11223344","1234");
        assertEquals(0, act.compareTo(inputObject), "Login Failed");
    }

    @Test
    @DisplayName("Get sortCode")
    void testSortCode() {
        assertEquals("10-10-22", act.getSortCode(), "Login Failed");
    }
}