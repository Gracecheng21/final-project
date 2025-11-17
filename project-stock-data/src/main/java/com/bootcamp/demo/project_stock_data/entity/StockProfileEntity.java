package com.bootcamp.demo.project_stock_data.entity;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "stock_profiles")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StockProfileEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(unique = true, nullable = false)
  private String symbol;
  @Column(length = 2, nullable = false)
  private String market;
  @Column(length = 3, nullable = false)
  private String currency;
  @Column(nullable = false)
  private String exchange;
  @Column(nullable = false)
  private String industry;
  @Column(name = "ipo_date", nullable = false)
  private LocalDate ipoDate;
  @Column(nullable = false)
  private String logo;
  @Column(name = "market_cap", nullable = false)
  private Double marketCapitalization;
  @Column(nullable = false)
  private String name;
  @Column(name = "share_outstanding", nullable = false)
  private Double shareOutstanding;
  @Column(name = "web_url", nullable = false)
  private String weburl;

  @Setter
  @OneToOne
  @JoinColumn(name = "stock_id", nullable = false)
  private StockEntity stockEntity;
}
