package com.sparta.kch;

import com.sun.jdi.connect.Connector;
import org.junit.jupiter.api.*; // JUnit source code
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.time.LocalDate;
import java.util.stream.Stream;

public class SpartanTests {

    @RepeatedTest(value = 10, name = RepeatedTest.LONG_DISPLAY_NAME) // Repeats the test x times
    @DisplayName("Are tests even real?")
    void simpleTest() {
        Assertions.assertEquals(1, 1);

    }

    @Test
    @Disabled
    @DisplayName("Check name of Spartan")
    void checkName() {
        Assumptions.assumeFalse(true); //Only run test if the assumption is true
        Assertions.assertEquals(1, 1);
    }
    //BeforeAll - once before all tests
    //BeforeEach - before each test
    //AfterAll - once after all tests
    //AfterEach - after each test
    //Can generate with associated name
    private static Spartan kat;
    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        kat = new Spartan(1, "Kat", "Java", LocalDate.now());
        System.out.println(testInfo.getDisplayName());
    }
    @BeforeEach
    void setUp(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());
    }
    @AfterAll
    static void afterAll(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());
    }
    @AfterEach
    void tearDown(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());
    }

    public static Stream<String> getListOfNames(){
        return Stream.of(
                "Manish",
                "Kat"
        );
    }

    @ParameterizedTest
    @NullAndEmptySource //Does the test of Null and Empty inputs
    @MethodSource("getListOfNames")
    void checkLengthOfString(String names){
        Assertions.assertEquals(names.length(),5);
    }
}
