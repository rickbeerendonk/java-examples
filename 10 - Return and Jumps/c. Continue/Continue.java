// European Union Public License version 1.2
// Copyright © 2026 Rick Beerendonk

package org.returnandjumps.continue_;

public class Continue {
    public static void main(String[] args) {
        // Skip even numbers
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}

// 1
// 3
// 5
// 7
