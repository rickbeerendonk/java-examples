// European Union Public License version 1.2
// Copyright © 2026 Rick Beerendonk

package org.loops.foreach;

import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        // Array
        int[] numbers = {1, 2, 3, 4, 5};
        for (int n : numbers) {
            System.out.println(n);
        }

        // Collection
        List<String> names = List.of("Alice", "Bob", "Carol");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

// 1
// 2
// 3
// 4
// 5
// Alice
// Bob
// Carol
