package com.neil.collectionutils;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Arrays;
import java.util.List;

public class UnionTest {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("A", "A", "A", "B", "B");
        List<String> list2 = Arrays.asList("A", "A", "B", "B");

        System.out.println("Union of List 1 and List 2 is : " + CollectionUtils.union(list1, list2));
    }
}
