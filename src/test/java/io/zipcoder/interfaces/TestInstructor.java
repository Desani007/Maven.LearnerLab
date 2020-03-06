package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(1);
        Assert.assertTrue(instructor instanceof Teacher);
    }
    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(1);
        Assert.assertTrue(instructor instanceof Person);

    }
    @Test
    public void testTeach(){
        Student student = new Student( "Kasper",1);

        double expected =14;
        Instructor instructor = new Instructor(1);
        instructor.teach(student,10);
        instructor.teach(student,4);
       double actual= student.getTotalStudyTime();

        Assert.assertEquals(expected,actual,0);

    }

    @Test
    public void testLecture (){
        Student student= new Student("destiny",1);
        Student student2= new Student("Kasper",2);
        Instructor instructor = new Instructor(1);
        double numberOfHours=10;
        double expected =5;

        Student [] students = {student,student2};
        instructor.lecture(students,numberOfHours);
        double actual = student.getTotalStudyTime();


        Assert.assertEquals(expected,actual,0);
        actual=student2.getTotalStudyTime();
        Assert.assertEquals(expected,actual,0);


    }


}
