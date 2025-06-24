package org.example.projectweb.service;

import org.example.projectweb.model.UserGoal;
import org.example.projectweb.repository.UserGoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserGoalService {
    @Autowired
    private UserGoalRepository goalRepository;

    public UserGoal saveGoal(UserGoal goal) {
        return goalRepository.save(goal);
    }

    public List<UserGoal> getGoalsByUserId(Integer userId) {
        return goalRepository.findByUserId(userId);
    }
}
