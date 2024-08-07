package com.vendas.secao2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

  @Bean(name = "applicationName")
  public String ApplicationName() {
    return "secao 2 sistema de vendas";
  }
}
