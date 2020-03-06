package io.zipcoder.interfaces;

public enum Educator implements Teacher {
 CHRIS("Chris",1),ROBERTO("Roberto",2);



    public final Instructor instructor;
    public double timeWorked;

     Educator(String name, long id){

    this.instructor=new Instructor(name,id);


 }




    public void teach(Leaner leaner, double numberOfHours) {
     instructor.teach(leaner,numberOfHours);
     timeWorked+=numberOfHours;

    }

    public void lecture(Leaner[] leaners, double numberOfHours) {
  instructor.lecture(leaners,numberOfHours);
        timeWorked+=numberOfHours;
    }

}
