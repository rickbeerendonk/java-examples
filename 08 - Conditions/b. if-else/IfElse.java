// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.conditions.ifelse;

import java.time.LocalDateTime;

public class IfElse {
    public static void main(String[] args) {
        LocalDateTime moment = LocalDateTime.now();
        int hour = moment.getHour();

        // One line
        if (hour >= 6 && hour < 18)
            System.out.println("Good day");
        else
            System.out.println("Good night");

        // Block
        if (hour >= 6 && hour < 18) {
            System.out.println("Good day");
        } else {
            System.out.println("Good night");
        }
    }
}
