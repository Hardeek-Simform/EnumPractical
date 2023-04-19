package com.practical.enums;

public enum Department {
    computerEngineering(50), civilEngineering(30), mechanicalEngineering(20);
    private int noOfStudents;

    private Department(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }
}
