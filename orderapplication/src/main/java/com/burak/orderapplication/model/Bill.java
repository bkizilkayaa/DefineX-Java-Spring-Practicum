package com.burak.orderapplication.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Bill extends BaseModel{
    private double totalPrice;
    private Company company;
    private Customer customer;
    private LocalDateTime creationDate;

    @Override
    public String toString() {
        return "\n"+"Bill{" +
                "totalPrice=" + totalPrice +
                ", company=" + company +
                ", customer=" + customer +
                ", creationDate=" + creationDate +
                '}';
    }
}
