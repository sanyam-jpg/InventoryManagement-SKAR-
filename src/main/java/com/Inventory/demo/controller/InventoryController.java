package com.Inventory.demo.controller;


import com.Inventory.demo.model.Item;
import com.Inventory.demo.request.ItemRequest;
import com.Inventory.demo.service.CreateInventoryService;
import com.Inventory.demo.service.CreateInventoryServiceImpl;
import com.Inventory.demo.service.GetInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
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
//



    }

    // By kajal
    @Autowired
    private GetInventoryService getInventoryService;

    @GetMapping("findById/{id}")
    public ResponseEntity<Item> getInventoryBySku(@PathVariable(name= "id") String id){
//        Optional<Item> item = getInventoryService.findById(id);
//
//        if(item.isEmpty()){
//            return ResponseEntity.notFound().build();
//        }
//        else{
//            return ResponseEntity.ok().body(item.get());
//        }

        return ResponseEntity.ok(Item.buildFromEntity(this.getInventoryService.get(id)));
    }
}
