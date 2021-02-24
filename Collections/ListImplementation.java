package Collections;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;

public class ListImplementation {
    public static void main(String args[]){
        List days = new ArrayList();
        List months = new LinkedList();
        
        String strDays[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday", "Sunday"};

        for(String day: strDays){
            days.add(day);
        }

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
