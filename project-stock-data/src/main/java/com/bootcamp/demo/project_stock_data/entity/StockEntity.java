package com.bootcamp.demo.project_stock_data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "stocks")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StockEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(length = 20, name = "code", unique = true, nullable = false)
  private String symbol;
  @Column(length = 2, nullable = false)
  private String market; // US / HK
  @Column(length = 1, name = "active_ind", nullable = false)
  private String isActive;
}
