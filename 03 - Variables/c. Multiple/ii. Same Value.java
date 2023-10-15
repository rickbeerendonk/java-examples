// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

public class MutlipleVars_SameValue {
  public static void main(String[] args) {
    int a, b, c;
    a = b = c = 123;
    System.out.println(a); // 123
    System.out.println(b); // 123
    System.out.println(c); // 123
  }
}