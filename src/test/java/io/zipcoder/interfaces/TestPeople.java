package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd(){
        Instructors instructors=Instructors.getInstance();
        Instructor instructor = new Instructor(1);
        instructors.add(instructor);
        Assert.assertTrue(instructors.contains(instructor));
    }

    @Test
    public void testRemove(){
        Instructors instructors=Instructors.getInstance();
        Instructor instructor = new Instructor(1);

        instructors.add(instructor);
        instructors.remove(instructor);

        Assert.assertFalse(instructors.contains(instructor));


    }
    @Test
    public void testFindById(){
        Instructors instructors=Instructors.getInstance();
        Instructor instructor = new Instructor(2);
        instructors.add(instructor);
        instructors.findById(instructor.getId());
        Assert.assertEquals(instructor.getId(),instructors.findById(instructor.getId()).getId());


    }

}
