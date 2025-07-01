package org.example.projectweb.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "progress_tracking")
public class ProgressTracking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "progress_id")
    @JsonProperty("progress_id")
    private Long progressId;

    @Column(name = "user_id")
    @JsonProperty("user_id")
    private Long userId;

    @Column(name = "progress_date")
    @JsonProperty("progress_date")
    private LocalDate progressDate;

    @Column(name = "weight_kg")
    @JsonProperty("weight_kg")
    private BigDecimal weightKg;

    @Column(name = "body_fat_percentage")
    @JsonProperty("body_fat_percentage")
    private BigDecimal bodyFatPercentage;

    @Column(name = "waist_cm")
    @JsonProperty("waist_cm")
    private BigDecimal waistCm;

    @Column(name = "hips_cm")
    @JsonProperty("hips_cm")
    private BigDecimal hipsCm;

    @Column(name = "chest_cm")
    @JsonProperty("chest_cm")
    private BigDecimal chestCm;

    @Column(name = "notes")
    @JsonProperty("notes")
    private String notes;


    // Getters and Setters

    public Long getProgressId() {
        return progressId;
    }

    public void setProgressId(Long progressId) {
        this.progressId = progressId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDate getProgressDate() {
        return progressDate;
    }

    public void setProgressDate(LocalDate progressDate) {
        this.progressDate = progressDate;
    }

    public BigDecimal getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(BigDecimal weightKg) {
        this.weightKg = weightKg;
    }

    public BigDecimal getBodyFatPercentage() {
        return bodyFatPercentage;
    }

    public void setBodyFatPercentage(BigDecimal bodyFatPercentage) {
        this.bodyFatPercentage = bodyFatPercentage;
    }

    public BigDecimal getWaistCm() {
        return waistCm;
    }

    public void setWaistCm(BigDecimal waistCm) {
        this.waistCm = waistCm;
    }

    public BigDecimal getHipsCm() {
        return hipsCm;
    }

    public void setHipsCm(BigDecimal hipsCm) {
        this.hipsCm = hipsCm;
    }

    public BigDecimal getChestCm() {
        return chestCm;
    }

    public void setChestCm(BigDecimal chestCm) {
        this.chestCm = chestCm;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    // For debugging
    @Override
    public String toString() {
        return "ProgressTracking{" +
                "progressId=" + progressId +
                ", userId=" + userId +
                ", progressDate=" + progressDate +
                ", weightKg=" + weightKg +
                ", bodyFatPercentage=" + bodyFatPercentage +
                ", waistCm=" + waistCm +
                ", hipsCm=" + hipsCm +
                ", chestCm=" + chestCm +
                ", notes='" + notes + '\'' +
                '}';
    }
}
