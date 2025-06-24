package org.example.projectweb.service;

import org.example.projectweb.model.Workout;
import org.example.projectweb.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutService {
    @Autowired
    private WorkoutRepository workoutRepository;

    public Workout saveWorkout(Workout workout) {
        return workoutRepository.save(workout);
    }

    public List<Workout> getWorkoutsByUserId(Integer userId) {
        return workoutRepository.findByUserId(userId);
    }
}
