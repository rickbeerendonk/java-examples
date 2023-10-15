// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.functions.withreturn;

public class Main {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sum = add(1, 2);

        System.out.println(sum); // 3
    }
}
