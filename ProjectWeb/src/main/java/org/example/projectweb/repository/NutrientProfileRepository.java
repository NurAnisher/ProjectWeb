package org.example.projectweb.repository;

import org.example.projectweb.model.NutrientProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NutrientProfileRepository extends JpaRepository<NutrientProfile, Long> {
    List<NutrientProfile> findByUserId(Integer user_id);
}
