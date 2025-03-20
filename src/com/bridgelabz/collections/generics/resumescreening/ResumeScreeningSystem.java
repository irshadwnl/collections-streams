package com.bridgelabz.collections.generics.resumescreening;

import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        // Create job roles
        ArrayList<JobRole> jobRoles = new ArrayList<>();
        jobRoles.add(new SoftwareEngineer());
        jobRoles.add(new DataScientist());
        jobRoles.add(new ProductManager());

        // Create resumes
        ArrayList<Resume<? extends JobRole>> resumes = new ArrayList<>();
        resumes.add(new Resume<>("Alice", new SoftwareEngineer()));
        resumes.add(new Resume<>("Bob", new DataScientist()));
        resumes.add(new Resume<>("Charlie", new ProductManager()));
        resumes.add(new Resume<>("David", new SoftwareEngineer())); // David is suitable
        resumes.add(new Resume<>("Eva", new ProductManager())); // Eva is suitable

        // Create a screening instance
        ResumeScreening screening = new ResumeScreening();

        // Screen resumes
        screening.screenResumes(jobRoles, resumes);
    }
}

