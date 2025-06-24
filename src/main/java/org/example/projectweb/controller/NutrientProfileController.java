package org.example.projectweb.controller;

import org.example.projectweb.model.NutrientProfile;
import org.example.projectweb.repository.NutrientProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nutrients")
public class NutrientProfileController {
    @Autowired private NutrientProfileRepository profileRepo;

    @PostMapping("/add")
    public NutrientProfile addProfile(@RequestBody NutrientProfile profile) {
        return profileRepo.save(profile);
    }

    @GetMapping("/user/{user_id}")
    public List<NutrientProfile> getProfiles(@PathVariable Integer user_id) {
        return profileRepo.findByUserId(user_id);
    }
}
