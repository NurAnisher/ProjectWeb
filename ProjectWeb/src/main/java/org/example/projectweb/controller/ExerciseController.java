package org.example.projectweb.controller;

import org.example.projectweb.model.Exercise;
import org.example.projectweb.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exercises")
public class ExerciseController {
    @Autowired private ExerciseRepository exerciseRepo;

    @GetMapping("/")
    public List<Exercise> getAllExercises() {
        return exerciseRepo.findAll();
    }

    @PostMapping("/add")
    public Exercise addExercise(@RequestBody Exercise exercise) {
        return exerciseRepo.save(exercise);
    }
}