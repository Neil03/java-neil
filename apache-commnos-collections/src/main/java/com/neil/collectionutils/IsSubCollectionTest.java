package com.neil.collectionutils;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Arrays;
import java.util.List;

public class IsSubCollectionTest {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("A", "A", "A", "C", "C", "B", "B");
        List<String> list2 = Arrays.asList("A", "A", "B", "B");

        System.out.println("List 1 : " + list1);
        System.out.println("List 2 : " + list2);

        System.out.println("Is List 2 contained List 1 : " + CollectionUtils.isSubCollection(list2, list1));
    }
}
