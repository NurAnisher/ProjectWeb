package org.example.projectweb.repository;

import org.example.projectweb.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {
    List<Meal> findByUserId(Integer userId);
    Optional<Meal> findByUserIdAndMealDateAndMealType(int userId, LocalDate mealDate, String mealType);
}

