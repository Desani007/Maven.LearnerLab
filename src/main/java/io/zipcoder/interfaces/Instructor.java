package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Instructor extends Person implements Teacher {

    Instructor(String name, long id) {
        super(name, id);
    }

    Instructor(long id) {
        super(id);
    }


    public void teach(Leaner leaner, double numberOfHours) {
        leaner.learn(numberOfHours);


    }

    public void lecture(Leaner[] leaners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / leaners.length;
             for (Leaner l: leaners) {
            l.learn(numberOfHoursPerLearner);

        }


    }

}
