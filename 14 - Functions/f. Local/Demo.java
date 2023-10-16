// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.functions.local;

public class Main {
    public static void test() {
        int a = 1;
        int b = 2;

        class Local {
            void local(int c) {
                // Access to everything within test()
                System.out.println(a + " " + b + " " + c);
            }
        }

        Local localObj = new Local();
        localObj.local(3);
    }

    public static void main(String[] args) {
        test();
    }
}
