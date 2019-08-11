package com.neil.collectionutils;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

public class IsNotEmptyTest {
    public static void main(String[] args) {
        List<String> list = getList();
        System.out.println("Not Empty List Check: " + checkNotEmpty1(list));
        System.out.println("Not Empty List Check: " + checkNotEmpty2(list));
    }

    static List<String> getList() {
        return null;
    }

    static boolean checkNotEmpty1(List<String> list) {
        return !(list == null || list.isEmpty());
    }

    static boolean checkNotEmpty2(List<String> list) {
        return CollectionUtils.isNotEmpty(list);
    }
}
