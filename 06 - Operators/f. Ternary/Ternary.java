// European Union Public License version 1.2
// Copyright © 2026 Rick Beerendonk

package org.operators.ternary;

public class Ternary {
    public static void main(String[] args) {
        int score = 75;
        String result = (score >= 60) ? "Pass" : "Fail";
        System.out.println(result);  // Pass

        int a = 10;
        int b = 20;
        int max = (a > b) ? a : b;
        System.out.println(max);     // 20

        // Nested ternary
        int x = 0;
        String sign = (x > 0) ? "positive" : (x < 0) ? "negative" : "zero";
        System.out.println(sign);    // zero
    }
}
