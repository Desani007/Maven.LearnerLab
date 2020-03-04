package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd(){
        People people = new People();
        Person p= new Person(1);
        people.add(p);
        Assert.assertTrue(people.contains(p));
    }

    @Test
    public void testRemove(){
        People people = new People();
        Person p= new Person(1);

        people.add(p);
        people.remove(p);

        Assert.assertFalse(people.contains(p));


    }
    @Test
    public void testFindById(){
        People people = new People();
        Person p= new Person(1);
        people.add(p);
        people.findById(p.getId());
        Person p1= people.findById(p.getId());
        Assert.assertEquals(p,p1);

    }

}
