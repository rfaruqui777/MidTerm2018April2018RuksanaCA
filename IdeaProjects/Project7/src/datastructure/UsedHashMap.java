package datastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.io.*;
public class UsedHashMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>(){
            map.put(1,"BD");
            //map.Entry(2,"USA");
            //map.Entry(3,"Australia");
            System.out.println(map.get(1));
            //for(map.Entry entry:map.entrySet()){
              //  System.out.println(entry.getKey() + " " + entry.getValue());
            //}

    }
}
