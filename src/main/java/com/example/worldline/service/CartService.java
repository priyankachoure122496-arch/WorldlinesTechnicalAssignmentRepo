package com.example.worldline.service;

import com.example.worldline.config.CartPricingConfig;
import com.example.worldline.dto.CartRequest;
import org.springframework.stereotype.Service;

@Service
public class CartService {

 private final CartPricingConfig pricingConfig;

 public CartService(CartPricingConfig pricingConfig) {
  this.pricingConfig = pricingConfig;
 }

 public double calculate(CartRequest r) {

  double high, mid, lap;

  if ("PROFESSIONAL".equalsIgnoreCase(r.getClientType())) {

   CartPricingConfig.Professional professional =
           pricingConfig.getProfessional();

   if (r.getAnnualRevenue() > professional.getRevenueThreshold()) {
    high = professional.getAboveThreshold().getHigh();
    mid  = professional.getAboveThreshold().getMid();
    lap  = professional.getAboveThreshold().getLap();
   } else {
    high = professional.getBelowThreshold().getHigh();
    mid  = professional.getBelowThreshold().getMid();
    lap  = professional.getBelowThreshold().getLap();
   }

  } else {
   CartPricingConfig.NonProfessional nonProfessional =
           pricingConfig.getNonProfessional();

   high = nonProfessional.getHigh();
   mid  = nonProfessional.getMid();
   lap  = nonProfessional.getLap();
  }

  return r.getHighEndPhones() * high +
          r.getMidRangePhones() * mid +
          r.getLaptops() * lap;
 }
}