package com.neil.collectionutils;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

public class IsEmptyTest {
    public static void main(String[] args) {
        List<String> list = getList();
        System.out.println("Empty List Check: " + checkEmptyList1(list));
        System.out.println("Empty List Check: " + checkEmptyList2(list));
    }

    static List<String> getList() {
        return null;
    }

    static boolean checkEmptyList1(List<String> list) {
        return list == null || list.isEmpty();
    }

    static boolean checkEmptyList2(List<String> list) {
        return CollectionUtils.isEmpty(list);
    }
}
