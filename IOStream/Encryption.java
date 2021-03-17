package IOStream;
import java.io.FileInputStream;
import java.io.IOException;
/**
 * @author: Amiana, Dave Arthur D.
 * @version: 03-08-2021
 * simple Shift cipher, encyption and decryption 
 */

public class Encryption {
    public static void main(String args[]){
        try {
            FileInputStream f = new FileInputStream("C:\\Users\\amianadave\\Documents\\JavaProjects\\IOStream\\hello.txt");
            Encryption e = new Encryption();
            System.out.println("The cipher: ");
            e.encrypt(f, 1);
            System.out.println("\nDecripted cipher: ");
            e.decrypt("Ifmmp", 1);
        } catch (Exception e) {
            System.out.print(e);
        }
    }

    public void encrypt(FileInputStream f, int _size){
            try{
            int i = 0;
            int j = 0;
            while((i = f.read())!= -1){
                j = (i+_size)%122;
                System.out.print((char)j);
            }
            }catch(IOException e){
                System.out.print(e);
            }
    }
    public void decrypt(String _message, int _size){
        char[] ascii = _message.toCharArray();
        int x = 0;
        for(char ch: ascii){
                x = ((int)ch - _size)%122;
                System.out.print((char)x);
        }
    }
}
