package com.Inventory.demo.controller;


import com.Inventory.demo.model.Item;
import com.Inventory.demo.request.ItemRequest;
import com.Inventory.demo.service.CreateInventoryService;
import com.Inventory.demo.service.CreateInventoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/Inventory")
public class InventoryController {

    private CreateInventoryService createInventoryService;

    @PostMapping("/create")
    public String CreateInventory(@RequestBody ItemRequest itemRequest){
        //successfully captured post

        //send ItemRequest to service
        createInventoryService = new CreateInventoryServiceImpl();
        return createInventoryService.createInventory(itemRequest);
        //change return type from string to JSON object

    }
}