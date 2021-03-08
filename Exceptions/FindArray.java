package Exceptions;
/**
 * @author: Amiana, Dave Arthur D.
 * @description: exception handling
 */
public class FindArray {
    public static void main(String args[]){
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        access(arr, 11);   
        access(null, 1);
    }
    /**
     * displays the element at index idx.
     */
    public static void access(int[] a, int idx){
        try{
            // if(!(idx instanceof Integer)) throw new RuntimeException();
            if(idx>a.length+1) throw new ArrayIndexOutOfBoundsException();
            if(a==null) throw new NullPointerException();
            System.out.println("array ["+idx+1+"]: "+ a[idx]);

        }catch(NullPointerException exception){
            System.out.println("null pointer exception occured.");
        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("runtime exception occured, index out of bound.");
        }catch(RuntimeException exception){
            System.out.println("runtime exception occured.");
        }
    }
}
