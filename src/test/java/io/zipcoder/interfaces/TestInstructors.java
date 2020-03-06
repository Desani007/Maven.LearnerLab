package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void instructorsTest () {
        Instructor instructorFroilan= new Instructor("Froilan",1);
        Instructor instructorKristofer= new Instructor("Kristofer",2);
        Instructor instructorDolio= new Instructor("Dolio",2);
        Instructor instructorChris= new Instructor("Chris",2);
        Instructor instructorRoberto= new Instructor("Roberto",2);

        Instructors ins= Instructors.getInstance();
        ins.add(instructorFroilan);
        ins.add(instructorKristofer);
        ins.add(instructorChris);
        ins.add(instructorRoberto);
         ins.add(instructorDolio);


        Assert.assertEquals(ins.personList.get(1).getName(),instructorKristofer.getName());

    }
}
