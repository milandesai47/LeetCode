package org.example;

public class Easy9 {
  public static void main(String[] args) {
    System.out.println(isPalindrome(1212111));
  }

  public static boolean isPalindrome(int x) {
    String s = String.valueOf(x);
    StringBuffer sf = new StringBuffer();
    for(int i = s.length()-1; i!=-1; i--) {
      sf.append(s.charAt(i));
    }
    System.out.println(sf.toString());
    if(s.equals(sf.toString())) {
      return true;
    } else {
      return false;
    }
  }
}
