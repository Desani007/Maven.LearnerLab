package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void StudentsSingleton () {
        Students s = Students.getInstance();
        Student s1 = new Student("kasper", 1);
        s.add(s1);
        Assert.assertEquals(s.personList.get(0).getName(), s1.getName());
        Assert.assertTrue(s.contains(s1));

    }
}
