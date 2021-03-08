package IOStream;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Scanner;
/**
 * @author: Amiana, Dave Arthur D.
 * @version: 03-08-2021
 * program that writes an Integer object to a stream and reads this object from the stream
 */

public class ReadWrite {
    public static void main(String[] args){
        try {
            
            FileReader fr = new FileReader("C:\\Users\\amianadave\\Documents\\JavaProjects\\IOStream\\Sample.txt");
            FileOutputStream fw = new FileOutputStream("C:\\Users\\amianadave\\Documents\\JavaProjects\\IOStream\\Sample.txt");
            Scanner input = new Scanner(System.in);

            Integer obj;
            System.out.println("Enter Integer Object: ");
            obj = input.nextInt();

            // Integer to string
            String str = Integer.toString(obj);
            // string to arr of char
            char [] ascii = new char[str.length()];
            for(int i = 0; i<str.length(); i++){
                ascii[i] = str.charAt(i);
            }
            
            for(char ch: ascii)
                fw.write(ch);

            fr.read();
            System.out.print(obj);
            
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
