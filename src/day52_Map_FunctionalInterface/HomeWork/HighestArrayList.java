package day52_Map_FunctionalInterface.HomeWork;

import java.util.*;

public class HighestArrayList {

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>(Arrays.asList("java", "java", "python", "c#"));

        Map <String,Integer> map = new LinkedHashMap<>();

        for (String s : arr) {
            int frequency = Collections.frequency(arr, s);
            map.put(s,frequency);
        }

        int max = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> highest : map.entrySet()) {

            if(highest.getValue()>max){
                max= highest.getValue();
                System.out.println("element " + highest.getKey() +" has the highest frequency");
            }
        }
    }
}/*
Write a program that can find the element that has the highest
frequency in an arrayList
        Note: Must use a map
        Ex:
            list: [java, java, python, c#]
        output:
            [java=2, python=1, c#=1]
            element java has the highest frequency

*/
