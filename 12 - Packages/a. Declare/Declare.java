// European Union Public License version 1.2
// Copyright © 2026 Rick Beerendonk

package org.packages.declare;

public class Declare {
    public static void main(String[] args) {
        System.out.println(Declare.class.getPackageName());  // org.packages.declare
        System.out.println(Declare.class.getName());         // org.packages.declare.Declare
        System.out.println(Declare.class.getSimpleName());   // Declare
    }
}
