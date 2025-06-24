package org.example.projectweb.controller;

import org.example.projectweb.model.MealItem;
import org.example.projectweb.repository.MealItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/meal-items")
public class MealItemController {
    @Autowired private MealItemRepository itemRepo;

    @PostMapping("/add")
    public MealItem addItem(@RequestBody MealItem item) {
        return itemRepo.save(item);
    }

    @GetMapping("/meal/{meal_id}")
    public List<MealItem> getItems(@PathVariable Integer meal_id) {
        return itemRepo.findByMealId(meal_id);
    }
}
