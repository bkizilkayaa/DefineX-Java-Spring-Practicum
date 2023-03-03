package com.burak.orderapplication.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Customer extends BaseModel {
    private String name;
    private String lastName;
    private Address address;

    private List<Order> orderList;
    private LocalDateTime creationDate;

    @Override
    public String toString() {
        return "\n"+"Customer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", orderList=" + orderList +
                ", creationDate=" + creationDate +
                '}';
    }
}
