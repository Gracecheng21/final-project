package com.bootcamp.demo.project_data_provider.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo.project_data_provider.controller.StockDataOperation;
import com.bootcamp.demo.project_data_provider.dto.QuoteDto;
import com.bootcamp.demo.project_data_provider.dto.mapper.QuoteDtoMapper;
import com.bootcamp.demo.project_data_provider.model.dto.CompanyDataDTO;
import com.bootcamp.demo.project_data_provider.model.dto.QuoteDTO;
import com.bootcamp.demo.project_data_provider.service.FinnhubService;

@RestController
public class StockDataController implements StockDataOperation{
  @Autowired
  private FinnhubService finnhubService;
  @Autowired
  private QuoteDtoMapper quoteDtoMapper;

  @Override
  public QuoteDto getQuote(String symbol) {
    QuoteDTO quoteDTO = this.finnhubService.getQuote(symbol);
    return quoteDtoMapper.map(symbol, quoteDTO);
  }

  @Override
  public CompanyDataDTO getCompanyProfile(String symbol) {
    return this.finnhubService.getCompanyData(symbol);
  }
  
}
