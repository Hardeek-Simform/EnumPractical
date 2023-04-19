package com.practical;

import com.practical.enums.Department;

public class Main {
    public static void main(String[] args) {
        Department[] department = Department.values();
        for (Department dept : department) {
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Sr no.: " + dept.ordinal() + "\tDepartment: " + dept + "\t\tNo of Students: " + dept.getNoOfStudents());
        }
        System.out.println("----------------------------------------------------------------------");
    }
}