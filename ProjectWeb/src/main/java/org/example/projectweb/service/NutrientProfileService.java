package org.example.projectweb.service;

import org.example.projectweb.model.NutrientProfile;
import org.example.projectweb.repository.NutrientProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NutrientProfileService {
    @Autowired
    private NutrientProfileRepository profileRepository;

    public NutrientProfile saveProfile(NutrientProfile profile) {
        return profileRepository.save(profile);
    }

    public List<NutrientProfile> getProfilesByUserId(Integer userId) {
        return profileRepository.findByUserId(userId);
    }
}
