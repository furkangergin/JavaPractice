package day01_JavaIntro;

import day13_String.StringIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class Dene {

    public static int minn(int[] nums){
        Arrays.sort(nums);
        return nums[0];
    }

    public static void main(String[] args) {
         int arr []= {1,2};
         int min = minn(arr);

    }
}


