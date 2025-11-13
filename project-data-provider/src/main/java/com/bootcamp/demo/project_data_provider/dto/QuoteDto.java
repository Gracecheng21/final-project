package com.bootcamp.demo.project_data_provider.dto;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class QuoteDto {
  private String symbol;
  private Double openPrice;
  private Double highPrice;
  private Double lowPrice;
  private Double closePrice;
  @Builder.Default
  private String dateTime = ZonedDateTime.now(ZoneId.of("Asia/Hong_Kong"))
      .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss Z z"));
}
