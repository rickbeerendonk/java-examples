// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.conditions.switch_;

import java.time.LocalDateTime;
import java.time.DayOfWeek;

public class Switch {
    public static void main(String[] args) {
        LocalDateTime moment = LocalDateTime.now();
        DayOfWeek dayOfWeek = moment.getDayOfWeek();
        int day = moment.getDayOfWeek().getValue();
        int month = moment.getMonthValue();

        // Enum
        switch (dayOfWeek) {
            case MONDAY:
                System.out.println("Monday");
                break;
            case TUESDAY:
                System.out.println("Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday");
                break;
            case THURSDAY:
                System.out.println("Thursday");
                break;
            case FRIDAY:
                System.out.println("Friday");
                System.out.println("Almost weekend");
                break;
            default:
                System.out.println("Weekend!");
        }

        // Int
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                System.out.println("Almost weekend");
                break;
            default:
                System.out.println("Weekend!");
        }

        // Multiple cases
        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("Winter");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Spring");
                break;
            default:
                if (month < 10 || month > 12) {
                    System.out.println("Summer");
                } else {
                    System.out.println("Autumn");
                }
        }
    }
}
