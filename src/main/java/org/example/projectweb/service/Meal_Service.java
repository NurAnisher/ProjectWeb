package org.example.projectweb.service;



import org.example.projectweb.model.Meal;
import org.example.projectweb.model.MealItem;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface Meal_Service {
    Meal saveMeal(Meal meal);
    void saveMealItem(MealItem item);
    List<Meal> getMealsByUserId(Integer userId);
    Meal getMealById(Long id);
    void deleteMeal(Long id);
    Optional<Meal> findByUserIdAndMealDateAndMealType(Long userId, LocalDate date, String mealType);
}

