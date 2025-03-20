package com.bridgelabz.collections.generics.unicoursemngmnt;

public class UniversityCourseManagement {
    public static void main(String[] args) {
        // Create courses
        Course<ExamCourse> mathCourse = new Course<>("Mathematics 101");
        Course<AssignmentCourse> csCourse = new Course<>("Computer Science 101");
        Course<ResearchCourse> bioCourse = new Course<>("Biology 101");

        // Add evaluations to the courses
        mathCourse.addEvaluation(new ExamCourse("Midterm Exam"));
        mathCourse.addEvaluation(new ExamCourse("Final Exam"));

        csCourse.addEvaluation(new AssignmentCourse("Programming Assignment 1"));
        csCourse.addEvaluation(new AssignmentCourse("Group Project"));

        bioCourse.addEvaluation(new ResearchCourse("Research Paper"));

        // Display evaluations using wildcard method
        mathCourse.displayEvaluations(mathCourse.getEvaluations());
        csCourse.displayEvaluations(csCourse.getEvaluations());
        bioCourse.displayEvaluations(bioCourse.getEvaluations());
    }
}
