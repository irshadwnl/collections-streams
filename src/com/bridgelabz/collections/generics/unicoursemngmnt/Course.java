package com.bridgelabz.collections.generics.unicoursemngmnt;

import java.util.ArrayList;
import java.util.List;

class Course<T extends CourseType> {
    private String title;
    private List<T> evaluations;

    public Course(String title) {
        this.title = title;
        this.evaluations = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void addEvaluation(T evaluation) {
        evaluations.add(evaluation);
    }

    public List<T> getEvaluations() {
        return evaluations;
    }

    // Method to display evaluations using wildcards
    public void displayEvaluations(List<? extends CourseType> evaluationsList) {
        System.out.println("Evaluations for course: " + title);
        for (CourseType eval : evaluationsList) {
            System.out.println(eval);
        }
    }
}

