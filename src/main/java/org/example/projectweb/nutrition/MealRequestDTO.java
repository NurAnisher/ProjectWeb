package org.example.projectweb.nutrition;

import java.time.LocalDate;

public class MealRequestDTO {
    public Long userId;
    public LocalDate mealDate;
    public String mealType;
    public String foodName;
    public String quantity;
    public int calories;
    public float protein;
    public float carbs;
    public float fats;

}
