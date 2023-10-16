// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.classes.properties.private_setter;

public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo.getProp());  // init

        // error: setProp(String) has private access in Demo
        //demo.setProp("new");

        System.out.println(demo.getProp());  // init
    }
}

public class Demo {
    private String prop = "init";

    public String getProp() {
        return prop;
    }

    private void setProp(String value) {
        this.prop = value;
    }
}
