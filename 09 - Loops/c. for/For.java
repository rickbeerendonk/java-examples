// European Union Public License version 1.2
// Copyright © 2026 Rick Beerendonk

package org.loops.for_;

public class For {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            System.out.println("Iteration " + i);
        }

        System.out.println("End");

        // Multiple variables in one for statement
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println(i + " - " + j);
        }
    }
}

// Iteration 1
// Iteration 2
// Iteration 3
// Iteration 4
// End
// 0 - 10
// 1 - 9
// 2 - 8
// 3 - 7
// 4 - 6
