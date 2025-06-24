package org.example.projectweb.controller;

import org.example.projectweb.model.Meal;
import org.example.projectweb.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/meals")
public class MealController {
    @Autowired private MealRepository mealRepo;

    @PostMapping("/add")
    public Meal addMeal(@RequestBody Meal meal) {
        return mealRepo.save(meal);
    }

    @GetMapping("/user/{user_id}")
    public List<Meal> getMealsByUser(@PathVariable Integer user_id) {
        return mealRepo.findByUserId(user_id);
    }
}