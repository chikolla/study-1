package ekkel.strings;

import java.util.Scanner;

/**
 * Created by halfmediator on 28.01.2017.
 */
public class ScannerDelimiter {
    public static void main(String[] args){
        Scanner scanner = new Scanner("12, 42, 78, 99, 42");
        scanner.useDelimiter("\\s*, \\s*");
        while(scanner.hasNextInt())
            System.out.println(scanner.nextInt());

    }
}
