package com.Inventory.demo.repository;

import com.Inventory.demo.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface InventoryRepository extends JpaRepository<Item, Long> {
    //public String save(Item item);
}
