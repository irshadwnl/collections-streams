package com.bridgelabz.collections.generics.resumescreening;

import java.util.ArrayList;
import java.util.List;

class Resume<T extends JobRole> {
    private String candidateName;
    private T jobRole;

    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public T getJobRole() {
        return jobRole;
    }

    // Method to display resume information
    public void displayResume() {
        System.out.println("Candidate Name: " + candidateName);
        System.out.println("Job Role: " + jobRole.getTitle());
    }
}
