package com.vendas.secao3.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class OrdersProducts {
  @Id
  private Integer id;
  private Integer orderId;
  private Integer productId;
  private BigDecimal amount;

}
