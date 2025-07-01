package org.example.projectweb.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long workoutId;

    private int userId;
    private int exerciseId;
    private int sets;
    private int reps;
    private double weightKg;
    private int durationSeconds;
    private int restSeconds;
}
