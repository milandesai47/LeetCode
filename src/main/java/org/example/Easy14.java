package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Easy14 {
  public static void main(String[] args) {
    String[] argument = {"aa", "cc", "dd"};
    longestCommonPrefix(argument);
  }
  public static String longestCommonPrefix(String[] args) {
    List<String> collect = Arrays.asList(args).stream()
            .sorted(Comparator.comparing(s -> s.toString()))
            .collect(Collectors.toList());

    String first = collect.get(0);
    String last = collect.get(collect.size()-1);
    String prefix = "";
    int a = 0;
    while (a < first.length()) {
      if(first.charAt(a) == last.charAt(a)) {
        a++;
      } else {
        break;
      }
    }
    if(a == 0) {
      return prefix;
    } else {
      prefix = first.substring(0, a);
    }
    return prefix;
  }
}
