package org.example.projectweb.repository;

import org.example.projectweb.model.MealItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealItemRepository extends JpaRepository<MealItem, Long> {
}
