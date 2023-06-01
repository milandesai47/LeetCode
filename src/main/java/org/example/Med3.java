package org.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Med3 {
  public static void main(String[] args) {
    lengthFoLongestSubstring("pwwkew");
  }
  public static int lengthFoLongestSubstring(String s) {
    int max = 0;
    Set<Character> map = new HashSet<>();
    for (int i = 0; i < s.length() - 1; i++) {
      Character characterAtI = s.charAt(i);
      map.add(characterAtI);
      for(int j = i+1; j < s.length(); j++) {
        Character characterAtJ = s.charAt(j);
        if(map.contains(characterAtJ)) {
          if(max < map.size()) {
            max = map.size();
          }
          map.clear();
          break;
        }
        map.add(characterAtJ);
        max = max + 1;
      }
    }
    System.out.println(max);
    return max;
  }
}
