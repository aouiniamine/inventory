package com.inventory.inventory.categories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatogoryService {
    @Autowired
    private CategoryRepository repository;

    public Category Save(Category category){
        return repository.save(category);
    }

    public Category update(Category category){
        return repository.save(category);
    }
}
