package org.example.projectweb.model;

import jakarta.persistence.*;

@Entity
@Table(name = "exercises")
public class Exercise {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exercise_id")
    private Long exerciseId;
    private String name;
    private String category;
    @Column(name = "equipment_required")
    private String equipmentRequired;
    private String description;
}
