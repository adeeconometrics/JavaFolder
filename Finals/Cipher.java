package Finals;

import java.util.HashMap;

public class Cipher {
    private final int key = (int)Math.pow(2,16)-1;
    public static HashMap<String, String> map;

    protected String toHex(String str){
        String s ="";
        char ch[] = str.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            s+= Integer.toHexString(ch[i]).toUpperCase();
        }
        return s;
    }

    protected String hexToString(String str){
        String result = "";
        char charArray[] = str.toCharArray();
        for(int i = 0; i < charArray.length; i=i+2) {
            String st = ""+charArray[i]+""+charArray[i+1];
            char ch = (char)Integer.parseInt(st, 16);
            result += ch;
        }
        return result;
    }

    protected String encrypt(String str){
        String result = "";
        char charArray[] = str.toCharArray();
        
        for(int i = 0; i < charArray.length; i++) {
            int j = (key+(int)charArray[i]);
            result += (char)j; 
        }
        return toHex(result);
    }

    protected String decrypt(String str){
        str = hexToString(str);
        String result = "";
        char ascii[] = str.toCharArray();

        for(char ch: ascii) {
            int i = (((int)ch-key));
            result += (char)i;
        }
        return result;
    }

    public void keypair(String accountNo){
        String signiture = hashFunction(accountNo);
        map.put(accountNo, signiture);
    }

    protected String hashFunction(String str){
        char ch[] = str.toCharArray();
        int hashAddress = 0;
        for(int i = 0; i <ch.length; i++) {
            hashAddress = Math.abs(ch[i] +(hashAddress<<16) + (hashAddress << 32)) - hashAddress;
        }
        return String.valueOf(hashAddress);
    }
}
