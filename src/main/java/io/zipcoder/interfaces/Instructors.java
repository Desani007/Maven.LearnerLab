package io.zipcoder.interfaces;

public class Instructors extends People<Instructor> {
final static Instructors instructors = new Instructors();

public static Instructors getInstance(){
    return instructors;
}


}
