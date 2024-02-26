package com.inventory.inventory.categories;

import com.inventory.inventory.products.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "category")
public class Category {

    @GeneratedValue
    @Id
    private int id;
    private String name;

    @OneToMany(mappedBy = "product")
    private Set<Product> products = new HashSet<>();
}
