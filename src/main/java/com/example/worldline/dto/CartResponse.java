package com.example.worldline.dto;

import lombok.Getter;

@Getter
public class CartResponse {
 private final double total;
 public CartResponse(double total) { this.total = total; }
}