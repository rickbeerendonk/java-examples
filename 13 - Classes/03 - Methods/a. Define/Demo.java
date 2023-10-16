// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.classes.methods.define;

public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.nothing();                            //
        System.out.println(demo.something());      // something
        System.out.println(demo.echo("Echo"));     // Echo
        System.out.println(demo.addOne(1));        // 2
        System.out.println(demo.multipleLine(1));  // 4
    }
}

public class Demo {
    public void nothing() {}

    public String something() { return "something"; }

    public String echo(String str) { return str; }
    
    public int addOne(int value) { return value + 1; }
    
    public int multipleLine(int value) {
        int newValue = value + 1;
        newValue *= 2;
        return newValue;
    }
}
