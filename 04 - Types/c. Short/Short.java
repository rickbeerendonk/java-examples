// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

public class Main {
    public static void main(String[] args) {
        System.out.println(Short.MIN_VALUE); // -32768
        System.out.println(Short.MAX_VALUE); // 32767

        // Explicit vs Implicit
        short explicit = 32767;
        var implicit = 32767; // int

        // Error: incompatible types: possible lossy conversion from int to short
        //short x = implicit;
    }
}
