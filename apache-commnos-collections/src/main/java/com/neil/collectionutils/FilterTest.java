package com.neil.collectionutils;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterTest {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        System.out.println("Original List: " + integerList);

        CollectionUtils.filter(integerList, new Predicate<Integer>() {

            @Override
            public boolean evaluate(Integer integer) {
                if (integer.intValue() % 2 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        });

        System.out.println("Filtered List (Even Number) : " + integerList);
    }
}
