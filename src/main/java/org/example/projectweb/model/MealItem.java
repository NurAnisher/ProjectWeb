package org.example.projectweb.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "meals_items")
public class MealItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long itemId;

    @Column(name = "meal_id")
    private Integer mealId;

    @Column(name = "food_name")
    private String foodName;

    private Integer calories;

    @Column(name = "protein_g")
    private BigDecimal proteinG;

    @Column(name = "carbs_g")
    private BigDecimal carbsG;

    @Column(name = "fats_g")
    private BigDecimal fatsG;

    private String quantity;
}