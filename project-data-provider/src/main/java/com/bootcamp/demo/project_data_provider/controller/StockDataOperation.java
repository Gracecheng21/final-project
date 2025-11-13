package com.bootcamp.demo.project_data_provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.bootcamp.demo.project_data_provider.dto.QuoteDto;
import com.bootcamp.demo.project_data_provider.model.dto.CompanyDataDTO;

public interface StockDataOperation {
  @GetMapping(value = "/quote")
    QuoteDto getQuote(@RequestParam String symbol);

  @GetMapping(value = "/companyprofile")
    CompanyDataDTO getCompanyProfile(@RequestParam String symbol);
}
