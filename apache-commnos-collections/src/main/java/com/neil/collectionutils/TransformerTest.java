package com.neil.collectionutils;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Transformer;

import java.util.Arrays;
import java.util.List;

public class TransformerTest {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("1", "2", "3");
        List<Integer> integerList = (List<Integer>) CollectionUtils.collect(stringList, new Transformer<String, Integer>() {

            @Override
            public Integer transform(String i) {
                return Integer.parseInt(i);
            }
        });

        System.out.println(integerList);
    }
}
