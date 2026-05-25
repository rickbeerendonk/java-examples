// European Union Public License version 1.2
// Copyright © 2026 Rick Beerendonk

package org.returnandjumps.labeled;

public class Labeled {
    public static void main(String[] args) {
        // Labeled break: exits the labeled (outer) loop entirely
        outer:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    break outer;
                }
                System.out.println(i + "," + j);
            }
        }

        System.out.println("---");

        // Labeled continue: continues the labeled (outer) loop
        outer:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    continue outer;
                }
                System.out.println(i + "," + j);
            }
        }
    }
}

// 0,0
// 0,1
// 0,2
// 1,0
// ---
// 0,0
// 1,0
// 2,0
