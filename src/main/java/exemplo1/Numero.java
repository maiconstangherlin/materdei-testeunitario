package exemplo1;

public class Numero {

    static final int[] NUM = {100, 90, 50, 40, 10, 9, 5, 4, 1};
    static final String[] ROM = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String converteParaRomano(int numero) {
        String romano = "";
        int i = 0;

        while (numero > 0) {
            if (numero >= NUM[i]) {
                romano = romano.concat(ROM[i]);
                numero -= NUM[i];
            } else {
                i++;
            }
        }

        return romano;
    }

}
