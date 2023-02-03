package org.burak.service;

import org.burak.model.BaseHouse;
import org.burak.model.House;
import org.burak.model.SummerHouse;
import org.burak.model.Villa;
import org.burak.repository.AssetService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HouseService {
    //base bir classtan türetilen sınıflarımız olduğu için
    //sadece bir java classta tüm metotları bir sefer yazarak farklı nesneler için çalıştırabiliriz.
    private static double totalPrice(List<BaseHouse> totals){
        return totals
                .stream()
                .map(BaseHouse::getPrice)
                .reduce(0,Integer::sum);
    }
    public static double calculateTotalPrice(){
        return totalPrice(AssetService.getAllHouse());
    }
    public static double calculateAvgArea(List<BaseHouse> houses){
        return houses
                .stream()
                .map(BaseHouse::getSquaremeters)
                .reduce(0, Integer::sum)/houses.size();
    }
     public static double houseTotalPrice(List<BaseHouse> houses){
        return totalPrice(houses);
    }
    public static double villaTotalPrice(List<BaseHouse> villas){
        return totalPrice(villas);
    }
    public static double summerHouseTotalPrice(List<BaseHouse> summerHouses){
        return totalPrice(summerHouses);
    }
    public static double houseAvgArea(){
        return calculateAvgArea(AssetService.getHouseList());
    }
    public static double summerHouseAvgArea(){
        return calculateAvgArea(AssetService.getSummerHouseList());
    }
    public static double villaAvgArea(){
        return calculateAvgArea(AssetService.getVillaList());
    }
    public static List<BaseHouse> filterByRoomAndLivingRoom(int numbersOfRoom,
                                                            int numbersOfLivingRoom,
                                                            List<BaseHouse> allHouses){
        return allHouses
                .stream()
                .filter(house -> house.getRoom() == numbersOfRoom)
                .filter(house -> house.getLivingRoom() == numbersOfLivingRoom)
                .collect(Collectors.toList());
    }



}
