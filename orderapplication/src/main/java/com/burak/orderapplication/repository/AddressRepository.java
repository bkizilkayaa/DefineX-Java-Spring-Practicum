package com.burak.orderapplication.repository;

import com.burak.orderapplication.model.Address;

import java.util.ArrayList;
import java.util.List;

public class AddressRepository {
    private List<Address> addressList= new ArrayList<>();
    public void addAddress(Address address){
        addressList.add(address);
    }


    public Address getAddressById(Long id) {
        return addressList.get(id.intValue());

    }
}
