package com.bridgelabz.collections.generics.mealplangnrtr;

public class MealPlanGenerator {
    public static void main(String[] args) {
        // Create meal plans
        Meal<VegetarianMeal> vegetarianMeal = new Meal<>("Vegetarian Plan");
        Meal<VeganMeal> veganMeal = new Meal<>("Vegan Plan");
        Meal<KetoMeal> ketoMeal = new Meal<>("Keto Plan");
        Meal<HighProteinMeal> highProteinMeal = new Meal<>("High-Protein Plan");

        // Add meal options to each meal plan
        vegetarianMeal.addMealOption(new VegetarianMeal());
        veganMeal.addMealOption(new VeganMeal());
        ketoMeal.addMealOption(new KetoMeal());
        highProteinMeal.addMealOption(new HighProteinMeal());

        // Generate personalized meal plans
        vegetarianMeal.generateMealPlan();
        veganMeal.generateMealPlan();
        ketoMeal.generateMealPlan();
        highProteinMeal.generateMealPlan();
    }
}
