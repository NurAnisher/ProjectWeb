package org.example.projectweb.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "meals_items")
public class MealItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long itemId;

    @ManyToOne
    @JoinColumn(name = "meal_id")
    private Meal meal;

    private String foodName;
    private int calories;
    private float proteinG;
    private float carbsG;
    private float fatsG;
    private String quantity;

    // Getters and setters

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public float getProteinG() {
        return proteinG;
    }

    public void setProteinG(float proteinG) {
        this.proteinG = proteinG;
    }

    public float getCarbsG() {
        return carbsG;
    }

    public void setCarbsG(float carbsG) {
        this.carbsG = carbsG;
    }

    public float getFatsG() {
        return fatsG;
    }

    public void setFatsG(float fatsG) {
        this.fatsG = fatsG;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
