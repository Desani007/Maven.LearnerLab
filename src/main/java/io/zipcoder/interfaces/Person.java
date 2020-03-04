package io.zipcoder.interfaces;

public class Person {
    final long id;
    String name;

   Person (String name, long id ) {
       this.id=id;
       this.name=name;
   }
   Person (long id){
       this.id=id;
   }

   public  long getId(){
     return   this.id;
   }

   public String getName (){
      return this.name;
   }
   public void setName(String name){
       this.name=name;
   }



}
