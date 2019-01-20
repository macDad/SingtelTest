package com.mad.singtel;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;


class SolutionTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(SolutionTest.class);

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeAll
    public static void setUp() {
        System.out.println("@BeforAll - Executes");
    }

    @BeforeEach
    public void init() {
        System.out.println("@BeforeEach - Executes");
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void walk() {
        new Animal().walk();
        assertThat(outContent.toString(), containsString("I am walking"));

        new Bird().walk();
        assertThat(outContent.toString(), containsString("I am walking"));
    }

    @Test
    void fly() {
        new Bird().fly();
        assertThat(outContent.toString(), containsString("I am singing"));
    }

    @Test
    void sing() {
        new Bird().sing();
        assertThat(outContent.toString(), containsString("I am singing"));
    }

}