// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

public class Main {
    public static void main(String[] args) {
        // Single line
        String str = "Text";
        System.out.println(str);  // Text
        System.out.println(str.length());  // 4
        System.out.println(str.subSequence(1, 3));  // ex
        System.out.println(str.getClass().getName());  // java.lang.String

        // Multi line
        String multi = """
            one
            "two"
        """;
        System.out.println(multi);

        // Get character
        System.out.println(str.charAt(0));  // T
        System.out.println(Character.class.getName());  // java.lang.Character

        // Special characters (single line)
        System.out.println("first \"line\" \nsecond line");
    }
}
