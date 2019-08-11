package com.neil.collectionutils;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Arrays;
import java.util.List;

public class IntersectionTest {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("A", "A", "A", "B", "B", "C");
        List<String> list2 = Arrays.asList("A", "A", "B", "B");

        System.out.println("List 1 : " + list1);
        System.out.println("List 2 : " + list2);

        System.out.println("Commons Object of List 1 and List 2 : " + CollectionUtils.intersection(list1, list2));
    }
}
