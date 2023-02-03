package org.burak;

import org.burak.model.BaseHouse;
import org.burak.repository.AssetService;
import org.burak.service.HouseService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final int NUMBERS_OF_ROOM=2;
        final int NUMBERS_OF_LIVING_ROOM=1;

        AssetService.generateAssets(); //başlangıçta builder ile evler villalar ve yazlıklar üretilir
        System.out.println("--------------------------------------------------");
        System.out.println("Total price of standart houses : "+ HouseService.houseTotalPrice(AssetService.getHouseList()) + " €");
        System.out.println("Total price of summer houses   : "+ HouseService.summerHouseTotalPrice(AssetService.getSummerHouseList()) + " €");
        System.out.println("Total price of villas          : "+ HouseService.villaTotalPrice(AssetService.getVillaList()) + " €");
        System.out.println("Total price of all types       : "+ HouseService.calculateTotalPrice() + " €");
        System.out.println("--------------------------------------------------");

        System.out.println("Average area of standart houses : "+ HouseService.houseAvgArea() + " m²");
        System.out.println("Average area of summer houses   : "+ HouseService.summerHouseAvgArea() + " m²");
        System.out.println("Average area of villas          : "+ Math.ceil(HouseService.villaAvgArea()) + " m²");
        System.out.println("Average area of all types       : "+ Math.ceil(HouseService.calculateAvgArea(AssetService.getAllHouse())) + " m²");
        System.out.println("--------------------------------------------------");

        System.out.println("Filtered by rooms and living numbers :");
        List<BaseHouse> filteredList=HouseService.filterByRoomAndLivingRoom(NUMBERS_OF_ROOM,
                NUMBERS_OF_LIVING_ROOM,
                AssetService.getAllHouse());

        for (BaseHouse baseHouse:filteredList){
            System.out.println(baseHouse.toString());
        }
        System.out.println("--------------------------------------------------");
    }
}