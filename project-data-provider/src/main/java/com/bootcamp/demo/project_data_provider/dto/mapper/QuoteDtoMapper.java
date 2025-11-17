package com.bootcamp.demo.project_data_provider.dto.mapper;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import org.springframework.stereotype.Component;
import com.bootcamp.demo.project_data_provider.dto.QuoteDto;
import com.bootcamp.demo.project_data_provider.model.dto.QuoteDTO;

@Component
public class QuoteDtoMapper {
  public QuoteDto map(String symbol, QuoteDTO quoteDTO) {
    return QuoteDto.builder() //
      .symbol(symbol) //
      .closePrice(quoteDTO.getPreviousClosePrice()) //
      .highPrice(quoteDTO.getHighPrice()) //
      .lowPrice(quoteDTO.getLowPrice()) //
      .openPrice(quoteDTO.getOpenPrice()) //
      .dateTime(ZonedDateTime.now(ZoneId.of("Asia/Hong_Kong")))//
      .build();
  }
}
