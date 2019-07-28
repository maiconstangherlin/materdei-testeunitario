package exemplo1;

import java.util.Arrays;
import java.util.List;

public class Romano {

    static final int[] NUM = {90, 100, 40, 50, 9, 10, 4, 5, 1};
    static final String[] ROM = {"XC", "C", "XL", "L", "IX", "X", "IV", "V", "I"};

    public static int converteParaNumero(String romano) {

        for (int i = 0; i < ROM.length; i++) {
            romano = romano.replace(ROM[i].repeat(3), ";" + NUM[i] * 3);
            romano = romano.replace(ROM[i].repeat(2), ";" + NUM[i] * 2);
            romano = romano.replace(ROM[i], ";" + NUM[i]);
        }

        String numeros[] = romano.split(";");

        return Arrays.stream(numeros)
                .filter(n -> !n.isEmpty())
                .mapToInt(n -> Integer.valueOf(n))
                .sum();
    }

}
