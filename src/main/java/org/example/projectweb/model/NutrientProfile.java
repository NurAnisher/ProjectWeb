package org.example.projectweb.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.security.Timestamp;

@Entity
@Table(name = "nutrient_profiles")
public class NutrientProfile {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "profile_id")
    private Long profileId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "daily_calories")
    private Integer dailyCalories;

    @Column(name = "protein_g")
    private BigDecimal proteinG;

    @Column(name = "carbs_g")
    private BigDecimal carbsG;

    @Column(name = "fats_g")
    private BigDecimal fatsG;

    @Column(name = "created_at")
    private Timestamp createdAt;
}