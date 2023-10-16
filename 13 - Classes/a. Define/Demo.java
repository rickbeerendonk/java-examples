// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.classes.define;

public class Demo {
    public static void main(String[] args) {
        // Create
        Empty empty = new Empty();

        System.out.println(empty.getClass().getName()); // org.classes.define.Empty
    }
}

// Define
class Empty {
}
