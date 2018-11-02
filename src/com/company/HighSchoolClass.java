package com.company;

public class
HighSchoolClass
{
    private Student [] students;
    public double gpa;
    public Student valedictorian;


    //constructors and other data fields not shown
    //Show them!

    public HighSchoolClass(Student a[]) {

        students = a;

    }



    //returns the valedictorian of the class
    public Student getValedictorian ()
    {

        for(Student i : students) {

        if (i.getGPA() > gpa) {

            gpa = i.getGPA();
            valedictorian = i;

        }
    }
        return valedictorian;
    }

    public double getHonorsPercentage ()
    {
        int honorsStudents = 0;
        double percent;

        for (Student a : students){

        if(a.isHonors()) {

            honorsStudents += 1;

        }
    }
        percent = (honorsStudents / students.length) * 100;
        return percent;
    }

}

