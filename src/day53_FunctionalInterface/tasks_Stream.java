package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class tasks_Stream {
    public static void main(String[] args) {

        /*
        1. Write a program that can remove the duplicated elements of an
array of String
         */

        String[] str = {"mehmet", "furkan", "mehmet"};

        //str = Arrays.stream(str).distinct().toArray();

        List<String> l = new ArrayList<>(Arrays.asList(str));

        l=l.stream().distinct().collect(Collectors.toList());

        String[] result = l.toArray(new String[0]);




        System.out.println(Arrays.toString(result));



        /*
        2. Write a program that can remove the duplicated elements of a List
of String
         */
        List<String> list = new ArrayList<>(Arrays.asList("fu", "fu", "ge"));

        list= list.stream().distinct().collect(Collectors.toList());

        System.out.println(list);


    }
}
