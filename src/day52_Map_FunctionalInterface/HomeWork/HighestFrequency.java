package day52_Map_FunctionalInterface.HomeWork;

import java.util.*;

public class HighestFrequency {

    public static void main(String[] args) {

        String str = "eeeeeaaabbbbccccdd";

        String [] arr = str.split("");

        Map <String,Integer> high = new LinkedHashMap<>();

        int max= Integer.MIN_VALUE;

        for (String s : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr), s);
            high.put(s,frequency);
        }

        for (Map.Entry<String, Integer> highest : high.entrySet()) {

           if( highest.getValue()>max){
               max= highest.getValue();
               System.out.println("character "+ highest.getKey() + " has the highest frequency");
           }

        }


    }
}
/*
Write a program that can find the character that has the highest
frequency in a String
Note: Must use a map
Ex:
str = "eeeeeaaabbbbccccdd"
Output:
{e=5, a=3, b=4, c=4, d=2 }
character e has the highest frequency
 */
