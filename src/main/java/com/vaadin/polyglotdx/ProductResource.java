package com.vaadin.polyglotdx;

import java.util.List;

import com.vaadin.polyglotdx.data.Product;
import com.vaadin.polyglotdx.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;


import com.vaadin.connect.VaadinService;
import com.vaadin.connect.auth.AnonymousAllowed;

/**
 * A Vaadin Connect service that counts numbers.
 */
@VaadinService
@AnonymousAllowed
public class ProductResource {

@Autowired
    private ProductRepository productRepository;

    public List<Product> retrieveAllProducts() {
       return productRepository.findAll();
    }
}    