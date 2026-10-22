package day11;

import java.util.HashSet;

public class Demo2 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 2, 1, 5, 2};
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int num : set){
            System.out.println(num);
        }
    }

}
