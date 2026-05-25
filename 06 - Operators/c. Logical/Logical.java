// European Union Public License version 1.2
// Copyright © 2026 Rick Beerendonk

package org.operators.logical;

public class Logical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println(a && b);  // false  (AND)
        System.out.println(a || b);  // true   (OR)
        System.out.println(!a);      // false  (NOT)
        System.out.println(!b);      // true   (NOT)

        // Short-circuit evaluation: right side not evaluated if result is known
        int x = 0;
        boolean r1 = (x != 0) && (10 / x > 1);  // division never evaluated
        System.out.println(r1);      // false

        boolean r2 = (x == 0) || (10 / x > 1);  // division never evaluated
        System.out.println(r2);      // true
    }
}
