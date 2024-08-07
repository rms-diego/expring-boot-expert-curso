package com.vendas.secao3.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Order {
  @Id
  private Integer id;
  private String customerId;
  private LocalDate createdAt;
  private BigDecimal amount;

}
