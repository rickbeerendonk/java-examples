// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.functions.varargs;

public class Main {
    public static void test(String... a) {
        for (String item : a) {
            System.out.println(item);
        }
        System.out.println("Length: " + a.length);
        System.out.println("Type:   " + a.getClass().getCanonicalName());
    }

    public static void main(String[] args) {
        // Individual arguments
        test("1", "2", "3");

        // Array argument
        String[] arr = {"a", "b", "c"};
        test(arr);
    }
}
