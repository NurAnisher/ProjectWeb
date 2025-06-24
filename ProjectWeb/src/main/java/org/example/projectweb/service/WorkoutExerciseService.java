package org.example.projectweb.service;

import org.example.projectweb.model.WorkoutExercise;
import org.example.projectweb.repository.WorkoutExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutExerciseService {
    @Autowired
    private WorkoutExerciseRepository workoutExerciseRepository;

    public WorkoutExercise saveWorkoutExercise(WorkoutExercise ex) {
        return workoutExerciseRepository.save(ex);
    }

    public List<WorkoutExercise> getByWorkoutId(Integer workoutId) {
        return workoutExerciseRepository.findByWorkoutId(workoutId);
    }
}