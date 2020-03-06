package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People <E>  implements Iterable<E>{
    List<E> personList = new ArrayList<E>();


    public void add(E p) {
        personList.add(p);

    }

    public E findById(long id) {
        for (E p: personList) {
            Person person = (Person)p;
            if (id == person.getId() ) {

                return (E) person;
            }
        }

        return null;
    }


    public boolean contains(E p){
        return personList.contains(p);

    }

    public void remove (E p){
        personList.remove(p);
    }

    public void  remove (long id){
        remove( findById(id));
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


    public Iterator<E> iterator() {
       return  personList.iterator();

    }
}