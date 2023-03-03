package com.burak.orderapplication.service;

import com.burak.orderapplication.model.Bill;
import com.burak.orderapplication.model.Customer;
import com.burak.orderapplication.repository.BillRepository;
import com.burak.orderapplication.repository.CustomerRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class BillService {
    private BillRepository billRepository=new BillRepository();
    public void addBill(Bill bill){
        billRepository.addBill(bill);
    }
    public void deleteBill(Bill bill){
        billRepository.deleteBill(bill);
    }

    //sistemdeki tüm faturaların listesini dönen metot
    public List<Bill> getAllBills(){
        return billRepository.getAllBills();
    }

    //1500 tl üzerindeki faturaların listesini geri dönen metot
    public List<Bill> getAllBillsOverOneThousandAndFiveHundred(){
        return billRepository.getAllBills()
                .stream()
                .filter(x->x.getTotalPrice()>1500)
                .collect(Collectors.toList());
    }
    //500 tl altındaki faturalara sahip müşterilerin isimlerinin listesini dönen metot
    public List<String> getAllNamesOfUnderFiveHundredBills(){
       return billRepository.getAllBills()
                .stream()
                .filter(x->x.getTotalPrice()<500.0)
                .map(Bill::getCustomer)
                .map(Customer::getName)
                .collect(Collectors.toList());
    }
    //1500 tl üzerindeki faturaların ortalamasını bul
    public double getAvgOfBillsOverOneThousandAndFiveHundred(){
        List<Bill> listOfOverThousandAndFiveHundred=getAllBillsOverOneThousandAndFiveHundred();
        return listOfOverThousandAndFiveHundred
                .stream()
                .map(Bill::getTotalPrice)
                .reduce(0.0,Double::sum)/listOfOverThousandAndFiveHundred.size();
    }
    public void addBillToCustomer(Customer customer, Bill bill){
        bill.setCustomer(customer);
    }
}
