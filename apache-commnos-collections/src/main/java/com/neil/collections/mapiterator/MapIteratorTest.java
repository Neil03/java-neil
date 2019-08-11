package com.neil.collections.mapiterator;

import org.apache.commons.collections4.IterableMap;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.map.HashedMap;

public class MapIteratorTest {
    public static void main(String[] args) {
        IterableMap<String, String> iterableMap = new HashedMap<>();

        iterableMap.put("1", "One");
        iterableMap.put("2", "Two");
        iterableMap.put("3", "Three");
        iterableMap.put("4", "Four");
        iterableMap.put("5", "Five");

        MapIterator<String, String> iterator = iterableMap.mapIterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            Object value = iterator.getValue();

            System.out.println("Key: " + key);
            System.out.println("Value: " + value);

            iterator.setValue(value + "_");
        }
        System.out.println(iterableMap);
    }
}
