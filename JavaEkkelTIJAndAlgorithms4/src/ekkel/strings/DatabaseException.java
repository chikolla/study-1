package ekkel.strings;

/**
 * Created by halfmediator on 28.01.2017.
 */
public class DatabaseException extends Exception{
    public DatabaseException(int transactionID, int queyryID, String message){
        super(String.format("(t%d, q%d) %s",transactionID,queyryID, message));
    }
    public static void main(String[] args){
        try{
            throw new DatabaseException(3,7, "Write failed");
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
