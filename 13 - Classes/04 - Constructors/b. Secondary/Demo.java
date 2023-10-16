// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.classes.constructors.secondary;

public class Main {
    public static void main(String[] args) {
        Demo d1 = new Demo("one");
        System.out.println(d1.getName());
        System.out.println(d1.getOther());

        Demo d2 = new Demo("two", 222);
        System.out.println(d2.getName());
        System.out.println(d2.getOther());
    }
}

class Demo {
    private String name;
    private int other;

    public Demo(String name) {
        this.name = name;
    }

    public Demo(String name, int other) {
        this(name);
        this.other = other;
        // System.out.println("2nd constructor");
    }

    public String getName() {
        return name;
    }

    public int getOther() {
        return other;
    }
}
