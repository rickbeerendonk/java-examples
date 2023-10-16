// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.classes.constructors.default_;

public class Main {
    public static void main(String[] args) {
        // Running shouldn't fail
        Demo demo = new Demo("one");
        System.out.println(demo.getClass().getName()); // org.classes.constructors.default_.Demo
    }
}

class Demo {
    public Demo(String name) {}
}
