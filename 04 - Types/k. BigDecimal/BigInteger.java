// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println(BigDecimal.ONE); 
        System.out.println(BigDecimal.TEN); 
        System.out.println(BigDecimal.ZERO);

        BigDecimal bd = new BigDecimal("1.23");
        System.out.println(bd);
    }
}
