package org.example.projectweb.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "workouts")
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "workout_id")
    private Long workoutId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "workout_date")
    private LocalDate workoutDate;

    @Column(name = "workout_title")
    private String workoutTitle;

    @Column(name = "workout_type")
    private String workoutType;

    @Column(name = "duration_minutes")
    private Integer durationMinutes;

    private String notes;
}
