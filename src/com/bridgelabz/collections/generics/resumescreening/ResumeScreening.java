package com.bridgelabz.collections.generics.resumescreening;
import  java.util.*;
class ResumeScreening {
    // Wildcard method to process resumes for multiple job roles
    public void screenResumes(ArrayList<? extends JobRole> jobRoles, ArrayList<Resume<? extends JobRole>> resumes) {
        System.out.println("Screening Resumes:");
        for (Resume<? extends JobRole> resume : resumes) {
            if (jobRoles.contains(resume.getJobRole())) {
                resume.displayResume();
                System.out.println("Resume is suitable for the job role.\n");
            } else {
                System.out.println("Resume is NOT suitable for the job role: " + resume.getJobRole().getTitle() + "\n");
            }
        }
    }
}

