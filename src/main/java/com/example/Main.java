package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {

    Stream<String> lettersStream = Stream.of("a", "b", "c");

    Integer[] scores = new Integer[]{80, 66, 73, 92, 43};
    Stream<Integer> scoresStream = Arrays.stream(scores);

    List<String> shoppingList = new ArrayList<>();
    shoppingList.add("coffee");
    shoppingList.add("bread");
    shoppingList.add("pineapple");
    shoppingList.add("milk");
    shoppingList.add("pasta");
    // Stream<String> shoppingListStream = shoppingList.stream();
    List<String> sortedShoppingList = shoppingList.stream() // THIS ALLOWS US TO STORE THE CONTENTS THAT ARE STREAMED INTO A LIST
            .sorted()
            .map(item -> item.toUpperCase())
            .filter(item -> item.startsWith("P"))
            .collect(Collectors.toList());

    System.out.println(sortedShoppingList);
    
    // shoppingListStream.forEach(item -> System.out.println(item)); // DOESNT WORK BECAUSE A STREAM CAN ONLY BE USED ONCE

    System.out.println(shoppingList);

  }
}
