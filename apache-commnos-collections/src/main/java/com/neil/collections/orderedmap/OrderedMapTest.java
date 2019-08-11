package com.neil.collections.orderedmap;

import org.apache.commons.collections4.OrderedMap;
import org.apache.commons.collections4.map.LinkedMap;

public class OrderedMapTest {
    public static void main(String[] args) {
        OrderedMap<String, String> orderedMap = new LinkedMap<>();

        orderedMap.put("One", "1");
        orderedMap.put("Two", "2");
        orderedMap.put("Three", "3");

        System.out.println(orderedMap.firstKey());
        System.out.println(orderedMap.nextKey("One"));
        System.out.println(orderedMap.nextKey("Two"));
    }
}
