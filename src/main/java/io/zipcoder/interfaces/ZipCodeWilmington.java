package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class ZipCodeWilmington {
   static ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();
    Students students= Students.getInstance();
    Instructors instructors = Instructors.getInstance();
 private ZipCodeWilmington(){

 }
    public static ZipCodeWilmington getInstance () {
        return zipCodeWilmington;
    }


public  void hostLecture (Teacher teacher, double numberOfHours){
    ArrayList<Object> leaners = new ArrayList<Object>();
    for ( Object p:students.personList) {
        Leaner l = (Leaner)p;
        leaners.add(l);



    }
    Leaner[] f = leaners.toArray(new Leaner[leaners.size()]);
        teacher.lecture(f,numberOfHours);

}
public void hostLecture(long id,double numberOfHours){
    Instructor s =  instructors.findById(id);
    ArrayList<Object> leaners = new ArrayList<Object>();
    for (Person  p:students.personList) {
        Leaner l = (Leaner)p;
        leaners.add(l);



    }
    Leaner[] f = leaners.toArray(new Leaner[leaners.size()]);
    s.lecture(f,numberOfHours);


    }

    public HashMap<Student,Double> getStudyMap (){
        HashMap<Student,Double> studyMap = new HashMap<Student, Double>();
        for (Person s:students.personList) {
            Student student = (Student) s;
            studyMap.put(student, student.getTotalStudyTime());

        }
        return studyMap;




    }

}
