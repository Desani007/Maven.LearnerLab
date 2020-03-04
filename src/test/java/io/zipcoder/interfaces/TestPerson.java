package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {


    @Test
    public void constructorTest (){
        String expect = "kasper";
        long id = 1;

        Person person = new Person( expect,id);

        Assert.assertEquals(expect,person.getName());
        Assert.assertEquals(id, person.getId());

    }

    @Test
    public void testSetName (){

        String expected = "kasper";
        Person person = new Person(1);
        person.setName(expected);
        Assert.assertEquals(expected,person.getName());

    }

}
