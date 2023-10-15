// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.functions.withparameters;

public class Main {

    public static void one(String a) {
        // Parameters can be reassign, but it is a bad practice.
        //a = "changed";

        System.out.println(a);
    }

    public static void two(int a, boolean b) {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        one("abc");
        two(2, true);
    }
}
