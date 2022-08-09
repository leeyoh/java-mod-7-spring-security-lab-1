package com.example.demo.controller;

import com.example.demo.service.CoinCapService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class CoincapControllerUnitTest {
    /**
     * Test the controller to see if we are getting the correct response.
     */
    @Test
    void shouldReturnPrice(){
        CoinCapService coinCapService = Mockito.mock(CoinCapService.class);
        String bitcoinPrice = "23000.00";
        CoincapController coincapController = new CoincapController(coinCapService);
        when(coinCapService.getBitcoinPrice()).thenReturn(bitcoinPrice);
        assertEquals(bitcoinPrice,coincapController.getBitcoinPrice(),
                "Controller returns the correct value");
    }

}