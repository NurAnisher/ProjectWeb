package org.example.projectweb.service;

import org.example.projectweb.model.Meal;
import org.example.projectweb.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealService {
    @Autowired
    private MealRepository mealRepository;

    public Meal saveMeal(Meal meal) {
        return mealRepository.save(meal);
    }

    public List<Meal> getMealsByUserId(Integer userId) {
        return mealRepository.findByUserId(userId);
    }
}
