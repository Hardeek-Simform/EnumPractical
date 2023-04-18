package com.enums;

enum Department {
    computerEngineering(50), civilEngineering(30), mechanicalEngineering(20);
    private int noOfStudents;

    private Department(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }
}

public class Main {
    public static void main(String[] args) {
        Department[] department = Department.values();
        for (Department dept : department){
            System.out.println("----------------------------------------------------------------------");
            System.out.println( "Sr no.: "+dept.ordinal()+ "\tDepartment: " +dept +"\t\tNo of Students: "+dept.getNoOfStudents());
        }
        System.out.println("----------------------------------------------------------------------");
    }
}