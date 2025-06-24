package org.example.projectweb.controller;

import org.example.projectweb.model.Workout;
import org.example.projectweb.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {
    @Autowired private WorkoutRepository workoutRepo;

    @PostMapping("/add")
    public Workout addWorkout(@RequestBody Workout workout) {
        return workoutRepo.save(workout);
    }

    @GetMapping("/user/{user_id}")
    public List<Workout> getWorkoutsByUser(@PathVariable Integer user_id) {
        return workoutRepo.findByUserId(user_id);
    }
}
