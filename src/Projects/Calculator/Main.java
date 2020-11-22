package Projects.Calculator;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-02
 * Time: 11:47
 * Project: UppgiftMiniräknare
 * Copywrite: MIT
 */

import javax.swing.*;

/**
 * En miniräknare som endast beräknar summa, division, multiplikation och subtraktion.
 * Miniräknaren godkänner endast en operator och två operander. Endast siffror godkänns,
 * där både positiva och negativa tal kan matas in.
 */

public class Main {

    public static void main(String[] args) {

        while (true) {

            //Testkod
            //String input = "4+2";
            //String input = "10-2";
            //String input = "2*5";
            //String input = "4/2";
            //String input = "2/0";

            String input = JOptionPane.showInputDialog("Mata in en uträkning: ");

            if (input == null)
                System.exit(0);

            int charPosition = FindChar.symbol(input, "+-*/", 1);

            if (charPosition >= 1) {

                try {

                    String position1 = input.substring(0, charPosition);
                    double number1 = Double.parseDouble(position1);

                    String calcChar = input.substring(charPosition, charPosition + 1);
                    double result = 0;

                    String position2 = input.substring(charPosition + 1);
                    double number2 = Double.parseDouble(position2);

                    switch (calcChar) {
                        case "+":
                            result = number1 + number2;
                            JOptionPane.showMessageDialog(null, "Summan blev: " + result);
                            //System.out.println(result);
                            break;
                        case "-":
                            result = number1 - number2;
                            JOptionPane.showMessageDialog(null, "Differensen blev: " + result);
                            //System.out.println(result);
                            break;
                        case "*":
                            result = number1 * number2;
                            JOptionPane.showMessageDialog(null, "Produkten blev: " + result);
                            //System.out.println(result);
                            break;
                        case "/":
                            if (number2 > 0) {
                                result = number1 / number2;
                                JOptionPane.showMessageDialog(null, "Kvoten blev: " + result);
                                //System.out.println(result);
                                break;
                            } else
                                System.out.println("Går ej att dividera med 0. Testa ett annat tal.");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Felaktig inmatning. Försök igen.");
                }
            } else
                System.out.println("Felaktig inmatning. Försök igen.");


        }
    }
}



