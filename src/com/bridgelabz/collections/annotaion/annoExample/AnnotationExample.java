package com.bridgelabz.collections.annotaion.annoExample;
@CustomTypeAnnotation(
        priority = CustomTypeAnnotation.Priority.HIGH,
        tags ={"java","annotation"},
        createdBy = "Mark"
)
public class AnnotationExample {
    @CustomMethodAnnotation
    String shouldAlwaysBeProcessed(){
        return "this should always be processed";
    }
    @CustomMethodAnnotation
    void throwAnException(){
        throw new RuntimeException("this will throw an exception");
    }
    @CustomMethodAnnotation(enabled = false)
    void shouldNotBeProcessed(){
        throw new RuntimeException("this should never be processed");
    }

}
