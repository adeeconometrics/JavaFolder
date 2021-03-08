
package IOStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author: Amiana, Dave Arthur D.
 * @version: 03-08-2021
 */
public class IO {
    public static void main(String[] args){
        try {
            FileReader fr = new FileReader("C:\\Users\\amianadave\\Documents\\JavaProjects\\IOStream\\Paragraph.txt");
            FileWriter fn = new FileWriter("C:\\Users\\amianadave\\Documents\\JavaProjects\\IOStream\\file.txt");
            int i = fr.read();
            int v = 95;
            while((i = fr.read())!=-1){
                if(i == 32){
                    System.out.print((char)v);
                    fn.write((char)v);
                    continue;
                }
                System.out.print((char)i);
                fn.write((char)i);
            }

            fn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
