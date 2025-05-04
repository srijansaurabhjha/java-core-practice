package org.srijansaurabhjha.Map;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args){
        Map<String,Integer> mp=new HashMap<>();
        mp.put("Java",1);
        mp.put("C++",2);
        mp.put("Javascript",3);
        mp.put("Go",4);
        mp.put("Ruby",5);
        System.out.println(mp.get("Go"));

        //incrementing value
        mp.put("Go",mp.getOrDefault("Go",0)+1);
        mp.merge("Go",1,Integer::sum);
        System.out.println(mp.get("Go"));  //6

        //decrement value
        mp.put("Javascript",Math.max(0,mp.getOrDefault("Javascript",0)-1));
        mp.merge("Javascript",-1,Integer::sum);

        mp.remove("Ruby");

        //Iterating over a hashmap
        for(Map.Entry elem:mp.entrySet()){
            System.out.println(elem.getKey()+"-"+elem.getValue());
        }

        System.out.println(mp.containsKey("Ruby"));
        System.out.println(mp.containsValue(1));
    }
}
