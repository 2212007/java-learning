package day12;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        //Demo1
        Integer a=127,b=127;
        Integer c=128,d=128;
        System.out.println(a==b);
        System.out.println(c==d);
        System.out.println(a.equals(b));
        System.out.println(c.equals(d));
        //Demo2
        ArrayList<String> list = new ArrayList<>(List.of("1","2","3","4"));
        printAll(list);
        ArrayList<Integer> set = new ArrayList<>(List.of(1,2,3,4));
        printAll(set);
        //Demo3
        System.out.println(Arrays.toString(new int[]{1,2,3,4}));
        //System.out.println(Arrays.toString(Arrays.sort(new int[]{1,2,3,4})));

        System.out.println("-------------------------------------------");

        int [] arr={5,2,8,1,9};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("-------------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 5,2,8,1,9);
        System.out.println(list2);
        printAll(list2);

        Collections.sort(list2);
        printAll(list2);

        int max = Collections.max(list2);
        System.out.println(max);

        System.out.println(Objects.isNull(null));
        System.out.println(Objects.isNull('a'));
        System.out.println(Objects.isNull("a"));
        System.out.println(Objects.equals(null,null));

    }
    //Demo2: Generic Method
    static <T> void printAll(ArrayList<T> list){
        for(T t : list){
            System.out.print(t+" ");
        }
        System.out.println();
    }
}
