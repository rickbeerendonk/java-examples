// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.classes.properties.define;

public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo.getNumber());  // 123
        System.out.println(demo.getText());    // abc
    }
}

public class Demo {
    private int number = 123;
    private String text = "abc";

    public int getNumber() {
        return number;
    }

    public String getText() {
        return text;
    }
}
