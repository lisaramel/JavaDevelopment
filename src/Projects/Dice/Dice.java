package Projects.Dice;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-08
 * Time: 15:44
 * Project: Assignment2
 * Copywrite: MIT
 *
 * En klass som beskriver tärningskast
 */
public class Dice {

    /**
     * En metod som skickar 1000 randomiserade tal mellan 1-6
     * till en utvald fil (textfile.txt).
     * @throws IOException filen saknas
     */
    public static void createFile() throws IOException {

        try {
            PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter("textfile.txt")));

            int numbers;

            for (int i = 1; i <= 1000; ) {
                numbers = (int) (Math.random() * 6 + 1);
                i++;
                write.print(numbers + " ");
            }
            write.close();

        } catch (IOException error) {
            System.out.println(error.getMessage());
        }

    }

    /**
     * En metod som skapar en array (bigArray) med 1000 platser.
     * Metoden läser av en textfil och fyller innehållet i
     * textfilen i den skapade arrayen.
     * @return bigArray
     */
    public static int[] createArray() {

        int[] bigArray = new int[1000];

        try {
            Scanner read = new Scanner(new File("textfile.txt"));

            for (int i = 0; i < bigArray.length; i++) {
                bigArray[i] = read.nextInt();
            }

//                for (int n : bigArray)
//                    System.out.print(n + " ");

        } catch (Exception error) {

            System.out.println(error.getMessage());
        }

        return bigArray;
    }

    /**
     * En metod som skapar en array (smallArray) med 6 platser.
     * Metoden går igenom den större arrayen i metoden createArray()
     * och fyller en ny array (smallArray) med antalet tärningskastkast
     * av 1or, 2or, 3or etc.
     * @param isArray bigArray
     * @return smallArray
     */
    public static int[] analyseArray(int[] isArray) {

        int[] smallArray = new int[6];

        for (int i = 0; i < smallArray.length; i++) {
            int counter = 0;
            for (int j = 0; j < isArray.length; j++) {
                if(isArray[j] == i + 1){
                    counter++;
                    smallArray[i] = counter;
                }
            }
        }
//            for(int x : smallArray)
//               System.out.print(x + " ");

        return smallArray;
    }
}




