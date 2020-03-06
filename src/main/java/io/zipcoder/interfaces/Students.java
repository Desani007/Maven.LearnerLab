package io.zipcoder.interfaces;

public final class Students extends People<Student> {
    final static Students students = new Students();

    private Students(){

  }
  public static Students getInstance(){
      return students;
  }


}
