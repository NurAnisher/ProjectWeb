package org.example.projectweb.controller;

import org.example.projectweb.model.UserGoal;
import org.example.projectweb.repository.UserGoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/goals")
public class UserGoalController {
    @Autowired private UserGoalRepository goalRepo;

    @PostMapping("/add")
    public UserGoal addGoal(@RequestBody UserGoal goal) {
        return goalRepo.save(goal);
    }

    @GetMapping("/user/{user_id}")
    public List<UserGoal> getGoals(@PathVariable Integer user_id) {
        return goalRepo.findByUserId(user_id);
    }
}

