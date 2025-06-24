package org.example.projectweb.service;

import org.example.projectweb.model.MealItem;
import org.example.projectweb.repository.MealItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealItemService {
    @Autowired
    private MealItemRepository mealItemRepository;

    public MealItem saveMealItem(MealItem item) {
        return mealItemRepository.save(item);
    }

    public List<MealItem> getItemsByMealId(Integer mealId) {
        return mealItemRepository.findByMealId(mealId);
    }
}

