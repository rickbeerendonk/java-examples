// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.conditions.if_;

import java.time.LocalDateTime;

public class If {
    public static void main(String[] args) {
        LocalDateTime moment = LocalDateTime.now();
        int hour = moment.getHour();

        // One line
        if (hour < 6 || hour >= 18) 
            System.out.println("Good night");

        // Block
        if (hour >= 6 && hour < 18) {
            System.out.println("Good day");
        }
    }
}
