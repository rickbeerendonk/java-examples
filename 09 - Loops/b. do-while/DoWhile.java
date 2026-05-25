// European Union Public License version 1.2
// Copyright © 2026 Rick Beerendonk

package org.loops.dowhile;

public class DoWhile {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println("Iteration " + i);
            i++;
        } while (i < 5);

        System.out.println("End");

        // Executes at least once even when condition is false from the start
        int j = 10;
        do {
            System.out.println("Runs once: " + j);
        } while (j < 5);
    }
}

// Iteration 1
// Iteration 2
// Iteration 3
// Iteration 4
// End
// Runs once: 10
