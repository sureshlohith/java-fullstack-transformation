package com.suresh.learning.records;

public class RecordDemo {

    public static void main(String[] args) {

        Employee employee =
                new Employee(1L,
                        "Suresh",
                        100000);

        System.out.println(employee);
        System.out.println(employee.name());
    }
}