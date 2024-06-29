package com.Inventory.demo.service;

import com.Inventory.demo.model.Item;
import com.Inventory.demo.request.ItemRequest;

import java.util.Optional;

public interface GetInventoryService {
    Optional<Item> findById(String id);
}
