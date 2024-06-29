package com.Inventory.demo.model;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import com.Inventory.demo.request.ItemRequest;
import lombok.Data;

import java.sql.Time;
import java.util.Date;
import java.util.UUID;

@Data
public class Item{
    private String id;
    private String type;
    private String Location;
    private long costPrice;
    private long sellingPrice;
    private int createdBy;
    private String creationTime;
    private String lastUpdated;

    public Item(ItemRequest itemRequest){
        this.id = UUID.randomUUID().toString();
        this.type = itemRequest.getType();
        this.Location = itemRequest.getLocation();
        this.costPrice = itemRequest.getCostPrice();
        this.sellingPrice = itemRequest.getSellingPrice();
        this.createdBy = itemRequest.getCreatedBy();
        //put valid time and date
        this.creationTime = "time";
        this.lastUpdated = "time";
    }

    public String getCurrentDateAndTime(){
        LocalTime currentDateTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return currentDateTime.format(formatter);


    }

    // By kajal
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}