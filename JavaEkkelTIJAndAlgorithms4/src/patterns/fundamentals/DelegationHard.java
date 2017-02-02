package patterns.fundamentals;

import algs4.basic.StdOut;

import java.util.Scanner;

/**
 * Created by nugusbayevkk on 2/2/17.
 */
interface TimerAction{
    void onTime();
}
class WakeUpAction implements TimerAction{
    @Override
    public void onTime(){
        StdOut.println("It's high time. WAKE UP");
    }
}
class ChickenIsReadyAction implements TimerAction{
    @Override
    public void onTime(){
        StdOut.println("Chicken are made");
    }
}
/*
* Class Timer, in some cases call action TimerAction
*/
class Timer{
    TimerAction action;
    /*
    * Function, that call programmer for set time
    * */
    void run(){
        if (isTime()){
            action.onTime();
        }
    }
    /*
    * Some function, which take on himseslf all work with time,
    * His implementation is not interest in this context
     */
    private boolean isTime(){
        return true;
    }

}
public class DelegationHard {
    public static void main(String[] args){
        StdOut.println("Enter action type:");
        Scanner scanner = new Scanner(System.in);
        String actionType = scanner.nextLine();
        Timer timer = new Timer();
        if (actionType.equals("set wake up timer")){
            timer.action = new WakeUpAction();
        } else if (actionType.equals("set chicken timer")){
            timer.action = new ChickenIsReadyAction();
        }
        timer.run();
    }
}
