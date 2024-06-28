package com.Inventory.demo.controller;


import com.Inventory.demo.request.ItemRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/Inventory")
public class InventoryController {

    @PostMapping("/create")
    public String CreateInventory(@RequestBody ItemRequest itemRequest){
        //successfully captured post

        System.out.println(itemRequest.getType());
        return itemRequest.getType();



    }
}
