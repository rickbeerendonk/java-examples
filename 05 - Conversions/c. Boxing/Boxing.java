// European Union Public License version 1.2
// Copyright © 2026 Rick Beerendonk

package org.conversions.boxing;

public class Boxing {
    public static void main(String[] args) {
        // Autoboxing: primitive → wrapper
        int primitive = 42;
        Integer boxed = primitive;          // autoboxing
        System.out.println(boxed);          // 42
        System.out.println(boxed.getClass().getSimpleName());  // Integer

        // Unboxing: wrapper → primitive
        Integer wrapper = Integer.valueOf(100);
        int unboxed = wrapper;              // unboxing
        System.out.println(unboxed);        // 100

        // Other types
        double d = 3.14;
        Double dBoxed = d;                  // autoboxing
        System.out.println(dBoxed);         // 3.14

        boolean flag = true;
        Boolean bBoxed = flag;              // autoboxing
        System.out.println(bBoxed);         // true
    }
}
