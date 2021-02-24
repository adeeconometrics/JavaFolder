package Collections;

import java.util.Set;
import java.util.HashSet;

import java.util.Iterator;

public class SetImplementation {
     public static void main(String args[]){
        Set days = new HashSet();
        String strDays[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday", "Sunday"};

        for(String day: strDays){
            days.add(day);
        }
        days.add("Monday");
        System.out.println(days);
        System.out.println("size: "+ days.size());
        System.out.println("empty: "+ days.isEmpty());
        System.out.println("contains 'monday'? "+ days.contains("monday"));

        // add value on the list
        Iterator i = days.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }
    }   
}
