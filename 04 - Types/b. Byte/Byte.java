// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

public class Main {
    public static void main(String[] args) {
        System.out.println("Min:   " + Byte.MIN_VALUE); // -128
        System.out.println("Max:   " + Byte.MAX_VALUE); // 127
        System.out.println("Bytes: " + Byte.BYTES);     // 1
        System.out.println("Size:  " + Byte.SIZE);      // 8

        // Explicit vs Implicit
        byte explicit = 127;
        var implicit = 127; // int

        // Error: incompatible types: possible lossy conversion from int to byte
        //byte x = implicit; 

        System.out.println(Byte.class.getName());               // java.lang.Byte 
        System.out.println(Byte.class.getSimpleName());         // Byte
    }
}
