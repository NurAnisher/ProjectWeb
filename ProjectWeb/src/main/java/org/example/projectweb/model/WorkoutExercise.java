package org.example.projectweb.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "workout_exercises")
public class WorkoutExercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "workout_id")
    private Integer workoutId;

    @Column(name = "exercise_id")
    private Integer exerciseId;

    private Integer sets;
    private Integer reps;

    @Column(name = "weight_kg")
    private BigDecimal weightKg;

    @Column(name = "duration_seconds")
    private Integer durationSeconds;

    @Column(name = "rest_seconds")
    private Integer restSeconds;


    }
