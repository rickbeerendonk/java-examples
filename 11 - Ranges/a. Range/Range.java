// European Union Public License version 1.2
// Copyright © 2026 Rick Beerendonk

package org.ranges.range;

import java.util.stream.IntStream;

public class Range {
    public static void main(String[] args) {
        // range: exclusive end (like Kotlin's until)
        System.out.println("range(1, 5):");
        IntStream.range(1, 5).forEach(System.out::println);

        // rangeClosed: inclusive end (like Kotlin's ..)
        System.out.println("rangeClosed(1, 5):");
        IntStream.rangeClosed(1, 5).forEach(System.out::println);

        // Step (every 2nd)
        System.out.println("step 2:");
        IntStream.iterate(0, n -> n < 10, n -> n + 2).forEach(System.out::println);
    }
}

// range(1, 5):
// 1
// 2
// 3
// 4
// rangeClosed(1, 5):
// 1
// 2
// 3
// 4
// 5
// step 2:
// 0
// 2
// 4
// 6
// 8
