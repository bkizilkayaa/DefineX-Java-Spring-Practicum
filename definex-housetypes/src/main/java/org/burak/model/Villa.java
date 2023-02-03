package org.burak.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
public class Villa extends BaseHouse {
    private boolean hasGarden;
    private int numberOfTerraces;

    public Villa(int price, int squaremeters, String type, int room, int livingRoom, boolean hasGarden, int numberOfTerraces) {
        super(price, squaremeters, type, room, livingRoom);
        this.hasGarden = hasGarden;
        this.numberOfTerraces=numberOfTerraces;
    }



}
