package com.bridgelabz.collections.annotaion.advancedlevel.rolebasedaccess;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RoleAllowed {
    String value();
}
