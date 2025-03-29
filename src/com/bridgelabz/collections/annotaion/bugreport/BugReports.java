package com.bridgelabz.collections.annotaion.bugreport;

import com.bridgelabz.collections.annotaion.bugreport.BugReport;

import java.lang.annotation.*;

// Container annotation to hold multiple BugReports
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BugReports {
    BugReport[] value();
}
