package Projects;

import javax.swing.*;
import java.text.DecimalFormat;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-08
 * Time: 13:25
 * Project: Inlämning1
 * Copywrite: MIT
 */
public class BMI {
    public static void main(String[] args) {

        //Testkod
        //double length = 1.6;
        //int weight = 64;

        String input = JOptionPane.showInputDialog("Ange din längd (cm): ");
        double length = Double.parseDouble(input);
        length = length / 100;

        String input2 = JOptionPane.showInputDialog("Ange din vikt (kg): ");
        int weight = Integer.parseInt(input2);

        double bmiCalc = weight / (length * length);
        DecimalFormat formatter = new DecimalFormat("#0.00");
        double bmi = bmiCalc;


        if (bmi < 18.5) {
            JOptionPane.showMessageDialog(null, "Vikt: " + weight + "\nLängd: " + length
                    + "\nBMI: " + formatter.format(bmi) + "\nViktklass: Undervikt");

        } else if (bmi >= 18.5 && bmi <= 25.0) {
            JOptionPane.showMessageDialog(null, "Vikt: " + weight + "\nLängd: " + length
                    + "\nBMI: " + formatter.format(bmi) + "\nViktklass: Normalvikt");

        } else if (bmi > 25.0 && bmi <= 30.0) {
            JOptionPane.showMessageDialog(null, "Vikt: " + weight + "\nLängd: " + length
                    + "\nBMI: " + formatter.format(bmi) + "\nViktklass: Övervikt");

        } else if (bmi > 30.0 && bmi <= 35.0) {
            JOptionPane.showMessageDialog(null, "Vikt: " + weight + "\nLängd: " + length
                    + "\nBMI: " + formatter.format(bmi) + "\nViktklass: Fetma klass 1");

        } else if (bmi > 35.0 && bmi <= 40.0) {
            JOptionPane.showMessageDialog(null, "Vikt: " + weight + "\nLängd: " + length
                    + "\nBMI: " + formatter.format(bmi) + "\nViktklass: Fetma klass 2");

        } else {
            JOptionPane.showMessageDialog(null, "Vikt: " + weight + "\nLängd: " + length
                    + "\nBMI: " + formatter.format(bmi) + "\nViktklass: Fetma klass 3");
        }
    }
}

