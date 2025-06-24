package org.example.projectweb.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "user_goals")
public class UserGoal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "goal_id")
    private Long goalId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "goal_type")
    private String goalType;

    @Column(name = "target_weight_kg")
    private BigDecimal targetWeightKg;

    @Column(name = "dailFunctionsy_calorie_goal")
    private Integer dailyCalorieGoal;

    @Column(name = "weekly_workout_goal")
    private Integer weeklyWorkoutGoal;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "is_active")
    private Boolean isActive;
}
