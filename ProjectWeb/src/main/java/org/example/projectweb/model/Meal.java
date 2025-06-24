package org.example.projectweb.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "meals")
public class Meal {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "meal_id")
    private Long mealId;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "meal_type")
    private String mealType;
    @Column(name = "meal_date")
    private LocalDate mealDate;
    @Column(name = "total_calories")
    private Integer totalCalories;
}