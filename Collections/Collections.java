package Collections;
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;

/**
 * @author: Amiana, Dave Arthur D.
 * @version: 03-08-2021
 */
public class Collections {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        int choice;
        // switch menu
        System.out.println("select ways to enter group of integers: ");
        System.out.println("[1]. Linked list ");
        System.out.println("[2]. Set ");
        System.out.println("[3]. Map ");
        System.out.println("enter selection digit here: ");
        choice = sc.nextInt();

        switch(choice){
            case 1: 
                System.out.print("Enter size of linked list: ");
                int list_size = sc.nextInt();
                List list = new LinkedList<String>();
        
                Integer temp_size = list_size;
                String list_val;

                System.out.println("enter series of strings with size "+ list_size+ ".");
                while(temp_size > 0){
                    list_val = sc.next();
                    list.add(list_val);
                    --temp_size;
                }

                System.out.println(list);
                break;
            case 2: 
                System.out.print("Enter input size of set: ");
                int set_size = sc.nextInt();
                Set set = new HashSet<String>();
        
                Integer set_temp_size = set_size;
                String set_val;

                System.out.print("enter series of strings with size "+ set_size+ ".");
                while(set_temp_size > 0){
                    set_val = sc.next();
                    set.add(set_val);
                    --set_temp_size;
                }

                System.out.println(set);
                break;

            case 3: 
                System.out.print("Enter input size of map: ");
                int map_size = sc.nextInt();
                Map map = new TreeMap<String, String>();
        
                Integer map_temp_size = map_size;
                String map_val;

                System.out.print("enter series of integers with size "+ map_size+ ".");
                while(map_temp_size > 0){
                    map_val = sc.next();
                    map.put(map_val,map_val);
                    --map_temp_size;
                }

                System.out.println(map);
                break;
            default: System.out.println("entered digit is not within bound");
        }
    }
}
