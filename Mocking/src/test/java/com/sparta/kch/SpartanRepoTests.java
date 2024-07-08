package com.sparta.kch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class SpartanRepoTests {
    SpartanRepo sut = new SpartanRepo();
    Spartan mock1 = Mockito.mock(Spartan.class);
    Spartan mock2 = Mockito.mock(Spartan.class);

    @BeforeEach
    public void setUp() {
        sut.addSpartan(mock1);
        sut.addSpartan(mock2);
    }
    @Test
    @DisplayName("Add Spartans")
    public void testAddSpartan() {
        assert(sut.getNumSpartans() == 2);
    }
}
