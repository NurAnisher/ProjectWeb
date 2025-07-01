package org.example.projectweb.repository;

import org.example.projectweb.model.Workout;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {

    // Dapatkan semua workout berdasarkan userId
    List<Workout> findByUserId(int userId);

    // Cari workout berdasarkan userId dan workoutId (biasanya untuk update/delete)
    Optional<Workout> findByUserIdAndWorkoutId(int userId, Long workoutId);

    // Cari berdasarkan workoutId dan exerciseId (jika diperlukan)
    Optional<Workout> findByWorkoutIdAndExerciseId(Long workoutId, int exerciseId);


    // Delete berdasarkan kombinasi userId + workoutId
    void deleteByUserIdAndWorkoutId(int userId, Long workoutId);

    // Tambahan: Ambil semua dan sort by workoutId (untuk elak error LIMIT)
    List<Workout> findAll(Sort sort);

    List<Workout> findTop100ByUserId(int userId);
}
