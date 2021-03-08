package IOStream;
import java.io.FileInputStream;


public class Output {
    public static void main(String[] args){
        try {
            FileInputStream fn = new FileInputStream("D:\\Paragraph.txt");
            int i = 0;
            int vowel = 0;
            int consonant = 0;
            int words = 0;
            int _char = 0;

            while((i = fn.read())!=-1){
                System.out.print((char)i);
                if((char)i == 'a' || (char)i == 'e' || (char)i == 'i' || (char)i == 'o' || (char)i == 'u') ++vowel;
                if((char)i == 'A' || (char)i == 'E' || (char)i == 'I' || (char)i == 'O' || (char)i == 'U') ++vowel;
                if((char)i == ' '|| i == 10) ++words;
                if(i>=0 || i<=256) ++_char;
                //exhaustive list of consonants
                if((char)i == 'b' || (char)i == 'c' || (char)i == 'd' || (char)i == 'f' || (char)i == 'g'||
                (char)i == 'h' || (char)i == 'j' || (char)i == 'k' || (char)i == 'l' || (char)i == 'm'||
                (char)i == 'n' || (char)i == 'p' || (char)i == 'q' || (char)i == 'r' || (char)i == 's'||
                (char)i == 't' || (char)i == 'v' || (char)i == 'w' || (char)i == 'x' || (char)i == 'y' || (char)i == 'z') ++consonant;

                if((char)i == 'B' || (char)i == 'C' || (char)i == 'D' || (char)i == 'F' || (char)i == 'G'||
                (char)i == 'H' || (char)i == 'J' || (char)i == 'K' || (char)i == 'L' || (char)i == 'M'||
                (char)i == 'N' || (char)i == 'P' || (char)i == 'Q' || (char)i == 'R' || (char)i == 'S'||
                (char)i == 'T' || (char)i == 'V' || (char)i == 'W' || (char)i == 'X' || (char)i == 'Y' || (char)i == 'Z') ++consonant;
            }

            _char = vowel + consonant + words;
            System.out.println("\nnumber of vowels: "+vowel);
            System.out.println("number of consonants: "+consonant);
            System.out.println("number of words: "+words+1);
            System.out.println("number of characters: "+_char);
            fn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
