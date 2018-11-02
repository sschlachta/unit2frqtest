package com.company;
import java.util.*;


public class Student {

    //instance fields go here
    public Student [] students;
    private double gpa;

    //constructor goes here
    public Student(double gradePointAverage) {

        gpa = gradePointAverage;

    }



    // returns the student's grade point average
    public double getGPA()
    {

        return gpa;

    }

    // returns true if the student is in the honors program
    public boolean isHonors()
    {

        for (double j : students) {

        if (students[j].getGPA() >= 3.0) {

            return true;

        } else {

            return false;

        }
            j +=;

    }

    }





}
