package org.example.projectweb.service;

import org.example.projectweb.model.Meal;
import org.example.projectweb.model.MealItem;
import org.example.projectweb.repository.MealItemRepository;
import org.example.projectweb.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class MealServiceImpl implements Meal_Service {

    @Autowired
    private MealRepository mealRepository;

    @Autowired
    private MealItemRepository mealItemRepository;

    @Override
    public Meal saveMeal(Meal meal) {
        return mealRepository.save(meal);
    }

    @Override
    public void saveMealItem(MealItem item) {
        mealItemRepository.save(item);
    }

    @Override
    public List<Meal> getMealsByUserId(Integer userId) {
        return mealRepository.findByUserId(userId);
    }

    @Override
    public Meal getMealById(Long id) {
        return mealRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteMeal(Long id) {
        mealRepository.deleteById(id);
    }

    @Override
    public Optional<Meal> findByUserIdAndMealDateAndMealType(Long userId, LocalDate date, String mealType) {
        return mealRepository.findByUserIdAndMealDateAndMealType(Math.toIntExact(userId), date, mealType);
    }
}
