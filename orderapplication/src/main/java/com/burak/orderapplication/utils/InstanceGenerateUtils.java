package com.burak.orderapplication.utils;

import com.burak.orderapplication.model.*;
import com.burak.orderapplication.service.AddressService;
import com.burak.orderapplication.service.BillService;
import com.burak.orderapplication.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class InstanceGenerateUtils {
    public static void generateInstances(AddressService addressService,
                                         CustomerService customerService,
                                         BillService billService){
        Address address=Address.builder()
                .block("A")
                .id(1L)
                .city("Istanbul")
                .street("Gul")
                .country("Turkiye")
                .build();

        List<Product> _productList = DefaultProductGenerator.defaultProductGenerator();
        Company company=Company.builder()
                .name("Brand")
                .id(1L)
                .sector("Technology")
                .build();

        Company company2=Company.builder()
                .name("Brand2")
                .id(2L)
                .sector("Farm")
                .build();

        Customer customer=Customer.builder()
                .name("BuCak")
                .id(1L)
                .lastName("Kizilkaya")
                .creationDate(LocalDateTime.now())
                .address(address)
                .build();

        Bill bill=Bill.builder()
                .totalPrice(1520)
                .id(1L)
                .creationDate(LocalDateTime.now())
                .company(company)
                .build();
        Bill bill2=Bill.builder()
                .totalPrice(320)
                .id(2L)
                .creationDate(LocalDateTime.now())
                .company(company2)
                .build();

        Order order=Order.builder()
                .creationDate(LocalDateTime.now())
                .productList(_productList)
                .id(1L)
                .bill(bill)
                .build();

        Order order2=Order.builder()
                .creationDate(LocalDateTime.now())
                .productList(_productList)
                .id(2L)
                .bill(bill2)
                .build();



        List<Order> orderList=new ArrayList<>();

        bill.setCustomer(customer);
        bill2.setCustomer(customer);

        order.setBill(bill);
        order2.setBill(bill2);

        orderList.add(order2);
        orderList.add(order);
        //List<Bill> billList3=billService.getAllBills();


        billService.addBill(bill);
        billService.addBill(bill2);
        //customer.setOrderList(orderList);
        customerService.addCustomer(customer);

    }
}
