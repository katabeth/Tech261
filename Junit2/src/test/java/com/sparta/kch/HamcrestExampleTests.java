package com.sparta.kch;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestExampleTests {
    private Spartan kat;

    @BeforeEach
    void setUp() {
        kat = new Spartan(100, "Kat", "Java", LocalDate.of(2024,6,10));
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
            assertThat(kat.getName(), not(emptyOrNullString()));
        }

        @Test
        void checkThatNameEndsWithT() {
            assertThat(kat.getName(), endsWith("t"));
        }
    }
    @Nested
    @DisplayName("Kats Wacky Fun Times")

    class KatsWackyTests{
        @Test
        void testIDIsBetween10And10000(){
            assertThat(kat.getId(), is(greaterThan(10), lessThan(10000)));

        }
        @Test
        void testCourseIsOneOfAcceptedAnswers(){
            assertThat(kat.getCourse(), oneOf("Java", "C#", "Data", "DevOps", "Cyber-Security", "Business", "Test"));
        }

        @Test
        @DisplayName("testIsStartDateInPast")
        void testIsStartDateInPast() {
            assertThat(kat.getStartDate(), lessThan(LocalDate.now()));
        }

    }



}
