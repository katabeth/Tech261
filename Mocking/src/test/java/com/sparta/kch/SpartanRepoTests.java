package com.sparta.kch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import java.time.LocalDate;

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
    @Test
    @DisplayName("Find Spartan")
    public void testFindSpartan() {
        Mockito.when(mock2.getId())
                .thenReturn(592);
        Assertions.assertEquals(mock2, sut.findSpartan(592));
    }
    @Test
    @DisplayName("Spartans Created in the Last 24 Hours")
    public void testSpartansFromLast24Hours() {
        Mockito.when(mock1.getStartDate())
                .thenReturn(LocalDate.now());
        Mockito.when(mock2.getStartDate())
                .thenReturn(LocalDate.now().minusDays(2));
        assert(sut.getSpartansCreatedLast24Hours().size() ==1);
    }
    @Test
    @DisplayName("Testing multiple calls of a method")
    public void testMultipleCallsOfAMethod() {
        Mockito.when(mock1.getStartDate())
                .thenReturn(LocalDate.now());
        Mockito.when(mock2.getStartDate())
                .thenReturn(LocalDate.now().minusDays(2))
                .thenReturn(LocalDate.now());
        Assertions.assertEquals(1, sut.getSpartansCreatedLast24Hours().size());
        Assertions.assertEquals(2, sut.getSpartansCreatedLast24Hours().size());
    }
    @Test
    @DisplayName("Testing changeName where name is null")
    public void testChangeNameWhereNameIsNull() {
        Mockito.when(mock1.getName())
                .thenReturn(3);
        Mockito.doThrow(IllegalArgumentException.class)
                .when(mock1)
                .setName(null);
        assert(!sut.changeName(3,null));
    }
    @Test
    @DisplayName("Check getID is called once per Spartan")
    public void testGetIDCalledOnce() {
        sut.findSpartan(20);
        Mockito.verify(mock1, Mockito.times(1)).getId();
        Mockito.verify(mock2, Mockito.times(1)).getId();
    }
    @Test
    @DisplayName("Testing getAllSpartans calls getID and getName")
    public void testGetAllSpartansCallsGetIDAndGetName() {
        sut.getAllSpartans();
        InOrder inOrder = Mockito.inOrder(mock1);
        inOrder.verify(mock1).getId();
        inOrder.verify(mock1).getName();
        inOrder.verifyNoMoreInteractions();
    }
    @Test
    @DisplayName("Test correct parameter")
    public void testCorrectParameter() {
        Mockito.when(mock1.getId())
                .thenReturn(3);
        sut.changeName(3, "Kat");
        Mockito.verify(mock1).setName("Kat");
    }
}
