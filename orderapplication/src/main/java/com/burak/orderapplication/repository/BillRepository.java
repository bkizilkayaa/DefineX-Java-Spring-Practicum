package com.burak.orderapplication.repository;

import com.burak.orderapplication.model.Bill;
import com.burak.orderapplication.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BillRepository {
    private List<Bill> billList= new ArrayList<>();

    public void addBill(Bill bill){
        billList.add(bill);
    }

    public void deleteBill(Bill bill){
        billList.remove(bill);
    }

    public List<Bill> getAllBills() {
        return billList;
    }


}
