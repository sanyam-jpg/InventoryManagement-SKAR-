package com.Inventory.demo.service;

import com.Inventory.demo.model.Item;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class GetInventoryServiceImpl implements GetInventoryService{
    @Autowired
    private GetInventoryService getInventoryService;

    @Override
    public Optional<Item> findById(String id){
        return getInventoryService.findById(id);
    }
}
