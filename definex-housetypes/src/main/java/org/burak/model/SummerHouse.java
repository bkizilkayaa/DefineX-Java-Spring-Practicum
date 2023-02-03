package org.burak.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class SummerHouse extends BaseHouse{
    public SummerHouse(int price, int squaremeters, String type, int room, int livingRoom, int numberOfPools, int numberOfTerraces) {
        super(price, squaremeters, type, room, livingRoom);
        this.numberOfPools=numberOfPools;
        this.numberOfTerraces=numberOfTerraces;
    }
    private int numberOfPools;
    private int numberOfTerraces;

}
