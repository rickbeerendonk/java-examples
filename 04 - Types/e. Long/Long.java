// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

public class Main {
    public static void main(String[] args) {
        System.out.println(Long.MIN_VALUE); // -9223372036854775808
        System.out.println(Long.MAX_VALUE); // 9223372036854775807

        // Explicit vs Implicit
        long explicit = 9223372036854775807L;
        var implicit = 9223372036854775807L; // long

        // "Weird", no error
        System.out.println(Long.MAX_VALUE + 1); // -9223372036854775808
    }
}