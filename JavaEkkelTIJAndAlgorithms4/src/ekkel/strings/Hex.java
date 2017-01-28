package ekkel.strings;

import net.mindview.util.BinaryFile;

import java.io.File;

/**
 * Created by halfmediator on 28.01.2017.
 */
public class Hex {
    public static String format(byte[] data){
        StringBuilder result = new StringBuilder();
        int n = 0;
        for (byte b: data) {
            if (n % 16 == 0)
                result.append(String.format("%05x: ", n));
            result.append(String.format("%02X", b));
            n++;
        }
        if (n % 16 == 0) result.append("\n");
        result.append("\n");
        return result.toString();
    }
    public static void main(String[] args) throws Exception {
        if(args.length == 0) {
            // Test by displaying this class file:
        System.out.println("try to read");
            System.out.println(
                    format(BinaryFile.read("D:/repository/study/JavaEkkelTIJAndAlgorithms4/out/ekkel/strings/Hex.class")));}
        else
            System.out.println(
                    format(BinaryFile.read(new File(args[0]))));
    }

}
