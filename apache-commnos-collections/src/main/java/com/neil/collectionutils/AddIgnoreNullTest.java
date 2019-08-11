package com.neil.collectionutils;

import org.apache.commons.collections4.CollectionUtils;

import java.util.LinkedList;
import java.util.List;

public class AddIgnoreNullTest {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();

        CollectionUtils.addIgnoreNull(list, null);
        CollectionUtils.addIgnoreNull(list, "a");

        System.out.println(list);

        if (list.contains(null)) {
            System.out.println("There is Null Value");
        } else {
            System.out.println("There is not Null value");
        }
    }
}
