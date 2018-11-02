package com.company;
import java.util.*;
import java.util.Arrays;

public class
HighSchoolClass
{
    private Student [] students;
    public double gpa;
    public String valedictorian;


    //constructors and other data fields not shown
    //Show them!

    public HighSchoolClass(double a[]) {

        students = a[];

    }



    //returns the valedictorian of the class
    public Student getValedictorian ()
    {

        for(int i : students) {

        if (students[i].getGPA() > gpa) {

            gpa = students[i].getGPA();
            valedictorian = students[i];

        }
        i =+;
    }
        return valedictorian;
    }

    public double getHonorsPercentage ()
    {
        int honorsStudents = 0;
        double percent;

        for (int a : students){

        if(students[a].isHonors()) {

            honorsStudents += 1;

        }
            a +=;
    }
        percent = (honorsStudents / students.length) * 100;
        return percent;
    }

}

