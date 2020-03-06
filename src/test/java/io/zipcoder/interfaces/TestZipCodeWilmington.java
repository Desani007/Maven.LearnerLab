package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestZipCodeWilmington {

    @Test
    public void TestZipCodeHostLecture(){
        ZipCodeWilmington zipCodeWilmington =ZipCodeWilmington.getInstance() ;
        Instructor des = new Instructor("Des",1);
        Instructors instructor = Instructors.getInstance();
        instructor.personList.add(des);

        Student s = new Student("kasper",1);
        zipCodeWilmington.students.personList.clear();

        zipCodeWilmington.students.personList.add(s);

        zipCodeWilmington.hostLecture(1,200);
        zipCodeWilmington.getStudyMap();
        Assert.assertTrue(zipCodeWilmington.getStudyMap().containsKey(s));

        for (Map.Entry l : zipCodeWilmington.getStudyMap().entrySet()) {

            Assert.assertEquals(s.getTotalStudyTime(),l.getValue());


        }
    }
    @Test
    public void TestZipCodeHostLecture2() {
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        Instructor des = new Instructor("Des", 1);
        Instructors instructor = Instructors.getInstance();
        instructor.personList.add(des);

        Student s = new Student("kasper", 1);

        zipCodeWilmington.students.personList.add(s);

        zipCodeWilmington.hostLecture(des, 200);
        zipCodeWilmington.getStudyMap();
        Assert.assertTrue(zipCodeWilmington.getStudyMap().containsKey(s));

        for (Map.Entry l : zipCodeWilmington.getStudyMap().entrySet()) {

            Assert.assertEquals(s.getTotalStudyTime(), l.getValue());


        }

    }
    @Test
    public void TestEducator(){
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        Educator e = Educator.CHRIS;
        Instructors instructors= Instructors.getInstance();
        instructors.personList.add(e.instructor);
        Student s = new Student("kasper", 1);
        zipCodeWilmington.students.personList.add(s);

        zipCodeWilmington.hostLecture(e.instructor, 200);
        zipCodeWilmington.getStudyMap();
        Assert.assertTrue(zipCodeWilmington.getStudyMap().containsKey(s));

        for (Map.Entry l : zipCodeWilmington.getStudyMap().entrySet()) {

            Assert.assertEquals(s.getTotalStudyTime(), l.getValue());


        }



    }
}
