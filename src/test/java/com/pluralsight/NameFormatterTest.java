package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @org.junit.jupiter.api.Test
    void test_formatWithFirstAndLast() {
        String firstName = "Josiah";
        String lastName = "De Leon";

        String actual = NameFormatter.format(firstName, lastName);

        assertEquals("De Leon, Josiah", actual);
    }

    @org.junit.jupiter.api.Test
    void test_formatWithAllParts() {

        String expected = "De Leon, null Josiah J, I";
        String actual = NameFormatter.format(null, "Josiah", "J", "De Leon", "I");

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void test_fullNameWithPrefix() {

        String actual = NameFormatter.format("Mr. Lebron R James");
        String expected = "James, Mr. Lebron R";

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void test_fullNameWithSuffix() {

        String actual = NameFormatter.format("Lebron R James, Sr");
        String expected = "James, Lebron R, Sr";

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void test_fullNameNoPrefixOrSuffix() {

        String actual = NameFormatter.format("Lebron R James");
        String expected = "James, Lebron R";

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void test_fullNameWithNoNames() {

        String actual = NameFormatter.format("");
        String expected = "";

        assertEquals(expected, actual);
    }
}