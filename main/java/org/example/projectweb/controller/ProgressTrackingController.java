package org.example.projectweb.controller;


import org.example.projectweb.service.ProgressTrackingService;
import org.example.projectweb.model.ProgressTracking;
import org.example.projectweb.repository.ProgressTrackingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/progress")
public class ProgressTrackingController {

    @Autowired
    private ProgressTrackingService trackingService;

    @PostMapping("/log")
    public ProgressTracking logProgress(@RequestBody ProgressTracking progress) {
        System.out.println("Received progress: " + progress);
        return trackingService.saveProgress(progress);
    }

    @GetMapping("/user/{user_id}")
    public List<ProgressTracking> getProgress(@PathVariable("user_id") Long userId) {
        return trackingService.getProgressByUserId(userId);
    }


    @PutMapping("/update/by-user/{userId}")
    public ResponseEntity<String> updateProgressByUserId(
            @PathVariable Long userId,
            @RequestBody ProgressTracking updatedProgress) {

        String message = trackingService.updateLatestProgressByUserId(userId, updatedProgress);
        return ResponseEntity.ok(message);
    }

    @DeleteMapping("/delete/{progressId}")
    public ResponseEntity<String> deleteProgress(@PathVariable Long progressId) {
        boolean deleted = trackingService.deleteProgressById(progressId);
        if (deleted) {
            return ResponseEntity.ok("Progress deleted successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Progress not found");
        }
    }
}