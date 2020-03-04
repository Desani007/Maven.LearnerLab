package io.zipcoder.interfaces;

public class Student extends Person implements Leaner {
   double totalStudyTime;

    Student(String name, long id) {
        super(name, id);
    }

    public void learn(double numberOfHours) {
        totalStudyTime+=numberOfHours;

    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
