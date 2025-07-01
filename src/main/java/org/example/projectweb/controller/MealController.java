package org.example.projectweb.controller;

import org.example.projectweb.model.Meal;
import org.example.projectweb.model.MealItem;
import org.example.projectweb.service.MealServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/meals")
public class MealController {

    @Autowired
    private MealServiceImpl mealService;

    @PostMapping("/add")
    public ResponseEntity<String> addMeal(@RequestBody MealRequest mealRequest) {
        try {
            LocalDate date = LocalDate.parse(mealRequest.getMealDate());

            Optional<Meal> optionalMeal = mealService.findByUserIdAndMealDateAndMealType(
                    mealRequest.getUserId(),
                    date,
                    mealRequest.getMealType());

            Meal meal;
            if (optionalMeal.isPresent()) {
                meal = optionalMeal.get();
            } else {
                meal = new Meal();
                meal.setUserId(mealRequest.getUserId());
                meal.setMealDate(date);
                meal.setMealType(mealRequest.getMealType());
                meal.setTotalCalories(mealRequest.getCalories());
                meal = mealService.saveMeal(meal);
            }

           //Create new MealItem and link to meal
            MealItem item = new MealItem();
            item.setFoodName(mealRequest.getFoodName());
            item.setQuantity(mealRequest.getQuantity());
            item.setCalories(mealRequest.getCalories());
            item.setProteinG(mealRequest.getProtein());
            item.setCarbsG(mealRequest.getCarbs());
            item.setFatsG(mealRequest.getFats());
            item.setMeal(meal); // Set parent

            meal.getItems().add(item);

            meal = mealService.saveMeal(meal);

            return ResponseEntity.ok("Meal logged successfully!");

        } catch (Exception e) {
            e.printStackTrace(); // for debugging
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error saving meal: " + e.getMessage());
        }
}}
