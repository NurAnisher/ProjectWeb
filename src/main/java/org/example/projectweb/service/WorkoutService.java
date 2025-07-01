package org.example.projectweb.service;

import org.example.projectweb.model.Workout;
import org.example.projectweb.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkoutService {

    @Autowired
    private WorkoutRepository workoutRepo;

    // Simpan workout baru
    public Workout saveWorkout(Workout workout) {
        return workoutRepo.save(workout);
    }

    // Kemaskini workout sedia ada
    public Workout updateWorkout(Workout workout) {
        Optional<Workout> existing = workoutRepo.findById(workout.getWorkoutId());
        if (existing.isPresent()) {
            return workoutRepo.save(workout);
        } else {
            throw new RuntimeException("Workout not found");
        }
    }

    // Padam workout ikut userId dan workoutId
    public boolean deleteWorkout(int userId, Long workoutId) {
        return workoutRepo.findByUserIdAndWorkoutId(userId, workoutId).map(w -> {
            workoutRepo.delete(w);
            return true;
        }).orElse(false);
    }

    // Ambil semua workout ikut userId (limit 100 untuk elak error LIMIT)
    public List<Workout> getWorkoutsByUserId(int userId) {
        return workoutRepo.findTop100ByUserId(userId);
    }

    // (Opsyenal) Ambil semua workout dalam sistem, disusun ikut workoutId
    public List<Workout> getAllWorkouts() {
        return workoutRepo.findAll(Sort.by("workoutId").ascending());
    }
}
