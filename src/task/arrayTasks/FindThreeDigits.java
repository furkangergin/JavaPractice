package task.arrayTasks;

import java.util.Arrays;

public class FindThreeDigits {

    public static void main(String[] args) {

        /*Integer [] numbers = {-5,-120,0,56,156,195,12136};

        ArrayList <Integer> num = new ArrayList<>(Arrays.asList(numbers));

        System.out.println("num.get(5) = " + num.get(5));*/

        int[] numbers = {-5, -120, 0, 56, 156, 195, 12136};

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {

            if ((numbers[i] >= 100 && numbers[i] < 1000) || (numbers[i] <= -100 && numbers[i] >= -1000)) {
                count++;
            }

        }
        //System.out.println("count = " + count);

        int[] arr = new int[count];
        int countArr =0;

        for (int i = 0; i < numbers.length; i++) {

            if ((numbers[i] >= 100 && numbers[i] < 1000) || (numbers[i] <= -100 && numbers[i] >= -1000)) {
                arr[countArr] = numbers[i];
                countArr++;
            }


        }
        System.out.println(Arrays.toString(arr));
    }
}
