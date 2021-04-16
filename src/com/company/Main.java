package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Integer[] numbers = new Integer[] { 1, 2, 1, 2, 1, 3 , 3 , 4 , 5 , 5 };
        List<Integer> listInteger = Arrays.asList(numbers);
        listInteger.stream().filter(i -> Collections.frequency(listInteger, i) >1).collect(Collectors.toSet()).forEach(System.out::println);
    }
}
