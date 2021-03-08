package IOStream;

import java.io.FileOutputStream;


public class Stream {
    public static void main(String[] args){
        try{
            FileOutputStream f = new FileOutputStream("C:\\Users\\amianadave\\Documents\\JavaProjects\\IOStream\\Sample.txt");
            f.write(65); // returns ASCII  of 1st character'
            f.close();
            System.out.println(65); // prints the character

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
