package org.example.projectweb.controller;

import org.example.projectweb.model.Exercise;
import org.example.projectweb.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/exercises")
public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;

    @PostMapping("/add")
    public Exercise addExercise(@RequestBody Exercise exercise) {
        return exerciseService.saveExercise(exercise);
    }

    @GetMapping("/all")
    public List<Exercise> getAllExercises() {
        return exerciseService.getAllExercises();
    }
}
