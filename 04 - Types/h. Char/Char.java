// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

public class Main {
    public static void main(String[] args) {
        char char1 = 'a';
        var char2 = 'a';
        System.out.println(char1);  // a
        System.out.println(char2);  // a
        System.out.println(Character.class.getName());  // java.lang.Character

        // Special characters
        System.out.println('\t');  // (tab)
        System.out.println('\b');  // (backspace)
        System.out.println('\n');  // (new-line)
        System.out.println('\r');  // (return)
        System.out.println('\'');  // '
        System.out.println('\"');  // "
        System.out.println('\\');  // \
        System.out.println('$');   // $
        System.out.println('\uFF00');  // (unicode)
    }
}
