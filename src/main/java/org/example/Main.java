package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> fruits = Lists.newArrayList("orange", "banana", "kiwi");
        fruits.forEach(System.out::println);

        List<String> reverseFruits = Lists.reverse(fruits);
        reverseFruits.forEach(System.out::println);

        Multimap<String, String> map = ArrayListMultimap.create();
        map.put("key", "firstValue");
        map.put("key", "secondValue");
        System.out.println(map);

    }
}