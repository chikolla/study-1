package tutorialspoint.basics.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by nugusbayevkk on 2/5/17.
 */
public class SerializeDemo {
    public static void main(String[] args){
        Employee e = new Employee();
        e.name= "Reyan Ali";
        e.address = "Phokka kuna";
        e.SSN = 111222333;
        e.number = 101;

        try{
            FileOutputStream fileOut =
                    new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
        }catch(IOException i){
            i.printStackTrace();
        }
    }
}
