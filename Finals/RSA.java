package Finals;

import java.util.*;
import java.math.BigInteger;

public class RSA{
    public static void main(String [] args){
        Random rand1 = new Random(System.currentTimeMillis());
        Random rand2 = new Random(System.currentTimeMillis());

        int pubkey = 3;

        BigInteger p = BigInteger.probablePrime(32, rand1);
        BigInteger q = BigInteger.probablePrime(32, rand2);

        //mutiply p and q
        BigInteger n =  p.multiply(q);

        BigInteger p_1 = p.subtract(new BigInteger("1"));
        BigInteger q_1 = q.subtract(new BigInteger("1"));

        BigInteger z = p_1.multiply(q_1);

        while(true){
            BigInteger GCD = z.gcd(new BigInteger(""+pubkey));
            if(GCD.equals(BigInteger.ONE)) break;
            pubkey++;
        }

        BigInteger big_pubkey = new BigInteger(""+pubkey);
        BigInteger prvkey = big_pubkey.modInverse(z);
        System.out.println("public key "+ pubkey+ "," + n);
        System.out.println("private key "+ prvkey + ","+ n);

        //RSA Encryption and decryption
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the message to be encrypted: ");
        String msg = sc.nextLine();
        sc.close();

        byte[] bytes = msg.getBytes();

        for(int i = 0; i<msg.length(); i++){
            int ascii = bytes[i];
            BigInteger val = new BigInteger(String.valueOf(ascii));
            BigInteger cipherVal = val.modPow(big_pubkey, n);
            System.out.println("cipher text: " + cipherVal);

            BigInteger plainVal = cipherVal.modPow(prvkey,n);
            int i_plainVal = plainVal.intValue();
            System.out.println("plain text: "+ (char)i_plainVal);
        }
    }
}