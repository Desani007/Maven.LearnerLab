package io.zipcoder.interfaces;

import com.sun.xml.internal.ws.policy.AssertionSet;
import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {
    @Test
    public void instructorsTest (){
        Educator e =  Educator.CHRIS;
        Assert.assertTrue(e instanceof Teacher);
}
@Test
    public void testTeach(){
    Student student = new Student( "Kasper",1);

    Educator e= Educator.CHRIS;
        e.teach(student,200);
    Assert.assertEquals(200,student.getTotalStudyTime(),0);

}

@Test
public void testLecture (){
    Student student = new Student( "Kasper",1);
    Student student2= new Student("Kasper",2);
    Educator e= Educator.CHRIS;
    double numberOfHours=10;
    double expected =5;
    Student [] students = {student,student2};
    e.lecture(students,numberOfHours);
    double actual=student.getTotalStudyTime();
    Assert.assertEquals(expected,actual,0);





}
}
