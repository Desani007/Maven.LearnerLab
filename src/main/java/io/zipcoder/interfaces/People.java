package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People  implements Iterable<Person>{
    List<Person> personList = new ArrayList<Person>();


    public void add(Person p) {
        personList.add(p);

    }

    public Person findById(long id) {
        for (Person p : personList) {
            if (id == p.getId()) {
                return p;
            }
        }
        return null;
    }


    public boolean contains(Person p){
        return personList.contains(p);

    }

    public void remove (Person p){
        personList.remove(p);
    }

    public void  remove (long id){
        remove(findById(id));
    }

    public void removeAll (){
        personList.clear();
    }
    public int count (){
        return personList.size();
    }

    public Person[] toArray (){

        return personList.toArray(new Person[ personList.size()]);
    }


    public Iterator<Person> iterator() {
       return  personList.iterator();

    }
}