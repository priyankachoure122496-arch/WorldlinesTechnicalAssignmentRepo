package com.example.worldline.controller;

import com.example.worldline.dto.*;
import com.example.worldline.service.CartService;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/cart")
public class CartController {

 private final CartService service;

 public CartController(CartService service) {
  this.service = service;
 }

 @PostMapping("/calculate")
 public CartResponse calculate(@Valid @RequestBody CartRequest r) {
  return new CartResponse(service.calculate(r));
 }
}