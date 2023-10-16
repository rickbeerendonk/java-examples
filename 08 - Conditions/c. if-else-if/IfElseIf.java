// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.conditions.ifelseif;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime moment = LocalDateTime.now();
        int hour = moment.getHour();

        if (hour < 6) {
            System.out.println("Good night");
        } else if (hour < 12) {
            System.out.println("Good morning");
        } else if (hour < 18) {
            System.out.println("Good afternoon");
        } else {
            System.out.println("Good evening");
        }
    }
}
