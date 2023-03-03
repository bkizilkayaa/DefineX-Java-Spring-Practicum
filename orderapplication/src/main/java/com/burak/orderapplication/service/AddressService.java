package com.burak.orderapplication.service;

import com.burak.orderapplication.model.Address;
import com.burak.orderapplication.repository.AddressRepository;

public class AddressService {
    private AddressRepository addressRepository=new AddressRepository();
    public void addAddress(Address address){
        addressRepository.addAddress(address);
    }

    public Address getAddressById(Long id){
        return addressRepository.getAddressById(id);
    }


}
