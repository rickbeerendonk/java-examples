// European Union Public License version 1.2
// Copyright © 2026 Rick Beerendonk

package org.returnandjumps.break_;

public class Break {
    public static void main(String[] args) {
        // Break out of a loop
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        // Break out of a switch
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other");
        }
    }
}

// 0
// 1
// 2
// 3
// 4
// Wednesday
