package org.burak.repository;

import org.burak.model.BaseHouse;
import org.burak.model.House;
import org.burak.model.SummerHouse;
import org.burak.model.Villa;

import java.util.ArrayList;
import java.util.List;

public class AssetService {
    private static List<BaseHouse> houseList=new ArrayList<>();
    private static List<BaseHouse> villaList=new ArrayList<>();
    private static List<BaseHouse> summerHouseList=new ArrayList<>();

    public static List<BaseHouse> getHouseList() {
        return houseList;
    }
    public static List<BaseHouse> getAllHouse() {
        List<BaseHouse> allHouses = new ArrayList<>();
        allHouses.addAll(houseList);
        allHouses.addAll(villaList);
        allHouses.addAll(summerHouseList);
        return allHouses;
    }
    public static List<BaseHouse> getVillaList() {
        return villaList;
    }
    public static List<BaseHouse> getSummerHouseList() {
        return summerHouseList;
    }
    public static void generateAssets(){
        House house1=House.builder().room(3).price(100000).type("House").squaremeters(140).livingRoom(1).build();
        House house2=House.builder().room(2).price(70000).type("House").squaremeters(90).livingRoom(1).build();
        House house3=House.builder().room(4).price(180000).type("House").squaremeters(160).livingRoom(1).build();
        houseList.add(house1);
        houseList.add(house2);
        houseList.add(house3);

        SummerHouse summerHouse1=SummerHouse.builder().room(3)
                .price(212000).type("Summer House").squaremeters(150)
                .livingRoom(1).numberOfPools(2).numberOfTerraces(1).build();

        SummerHouse summerHouse2=SummerHouse.builder().room(3)
                .price(425000).type("Summer House").squaremeters(170)
                .livingRoom(2).numberOfPools(3).numberOfTerraces(2).build();

        SummerHouse summerHouse3=SummerHouse.builder().room(4)
                .price(672000).type("Summer House").squaremeters(220)
                .livingRoom(3).numberOfPools(2).numberOfTerraces(4).build();
        summerHouseList.add(summerHouse1);
        summerHouseList.add(summerHouse2);
        summerHouseList.add(summerHouse3);

        Villa villa1=Villa.builder().room(4)
                .price(441000).type("Villa").squaremeters(220)
                .livingRoom(3).hasGarden(false).numberOfTerraces(3).build();

        Villa villa2=Villa.builder().room(5)
                .price(959000).type("Villa").squaremeters(250)
                .livingRoom(4).hasGarden(true).numberOfTerraces(3).build();

        Villa villa3=Villa.builder().room(5)
                .price(1211000).type("Villa").squaremeters(320)
                .livingRoom(3).hasGarden(true).numberOfTerraces(3).build();
        villaList.add(villa1);
        villaList.add(villa2);
        villaList.add(villa3);
    }


}
