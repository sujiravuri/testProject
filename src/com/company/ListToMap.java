package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListToMap {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1,"Rajesh","Architect",1222222,"Edison"));
        employeeList.add(new Employee(2,"Test1","Architect",13333333,"Edison"));
        employeeList.add(new Employee(3,"Test1","Developer",13333333,"Edison"));
        System.out.println("test");

                Map<String, List<Employee>> empMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDesignation));

        empMap.entrySet().forEach( stringListEntry -> System.out.println("" +stringListEntry.getKey()+"  "+stringListEntry.getValue().size()));

    }

}
