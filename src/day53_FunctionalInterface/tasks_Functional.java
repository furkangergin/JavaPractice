package day53_FunctionalInterface;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class tasks_Functional {

    public static void main(String[] args) {
            /*
    Create a function that can return the sum of digits
from a string
     */
        Function<List<Integer>, String> sum = p -> {
            int result = 0;
            for (Integer num : p) {
                result += num;
            }
            return String.valueOf(result);
        };
        List<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("sum.apply(a) = " + sum.apply(a));


    /*
    Create a function that can convert a Set of Integers
to List of Integers
     */
        Function<Set<Integer>, List<Integer>> convert1 = p -> {

            List<Integer> nums = new ArrayList<>(p);

            return nums;

        };
        Set<Integer> num1 = new TreeSet<>(Arrays.asList(3, 5, 9));
        System.out.println("convert1.apply(num1) = " + convert1.apply(num1));

        /*
        Create a function that can convert a Set of String to
List of String
         */
        Function<Set<String>, List<String>> con = p-> {
           List<String> list = new ArrayList<>();
            for(String s : p){
                list.add(s);
            }
            return list;
        };
        Set<String> st = new HashSet<>(Arrays.asList("furkan", "gergin"));

        System.out.println("con.apply(st) = " + con.apply(st));

        /*
        Create a function that can return the reversed
version of an int array
         */
        Function<int[], int[]> in = p->{
            Arrays.sort(p);
            int[] reverse = new int[p.length];
            int j = 0;
            for (int i = p.length-1; i >= 0; i-- , j++) {
                reverse[j] = p[i];

            }

            return reverse;
        };
        int [] b = {1,2,13,4,5};
        int[] c =in.apply(b);

        System.out.println("Arrays.toString(c) = " + Arrays.toString(c));

        /*
        Create a function that can return the reversed
version of a String array
         */
        Function<String[] , String[]> arr = p->{
            String[] son = new String[p.length];
            int j=0;
            for (int i = p.length-1; i >= 0; i-- , j++) {
                son[j] = p[i];

            }
           String[] reverse2= new String[son.length];
            int k =0;
            for (String f : son){
                String result ="";
                for (int i = f.length()-1; i>=0; i--) {
                    result+=f.charAt(i);
                }
                reverse2[k]=result;
                k++;
            }
            return reverse2;
        };
        String[] s = {"mehmet","furkan","gergin"};
        String[] sa = arr.apply(s);

        System.out.println("Arrays.toString(sa) = " + Arrays.toString(sa));

        /*
        Use BiPredicate functional interface to:
5.1 Create a function that can check if two array are
equal and contains the same elements
ex: arr1 = {3,2,1}
arr2 = {2,1,3}
output: true
         */
        BiPredicate<int[],int[]> same = (p,q)->{
            boolean bo = true;
            Arrays.sort(p);
            Arrays.sort(q);

            if(p.length==q.length) {

                for (int i = 0; i < p.length; i++) {

                    if(p[i]!=q[i]){
                        bo = false;
                        break;
                        }
                }
            }else {
                bo=false;
            }
            return bo;

        };
        int[] x = {1,3,7};
        int[] y = {1,7,3};

        System.out.println("same.test(x,y) = " + same.test(x, y));




    }
}
