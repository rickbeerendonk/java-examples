// European Union Public License version 1.2
// Copyright © 2026 Rick Beerendonk

package org.conversions.widening;

public class Widening {
    public static void main(String[] args) {
        byte b = 42;
        short s = b;    // byte → short (automatic)
        int i = s;      // short → int (automatic)
        long l = i;     // int → long (automatic)
        float f = l;    // long → float (automatic)
        double d = f;   // float → double (automatic)

        System.out.println(b);  // 42
        System.out.println(s);  // 42
        System.out.println(i);  // 42
        System.out.println(l);  // 42
        System.out.println(f);  // 42.0
        System.out.println(d);  // 42.0
    }
}
