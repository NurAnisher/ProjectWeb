package org.example.projectweb.service;

import org.example.projectweb.model.ProgressTracking;
import org.example.projectweb.repository.ProgressTrackingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProgressTrackingService {
    @Autowired
    private ProgressTrackingRepository trackingRepository;

    public ProgressTracking saveProgress(ProgressTracking progress) {
        return trackingRepository.save(progress);
    }

    public List<ProgressTracking> getProgressByUserId(Long userId) {
        return trackingRepository.findByUserId(userId);
    }

    public String updateLatestProgressByUserId(Long userId, ProgressTracking updatedData) {
        Optional<ProgressTracking> optional = trackingRepository.findTopByUserIdOrderByProgressDateDesc(userId);

        if (optional.isEmpty()) {
            return "No progress found for user ID: " + userId;
        }

        ProgressTracking existing = optional.get();

        if (updatedData.getProgressDate() != null) {
            existing.setProgressDate(updatedData.getProgressDate());
        }
        if (updatedData.getWeightKg() != null) {
            existing.setWeightKg(updatedData.getWeightKg());
        }
        if (updatedData.getBodyFatPercentage() != null) {
            existing.setBodyFatPercentage(updatedData.getBodyFatPercentage());
        }
        if (updatedData.getWaistCm() != null) {
            existing.setWaistCm(updatedData.getWaistCm());
        }
        if (updatedData.getHipsCm() != null) {
            existing.setHipsCm(updatedData.getHipsCm());
        }
        if (updatedData.getChestCm() != null) {
            existing.setChestCm(updatedData.getChestCm());
        }
        if (updatedData.getNotes() != null && !updatedData.getNotes().isEmpty()) {
            existing.setNotes(updatedData.getNotes());
        }

        trackingRepository.save(existing);
        return "Progress updated successfully.";
    }


    public boolean deleteProgressById(Long progressId) {
        if (trackingRepository.existsById(progressId)) {
            trackingRepository.deleteById(progressId);
            return true;
        } else {
            return false;
        }
    }

}
