// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.functions.overloading;

import java.util.function.Supplier;

public class Main {
    public static void test(int a) {
        test(a, 10);
    }

    public static void test(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        System.out.println("test(1)");
        test(1);
        // 1, 10

        System.out.println("test(1, 2)");
        test(1, 2);
        // 1, 2
    }
}
