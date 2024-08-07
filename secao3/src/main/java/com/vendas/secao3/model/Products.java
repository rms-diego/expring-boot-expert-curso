package com.vendas.secao3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Products {
  @Id
  private Integer id;
  private String name;

}
