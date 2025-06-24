package org.example.projectweb.repository;

import org.example.projectweb.model.MealItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MealItemRepository extends JpaRepository<MealItem, Long> {
    List<MealItem> findByMealId(Integer meal_id);
}