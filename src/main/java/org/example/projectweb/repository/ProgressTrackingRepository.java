package org.example.projectweb.repository;

import org.example.projectweb.model.ProgressTracking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProgressTrackingRepository extends JpaRepository<ProgressTracking, Long> {
    List<ProgressTracking> findByUserId(Long userId);

    Optional<ProgressTracking> findTopByUserIdOrderByProgressDateDesc(Long userId);

}
