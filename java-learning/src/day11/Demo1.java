package day11;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        //String[] word={"hello","world","java","python"};
        String[] word = {"java", "python", "java", "c", "java", "python", "c"};
        HashMap<String,Integer> map=new HashMap<>();
//        for(String w:word){
//            if(map.containsKey(w)){
//                map.put(w,map.get(w)+1);
//            }else{
//                map.put(w,1);
//            }
//        }
        for(String w : word){
            map.put(w,map.getOrDefault(w,0)+1);
        }
        System.out.println(map);
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        for(String key:map.keySet())
            System.out.println(key+":"+map.get(key));
    }
}
