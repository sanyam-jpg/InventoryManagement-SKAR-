package com.Inventory.demo.request;

import lombok.Data;

//using this annotation I dont need to write getter setter and constructor, JVM understands
//that ItemRequest have these.
@Data
public class ItemRequest {

    private String type;
    private String Location;
    private long costPrice;
    private long sellingPrice;
    private int createdBy;

}






