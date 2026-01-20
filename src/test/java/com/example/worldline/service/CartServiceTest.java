package com.example.worldline.service;

import com.example.worldline.config.CartPricingConfig;
import com.example.worldline.dto.CartRequest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CartServiceTest {

 @Test
 void testIndividualPricing() {

  CartPricingConfig pricingConfig = mock(CartPricingConfig.class);
  CartPricingConfig.NonProfessional nonProfessional =
          new CartPricingConfig.NonProfessional();

  nonProfessional.setHigh(1500);
  nonProfessional.setMid(800);
  nonProfessional.setLap(1200);

  when(pricingConfig.getNonProfessional()).thenReturn(nonProfessional);

  CartService service = new CartService(pricingConfig);

  CartRequest r = new CartRequest();
  r.setClientType("INDIVIDUAL");
  r.setHighEndPhones(1);
  r.setMidRangePhones(1);
  r.setLaptops(1);

  double result = service.calculate(r);

  assertEquals(3500, result);
 }
}