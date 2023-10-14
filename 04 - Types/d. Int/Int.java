// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

public class Main {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE); // -2147483648
        System.out.println(Integer.MAX_VALUE); // 2147483647

        // Explicit vs Implicit
        int explicit = 2147483647;
        var implicit = 2147483647; // int

        // "Weird", no error
        System.out.println(Integer.MAX_VALUE + 1); // -2147483648
    }
}
