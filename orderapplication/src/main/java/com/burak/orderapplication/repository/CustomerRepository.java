package com.burak.orderapplication.repository;

import com.burak.orderapplication.exception.CustomerCannotFindById;
import com.burak.orderapplication.model.Bill;
import com.burak.orderapplication.model.Customer;
import com.burak.orderapplication.service.CustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CustomerRepository {
    private List<Customer> customerList=new ArrayList<>();

    public void addCustomer(Customer customer){
        customerList.add(customer);
    }
    public List<Customer> getAllCustomers(){
        return customerList;
    }
    public void deleteCustomer(Customer customer){
        customerList.remove(customer);
    }
    public Customer getCustomerById(Long customerId) throws CustomerCannotFindById {
        //customerId ile eşleşeni bul, bulamazsan customer bulunamadı exception dön
        return customerList.stream()
                .filter(x-> Objects.equals(x.getId(), customerId))
                .findAny()
                .orElseThrow(()->
                        new CustomerCannotFindById("customer cannot find by id"));
    }

}
