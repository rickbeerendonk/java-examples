// European Union Public License version 1.2
// Copyright © 2026 Rick Beerendonk

package org.conversions.narrowing;

public class Narrowing {
    public static void main(String[] args) {
        double d = 9.99;
        float f = (float) d;    // double → float (explicit cast)
        long l = (long) f;      // float → long (truncates decimal)
        int i = (int) l;        // long → int (explicit cast)
        short s = (short) i;    // int → short (explicit cast)
        byte b = (byte) s;      // short → byte (explicit cast)

        System.out.println(d);  // 9.99
        System.out.println(f);  // 9.99
        System.out.println(l);  // 9
        System.out.println(i);  // 9
        System.out.println(s);  // 9
        System.out.println(b);  // 9

        // Data loss example
        int big = 1000;
        byte small = (byte) big;
        System.out.println(small);  // -24 (overflow)
    }
}
