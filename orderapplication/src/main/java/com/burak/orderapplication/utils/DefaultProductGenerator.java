package com.burak.orderapplication.utils;

import com.burak.orderapplication.model.Product;

import java.util.ArrayList;
import java.util.List;

public class DefaultProductGenerator {
    public static List<Product> defaultProductGenerator(){
        Product product=Product.builder()
                .name("TV")
                .category("Tech")
                .id(1L)
                .stock(1000)
                .price(150)
                .build();
        Product product2=Product.builder()
                .name("Ps5")
                .id(2L)
                .category("Tech")
                .stock(400)
                .price(950)
                .build();
        Product product3=Product.builder()
                .name("Cream")
                .id(3L)
                .category("Farmacy")
                .stock(400)
                .price(950)
                .build();

        List<Product> _productList=new ArrayList<>();
        _productList.add(product);
        _productList.add(product2);
        _productList.add(product3);

        return _productList;
    }

}
