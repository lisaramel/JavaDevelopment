package Projects.Dice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Genererar en textfil (textfile.txt) genom metoden createFile().
 * Skapar upp och loopar ut innehållet av två arrayer genom
 * metoderna analyseArray() och createArray. Skickar resultatet
 * till terminalen och även till en ny textfil (result.txt).
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Dice.createFile();

        PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter("result.txt")));

        int counter = 0;
        System.out.println("Tärningen slog: ");
        write.print("Tärningen slog: " + "\n" + "\n");

        for (int d : Dice.analyseArray(Dice.createArray())) {
            counter++;
            System.out.print(counter + "or:" + "\t" + d + "\n");
            write.print(counter + "or:" + "\t" + d + "\n");
        }

        write.close();

    }
}

