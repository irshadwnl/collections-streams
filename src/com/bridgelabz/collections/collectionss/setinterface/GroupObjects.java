package com.bridgelabz.collections.collectionss.setinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Employee{
    String name;
    String dept;

    public Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }
}
public class GroupObjects {
    public static void main(String[] args) {
        List<Employee> list =new ArrayList<>();
        list.add(new Employee("Alice","HR"));
        list.add(new Employee("Bob","IT"));
        list.add(new Employee("Carol","HR"));

        HashMap<String ,List<Employee>> map=new HashMap<>();
        for(Employee emp:list){
            if(!map.containsKey(emp.dept)){
                map.put(emp.dept,new ArrayList<>());
            }
            map.get(emp.dept).add(emp);
        }
        for (String dept : map.keySet()) {
            System.out.print(dept + ": [");
            List<Employee> empList =map.get(dept);
            for (int i = 0; i < empList.size(); i++) {
                System.out.print(empList.get(i).name);
                if (i < empList.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
