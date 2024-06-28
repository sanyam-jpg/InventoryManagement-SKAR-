package com.Inventory.demo.service;

import com.Inventory.demo.Configration.ItemType;
import com.Inventory.demo.model.Item;
import com.Inventory.demo.request.ItemRequest;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class CreateInventoryServiceImpl implements CreateInventoryService{

    @Override
    public String createInventory(ItemRequest itemRequest) {
        if(!typeIsValid(itemRequest.getType())){
            //return json error
            return "Error";
        }
        Item item = new Item(itemRequest);
        return item.getCreationTime();
        //send item to Repository for DB interaction


    }
    private boolean typeIsValid(String type){
        if(type==null || type.isEmpty()){
            return false;
        }

        //check type is not out of the three predifined value
        for(ItemType itemType : ItemType.values()){
                if(type.toUpperCase().equals(itemType.name())){
                    return true;
                }
        }

        return false;

    }
}
