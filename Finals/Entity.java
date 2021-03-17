package Finals;
import java.util.HashMap;

public abstract class Entity extends Cipher{

    public static HashMap<String,String> entityMap;

    private String name;
    private String accountNo;
    private String password;
    private int age;

    //implement error handling for age
    Entity(String name, int age){
        this.name = name;
        this.age = age;
    }

    protected void setAccountNo(){
        String temp = this.name+this.age;
        this.accountNo = hashFunction(temp);
    }

    protected void setPassword(String password){
        //call encrypt password
        this.password = password;
    }

    protected String getPassword(){
        //decrypt password from user map ~ also used for validating password
    }
    protected String getAge(){
        return String.valueOf(this.age);
    }

    protected String getName(){
        return this.name;
    }

    protected String getAccountNo(){
        // call set password
        return this.accountNo;
    }

    private void bindToMap(String accountNo, String encryptedPassword){
        entityMap.put(accountNo, encryptedPassword);
    }
}
