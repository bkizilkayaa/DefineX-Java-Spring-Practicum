package com.burak.orderapplication.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Company extends BaseModel {
    private String name;
    private String sector;
    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", sector='" + sector + '\'' +
                '}';
    }
}
