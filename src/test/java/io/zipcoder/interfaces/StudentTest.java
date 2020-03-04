package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testImplementation() {
        Student student = new Student("kasper",1);
        Assert.assertTrue(student instanceof Leaner);
    }

    @Test
    public void testInheritance (){
        Student student = new Student("kasper",1);
      Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn (){
        double expected =14;
        Student student = new Student("kasper",1);
        student.learn(10);
        student.learn(4);
        double actual =student.getTotalStudyTime();

        Assert.assertEquals(expected,actual,0);


    }
}
