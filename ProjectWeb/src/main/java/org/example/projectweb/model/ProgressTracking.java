package org.example.projectweb.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "progress_tracking")
public class ProgressTracking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "progress_id")
    private Long progressId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "progress_date")
    private LocalDate progressDate;

    @Column(name = "weight_kg")
    private BigDecimal weightKg;

    @Column(name = "body_fat_percentage")
    private BigDecimal bodyFatPercentage;

    @Column(name = "waist_cm")
    private BigDecimal waistCm;

    @Column(name = "hips_cm")
    private BigDecimal hipsCm;

    @Column(name = "chest_cm")
    private BigDecimal chestCm;

    private String notes;
}