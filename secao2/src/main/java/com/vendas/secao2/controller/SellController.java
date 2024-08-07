package com.vendas.secao2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SellController {

  @Autowired
  @Qualifier("applicationName")
  private String applicationName;

  @GetMapping("/hello")
  public String helloWorld() {
    return this.applicationName;
  }
}
