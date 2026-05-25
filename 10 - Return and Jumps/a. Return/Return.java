// European Union Public License version 1.2
// Copyright © 2026 Rick Beerendonk

package org.returnandjumps.return_;

public class Return {
    static void printEven(int n) {
        if (n % 2 != 0) {
            return;  // early return from void method
        }
        System.out.println(n + " is even");
    }

    static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        printEven(3);   // (no output)
        printEven(4);   // 4 is even

        System.out.println(max(5, 3));  // 5
        System.out.println(max(2, 7));  // 7
    }
}
