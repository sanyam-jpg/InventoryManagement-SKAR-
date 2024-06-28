package com.Inventory.demo.controller;


import com.Inventory.demo.request.ItemRequest;
import com.Inventory.demo.service.CreateInventoryService;
import com.Inventory.demo.service.CreateInventoryServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

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
//



    }
}
