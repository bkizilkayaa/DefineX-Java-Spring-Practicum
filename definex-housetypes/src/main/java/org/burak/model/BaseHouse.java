package org.burak.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder

public class BaseHouse {
    private int price;
    private int squaremeters;
    private String type;
    private int room;
    private int livingRoom;

    @Override
    public String toString() {
        return "BaseHouse {" +
                "price=" + price + "€"+
                ", squaremeters=" + squaremeters +
                ", type='" + type + '\'' +
                ", room=" + room +
                ", livingRoom=" + livingRoom +
                '}';
    }
}
