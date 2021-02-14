package com.khera;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MyCalculatorTest {

    @InjectMocks
    MyCalculator myCalculator;

    @Mock
    DataService mockDataService;

    @Test
    void testSumWithMockito() {
        when(mockDataService.returnIntArray()).thenReturn(new int[]{1, 2, 3});
        assertEquals(6, myCalculator.sum());
    }

    @Test
    void testSumWithMockitoOne() {
        when(mockDataService.returnIntArray()).thenReturn(new int[]{2});
        assertEquals(2, myCalculator.sum());
    }

    @Test
    void testSumWithMockitoEmpty() {
        when(mockDataService.returnIntArray()).thenReturn(new int[]{});
        assertEquals(0, myCalculator.sum());
    }

}