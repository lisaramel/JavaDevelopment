package Projects.TheRestaurant;

import java.util.Scanner;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-15
 * Time: 15:26
 * Project: Assignment3.3
 * Copywrite: MIT
 *
 *
 * En restaurang som frågar användaren om antal personer i sällskapet,
 * placerar ut användarens sällskap vid ett bord. Användaren får välja en
 * rätt från menyn och programmet börjar om.
 */
public class Restaurant {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Välkommen till Restaurang Main!");

            Table t1 = new Table();
            System.out.println("Vi har lediga bord för 1-6 personer. Hur många är ni?: ");
            int input = scan.nextInt();
            t1.setPeople(input);
            t1.yourTable();

            System.out.println();

            Menu m1 = new Menu();
            m1.setMenuNr(1);
            m1.setCourse("Hokkaidopumpa med mangold, lök, svamp & pinjekärnor.");
            m1.setPrice(275);

            Menu m2 = new Menu();
            m2.setMenuNr(2);
            m2.setCourse("Havsabborre med broccoli, grönkål & garam masala.");
            m2.setPrice(285);

            Menu m3 = new Menu();
            m3.setMenuNr(3);
            m3.setCourse("Lamm, rotselleri med svart trumpetsvamp & sky.");
            m3.setPrice(275);

            System.out.println(m1.toString());
            System.out.println(m2.toString());
            System.out.println(m3.toString());

            System.out.println();

            System.out.println("Vad vill du beställa? Ange nummer från menyn: ");
            int order = scan.nextInt();

            m1.chooseCourse(order);
            m2.chooseCourse(order);
            m3.chooseCourse(order);

            System.out.println();

            System.out.println("Vill du besöka restaurangen igen?");
            String again = scan.next();
            if (again == null)
                break;
        }

    }
}

