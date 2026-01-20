package com.example.worldline.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
public class Client {

 @Id
 @GeneratedValue
 private Long id;

 @Setter
 private String type;

 @Setter
 private double annualRevenue;

}