package Collections;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapImplementation {
    public static void main(String args[]){
        Map days = new TreeMap(); // maps do not allow duplicate keys
        String strDays[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday", "Sunday"};

        for(String day: strDays){
            days.put(day,day);
        }
        System.out.println(days);
        System.out.println("size: "+ days.size());
        System.out.println("empty: "+ days.isEmpty());
        System.out.println("contains 'monday'? "+ days.containsKey("monday"));

        // put value on the list
    }
}
