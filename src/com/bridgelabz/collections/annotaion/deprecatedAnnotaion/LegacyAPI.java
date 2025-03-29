package com.bridgelabz.collections.annotaion.deprecatedAnnotaion;

public class LegacyAPI {
    @Deprecated
    public void oldFeature(){
        System.out.println("old feature ");
    }

    public void newFeature(){
        System.out.println("new feature");
    }
}
