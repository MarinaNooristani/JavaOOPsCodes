package com.syntax.practice;

//public interface Herbivore {

// int amount = 10;
//public static void eatGrass(); Static methods in interfaces should have a body

 /*public int chew() {
         return 13;

        } Interface abstract methods cannot have body

  */
//}
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

 class Y {

    public static void main(String[] args) {
        // Your data structure...
        List<Map<String, Object>> list = new ArrayList<>();

        //Add some dummy data
        Map<String, Object> map = new HashMap<>();
        map.put("1", "A");
        map.put("2", "B");
        map.put("3", "C");

        //Add the Map to the List
        list.add(map);
        System.out.println(list);
        int positionInList = 0; //Manipulate this how you want

        //Use Map.Entry to access both key and value
        for (Entry<String, Object> entry : list.get(positionInList).entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
        }
    }
}