package com.inventory.inventory.products;

import com.inventory.inventory.categories.Category;
import com.inventory.inventory.inventories.Inventory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "inventory_id", referencedColumnName = "id")
    private Inventory inventory;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;
    private int quantity;
    private String name;
    private double price;
    private String description;

    public Inventory getInventory() {
        return inventory;
    }
    public Category getCategory() {
        return category;
    }
}
