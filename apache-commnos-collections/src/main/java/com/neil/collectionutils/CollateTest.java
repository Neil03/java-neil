package com.neil.collectionutils;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Arrays;
import java.util.List;

public class CollateTest {
    public static void main(String[] args) {
        List<String> sortedList1 = Arrays.asList("A", "C", "E");
        List<String> sortedList2 = Arrays.asList("B", "D", "F");

        List<String> mergedList = CollectionUtils.collate(sortedList1, sortedList2);

        System.out.println(mergedList);
    }
}
