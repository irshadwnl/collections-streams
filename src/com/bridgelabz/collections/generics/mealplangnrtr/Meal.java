package com.bridgelabz.collections.generics.mealplangnrtr;

import java.util.ArrayList;
import java.util.List;

class Meal<T extends MealPlan> {
    private String name;
    private List<T> mealOptions;

    public Meal(String name) {
        this.name = name;
        this.mealOptions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addMealOption(T mealOption) {
        mealOptions.add(mealOption);
    }

    public List<T> getMealOptions() {
        return mealOptions;
    }

    // Generic method to validate and generate a personalized meal plan
    public void generateMealPlan() {
        if (mealOptions.isEmpty()) {
            System.out.println("No meal options available for " + name + ".");
            return;
        }

        System.out.println("Personalized Meal Plan for " + name + ":");
        for (T option : mealOptions) {
            System.out.println(option.getDescription());
        }
    }
}
