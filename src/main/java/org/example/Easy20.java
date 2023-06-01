package org.example;

import java.util.HashMap;
import java.util.Stack;

public class Easy20 {
  public static void main(String[] args) {
    System.out.println(isValid("()"));
  }

  public static boolean isValid(String s) {
    HashMap<Character, Character> map = new HashMap<>();
    map.put(')', '(');
    map.put('}', '{');
    map.put(']', '[');
    Stack<Character> stack = new Stack<>();
    for(int i = 0; i <= s.length()-1; i++) {
      Character charAtI = s.charAt(i);
      if(charAtI == '(' || charAtI == '{' || charAtI == '[' ) {
        stack.push(charAtI);
        continue;
      }
      if(stack.isEmpty() || map.get(charAtI) != stack.pop()) {
          return false;
      }
    }
    if(stack.isEmpty()) {
      return true;
    }
    return false;
  }

  public static boolean isValid2(String s) {
    HashMap<Character, Character> Hmap = new HashMap<>();
    Hmap.put(')','(');
    Hmap.put('}','{');
    Hmap.put(']','[');
    Stack<Character> stack = new Stack<>();
    for (int idx = 0; idx < s.length(); idx++){
      if (s.charAt(idx) == '(' || s.charAt(idx) == '{' || s.charAt(idx) == '[') {
        stack.push(s.charAt(idx));
        continue;
      }
      if (stack.size() == 0 || Hmap.get(s.charAt(idx)) != stack.pop()) {
        return false;
      }
    }
    if (stack.size() == 0) {
      return true;
    }
    return false;
  }
}
