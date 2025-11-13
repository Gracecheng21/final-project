package com.bootcamp.demo.project_data_provider.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.bootcamp.demo.project_data_provider.model.dto.CompanyDataDTO;
import com.bootcamp.demo.project_data_provider.model.dto.QuoteDTO;
import com.bootcamp.demo.project_data_provider.service.FinnhubService;

@Service
public class FinnhubServiceImpl implements FinnhubService {
  @Autowired
  private RestTemplate restTemplate;

  private static final String apiKey = "d43arkpr01qvk0jb1gtgd43arkpr01qvk0jb1gu0";

  // https://finnhub.io/api/v1/quote?symbol=AAPL&token=apiKey
  @Override
  public QuoteDTO getQuote(String symbol) {
    String quoteUrl = UriComponentsBuilder.newInstance() //
        .scheme("https") //
        .host("finnhub.io") //
        .path("/api/v1/quote") //
        .queryParam("symbol", symbol) //
        .queryParam("token", apiKey) //
        .build().toUriString();
    return this.restTemplate.getForObject(quoteUrl, QuoteDTO.class);
        // Convert JSON response → QuoteDTO automatically
  }

  // https://finnhub.io/api/v1/stock/profile2?symbol=AAPL&token=apiKey
  @Override
  public CompanyDataDTO getCompanyData(String symbol) {
    String companyDataUrl = UriComponentsBuilder.newInstance() //
        .scheme("https") //
        .host("finnhub.io") //
        .path("/api/v1/stock/profile2") //
        .queryParam("symbol", symbol) //
        .queryParam("token", apiKey) //
        .build().toUriString();
    return this.restTemplate.getForObject(companyDataUrl, CompanyDataDTO.class);
  }


}
