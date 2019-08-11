package com.neil.collections.bidimap;

import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.TreeBidiMap;

public class BidiMapTest {
    public static void main(String[] args) {
        BidiMap<String, String> bidiMap = new TreeBidiMap<>();

        bidiMap.put("One", "1");
        bidiMap.put("Two", "2");
        bidiMap.put("Three", "3");

        System.out.println(bidiMap.get("One"));
        System.out.println(bidiMap.getKey("1"));
        System.out.println("Original BidiMap: " + bidiMap);

        bidiMap.removeValue("1");
        System.out.println("Modified BidiMap: " + bidiMap);
        BidiMap<String, String> inversedBidiMap = bidiMap.inverseBidiMap();
        System.out.println("Inversed BidiMap: " + inversedBidiMap);
    }
}
