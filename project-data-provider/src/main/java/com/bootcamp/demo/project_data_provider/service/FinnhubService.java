package com.bootcamp.demo.project_data_provider.service;

import com.bootcamp.demo.project_data_provider.model.dto.CompanyDataDTO;
import com.bootcamp.demo.project_data_provider.model.dto.QuoteDTO;

public interface FinnhubService {
  QuoteDTO getQuote(String symbol);
  CompanyDataDTO getCompanyData(String symbol);
}
