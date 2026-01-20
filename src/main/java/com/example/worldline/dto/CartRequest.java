package com.example.worldline.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;


public class CartRequest {
 public String getClientType() {
  return clientType;
 }

 public void setClientType(String clientType) {
  this.clientType = clientType;
 }

 public double getAnnualRevenue() {
  return annualRevenue;
 }

 public void setAnnualRevenue(double annualRevenue) {
  this.annualRevenue = annualRevenue;
 }

 public int getHighEndPhones() {
  return highEndPhones;
 }

 public void setHighEndPhones(int highEndPhones) {
  this.highEndPhones = highEndPhones;
 }

 public int getMidRangePhones() {
  return midRangePhones;
 }

 public void setMidRangePhones(int midRangePhones) {
  this.midRangePhones = midRangePhones;
 }

 public int getLaptops() {
  return laptops;
 }

 public void setLaptops(int laptops) {
  this.laptops = laptops;
 }

 @NotBlank
 private String clientType;

 private double annualRevenue;

 @Min(0)
 private int highEndPhones;

 @Min(0)
 private int midRangePhones;

 @Min(0)
 private int laptops;
}