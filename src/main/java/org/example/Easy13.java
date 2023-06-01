package org.example;

import java.util.HashMap;
import java.util.Map;

public class Easy13 {
  public static void main(String[] args) {
   // romanToInt("VII");
    romanToInt2("VII");
  }
  public static int romanToInt(String s) {
    Map<String, Integer> map = new HashMap<>();
    map.put("I", 1);
    map.put("V", 5);
    map.put("X", 10);
    map.put("L", 50);
    map.put("C", 100);
    map.put("D", 500);
    map.put("M", 1000);

    int result = 0;
    boolean breakit = false;
    for(int i=0; i<=s.length()-1; i++) {
      Integer integerValueAtI = map.get(String.valueOf(s.charAt(i)));
      Integer integerValueAtIplus1 = 0;
      try {
        integerValueAtIplus1 = map.get(String.valueOf(s.charAt(i + 1)));
      } catch (IndexOutOfBoundsException e) {
        //swollow
        breakit = true;
      }
        if(integerValueAtIplus1 > integerValueAtI) {
          result = result - integerValueAtI;
        } else {
          result = result + integerValueAtI;
        }
        if(breakit) break;
      }


    System.out.println(result);

    return 1;
  }

  public static int romanToInt2(String s) {
    HashMap<Character,Integer> map=new HashMap<>();
    map.put('I',1);
    map.put('V',5);
    map.put('X',10);
    map.put('L',50);
    map.put('C',100);
    map.put('D',500);
    map.put('M',1000);
    int res=map.get(s.charAt(s.length()-1));
    for(int i=s.length()-2;i>=0;i--){
      if(map.get(s.charAt(i))<map.get(s.charAt(i+1)))
        res-=map.get(s.charAt(i));
      else
        res+=map.get(s.charAt(i));
    }
    return res;
  }
}
