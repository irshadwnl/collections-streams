package com.bridgelabz.collections.generics.resumescreening;

abstract class JobRole {
    protected String title;

    public JobRole(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Job Role: " + title;
    }
}






