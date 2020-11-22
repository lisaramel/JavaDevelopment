package Projects.Calculator;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-08
 * Time: 13:27
 * Project: Inlämning1
 * Copywrite: MIT
 */

/**
 * En metod som letar efter symbolerna +, -, * och /. Metoden returnerar
 * värdet -1 om det ej finns någon utav dessa symboler i strängen som
 * har matats in. Annars returneras en positiv siffra.
 */
public class FindChar {
    public static int symbol(String input, String c, int start) {

        for (int i = start; i < input.length(); i++)
            if (c.indexOf(input.charAt(i)) >= 0)

                return i;
        return -1;
    }
}





