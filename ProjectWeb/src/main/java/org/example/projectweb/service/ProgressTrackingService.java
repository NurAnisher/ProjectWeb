package org.example.projectweb.service;

import org.example.projectweb.model.ProgressTracking;
import org.example.projectweb.repository.ProgressTrackingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgressTrackingService {
    @Autowired
    private ProgressTrackingRepository trackingRepository;

    public ProgressTracking saveProgress(ProgressTracking progress) {
        return trackingRepository.save(progress);
    }

    public List<ProgressTracking> getProgressByUserId(Integer userId) {
        return trackingRepository.findByUserId(userId);
    }
}
