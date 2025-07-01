package org.example.projectweb.controller;

import org.example.projectweb.model.Workout;
import org.example.projectweb.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workouts")
@CrossOrigin(origins = "*") // Benarkan frontend akses
public class WorkoutController {

    @Autowired
    private WorkoutService workoutService;

    // Simpan workout baru
    @PostMapping("/add")
    public Workout saveWorkout(@RequestBody Workout workout) {
        return workoutService.saveWorkout(workout);
    }

    // Kemaskini workout
    @PutMapping("/update")
    public Workout updateWorkout(@RequestBody Workout workout) {
        return workoutService.updateWorkout(workout);
    }

    // Padam workout ikut userId dan workoutId
    @DeleteMapping("/delete/{userId}/{workoutId}")
    public String deleteWorkout(@PathVariable int userId, @PathVariable Long workoutId) {
        boolean deleted = workoutService.deleteWorkout(userId, workoutId);
        return deleted ? "Workout deleted successfully" : "Workout not found";
    }

    // Ambil semua workout ikut userId
    @GetMapping("/user/{userId}")
    public List<Workout> getWorkoutsByUser(@PathVariable int userId) {
        return workoutService.getWorkoutsByUserId(userId);
    }

    // (Opsyenal) Ambil semua workout
    @GetMapping("/all")
    public List<Workout> getAllWorkouts() {
        return workoutService.getAllWorkouts();
    }
}
