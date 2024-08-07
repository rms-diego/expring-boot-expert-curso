package com.vendas.secao3.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Customer {
  @Id
  private Integer id;
  private String description;
  private BigDecimal amount;

}
