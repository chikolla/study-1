package net.mindview.util;

import algs4.basic.StdOut;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by halfmediator on 28.01.2017.
 */
public class BinaryFile {
    public static byte[] read(File bFile) throws IOException{
        BufferedInputStream bf = new BufferedInputStream(new FileInputStream(bFile));
        try {
            byte[] data = new byte[bf.available()];
            StdOut.println("available : "+ data.length + " bytes.");
            bf.read(data);
            return data;
        } finally{
            bf.close();
        }
    }
    public static byte[] read(String bFile) throws IOException{
        return read(new File(bFile).getAbsolutePath());
    }
}
