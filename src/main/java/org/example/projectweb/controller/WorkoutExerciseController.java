package org.example.projectweb.controller;

import org.example.projectweb.model.WorkoutExercise;
import org.example.projectweb.repository.WorkoutExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workout-exercises")
public class WorkoutExerciseController {
    @Autowired private WorkoutExerciseRepository exerciseRepo;

    @PostMapping("/add")
    public WorkoutExercise addWorkoutExercise(@RequestBody WorkoutExercise ex) {
        return exerciseRepo.save(ex);
    }

    @GetMapping("/workout/{workout_id}")
    public List<WorkoutExercise> getExercises(@PathVariable Integer workout_id) {
        return exerciseRepo.findByWorkoutId(workout_id);
    }
}
