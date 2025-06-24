package org.example.projectweb.controller;

import org.example.projectweb.model.ProgressTracking;
import org.example.projectweb.repository.ProgressTrackingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/progress")
public class ProgressTrackingController {
    @Autowired private ProgressTrackingRepository progressRepo;

    @PostMapping("/log")
    public ProgressTracking logProgress(@RequestBody ProgressTracking progress) {
        return progressRepo.save(progress);
    }

    @GetMapping("/user/{user_id}")
    public List<ProgressTracking> getProgress(@PathVariable Integer user_id) {
        return progressRepo.findByUserId(user_id);
    }
}
