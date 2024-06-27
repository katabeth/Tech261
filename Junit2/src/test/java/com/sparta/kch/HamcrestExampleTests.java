package com.sparta.kch;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestExampleTests {
    private Spartan kat;

    @BeforeEach
    void setUp() {
        kat = new Spartan(1, "Kat", "Java", LocalDate.of(2024,6,10));
    }
    @Nested
    @DisplayName("Hamcrest Spartan Tests")
    class hamcrestSpartanTests {
        @Test
        @DisplayName("checkThatSpartanIsCalledKat")
        void checkThatSpartanIsCalledKat() {
            assertThat(kat.getName(), equalTo("Kat"));  // Fluent API -- tries to make code look like actual English
        }

        @Test
        void checkThatSpartanHasFieldCalledName() {
            assertThat(kat, hasProperty("name"));
        }

        @Test
        void checkCourseAndIsJava() {
            assertThat(kat, hasProperty("course", equalTo("Java"))); //Chain matches together
        }
    }
    @Nested
    @DisplayName("Hamcrest String Methods")
    class HamcrestStringMethods{
        @Test
        void checkThatNameIsNotEmptyOrNull() {
            assertThat(kat.getName(), is(not(emptyOrNullString())));
        }

        @Test
        void checkThatNameEndsWithT() {
            assertThat(kat.getName(), endsWith("t"));
        }
    }

}
