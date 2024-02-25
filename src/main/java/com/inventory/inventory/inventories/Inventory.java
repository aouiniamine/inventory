package com.inventory.inventory.inventories;

import com.inventory.inventory.products.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "inventory")
public class Inventory {
    @Id
    @GeneratedValue
    private int id;
    @OneToMany(mappedBy = "product")
    private Set<Product> products = new HashSet<>();
    private String name;
    private String adress;
    private int zipCode;

    public Set<Product> getProducts() {
        return products;
    }

}
