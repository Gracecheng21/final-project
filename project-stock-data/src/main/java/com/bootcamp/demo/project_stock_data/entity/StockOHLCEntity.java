package com.bootcamp.demo.project_stock_data.entity;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "stock_ohlcs")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StockOHLCEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(unique = true)
  private LocalDate date;
  private String symbol;
  @Column(name = "open_price", nullable = false)
  private Double openPrice;
  @Column(name = "high_price", nullable = false)
  private Double highPrice;
  @Column(name = "low_price", nullable = false)
  private Double lowPrice;
  @Column(name = "close_price", nullable = false)
  private Double closePrice;
  private Long volume;

  @ManyToOne
  @JoinColumn(name = "stock_id", nullable = false)
  private StockEntity stockEntity;
}
