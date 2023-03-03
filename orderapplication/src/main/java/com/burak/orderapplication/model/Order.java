package com.burak.orderapplication.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
public class Order extends BaseModel{
      private List<Product> productList;
      private Bill bill;
      private LocalDateTime creationDate;

      @Override
      public String toString() {
            return "Order{" +
                    "productList=" + productList +
                    ", bill=" + bill +
                    '}';
      }
}
