package com.bootcamp.demo.project_data_provider.model.dto;

import java.time.LocalDate;
import lombok.Getter;

@Getter
public class CompanyDataDto {
  private String country;
  private String currency;
  private String estimateCurreny;
  private String exchange;
  private String finnhubIndustry;
  private LocalDate ipo;
  private String logo;
  private Double marketCapitalization;
  private String name;
  private String phone;
  private Double shareOutstanding;
  private String ticker;
  private String weburl;
}
