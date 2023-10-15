// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

public class Main {
    public static void main(String[] args) {

        // Java 21 Preview Feature

        var bool = true;
        var number = 123;
        var text = "abc";

        // Single line
        System.out.println(STR."bool: \{bool}, number+1: \{number + 1}, text: \{text} (length: \{text.length()}), slash: \\, double quotes: \"");
        // bool: true, number+1: 124, text: abc (length: 3), slash: \, double quotes: "

        // Multi line
        System.out.println(STR."""
        bool: \{bool}
        number+1: \{number + 1}
        text: \{text} (length: \{text.length()})
        slash: \
        double quotes: "
        """);
        // bool: true
        // number+1: 124
        // text: abc (length: 3)
        // slash: \
        // double quotes: "
    }
}
