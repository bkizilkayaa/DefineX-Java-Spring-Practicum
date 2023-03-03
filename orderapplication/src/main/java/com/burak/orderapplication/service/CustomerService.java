package com.burak.orderapplication.service;

import com.burak.orderapplication.model.Bill;
import com.burak.orderapplication.model.Customer;
import com.burak.orderapplication.repository.CustomerRepository;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerService {
    private CustomerRepository customerRepository=new CustomerRepository();
    public void addCustomer(Customer customer){
        customerRepository.addCustomer(customer);
    }
    public void printAllCustomers(List<Customer> customers){
        customers.forEach(System.out::println);
    }
    public List<Customer> getCustomersByGivenLetter(char _char){
        return customerRepository.getAllCustomers()
                .stream()
                .filter(x->x.getName().contains(String.valueOf(_char)))
                .collect(Collectors.toList());
    }
    public List<Customer> getAllCustomers(){
        return customerRepository.getAllCustomers();
    }
    public Customer getCustomerByGivenId(Long customerId){
        return customerRepository.getCustomerById(customerId);
    }
    public List<Customer> getCustomersWhichIsRegisteredInJune(){
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        return customerRepository.getAllCustomers()
                .stream()
                .filter(x->dtf.format(x.getCreationDate()).startsWith("Haziran"))
                .collect(Collectors.toList());
    }
    /*public double getCustomersTotalBillsWhichIsRegisteredInJune(){
        double totalValue=0;
        for (Customer customer:getCustomersWhichIsRegisteredInJune()){
            for (Bill bill:customer.getBillList()){
                totalValue+=bill.getTotalPrice();
            }
        }
        return totalValue;
    }*/
}
