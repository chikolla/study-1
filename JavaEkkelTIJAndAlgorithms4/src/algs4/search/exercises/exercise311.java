package algs4.search.exercises;

import algs4.search.SequentialSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nugusbayevkk on 2/10/17.
 */
public class exercise311 {
    public static void main(String[] args){
        SequentialSearch<String, Double> client = new SequentialSearch<String, Double>();
        String[] grades = new String[]{"A+","A","A-","B+","B","B-","C+","C","C-","D","F"};
        Double[] computes = new Double[]{4.33,4.00, 3.67,3.33,3.00,2.67,2.33,2.00,1.67,1.00,0.00};
        for(int i=0; i<grades.length || i<computes.length; i++){
            client.put(grades[i],computes[i]);
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String temp="";
        try {
            while((temp=reader.readLine())!= "break") {
                System.out.println(client.get(temp));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
