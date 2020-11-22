package Projects.TheRestaurant;
/**
 * Created by Lisa Ramel
 * Date: 2020-09-16
 * Time: 10:29
 * Project: Assignment3.3
 * Copywrite: MIT
 *
 *
 * En klass som beskriver bordsplacering
 */
public class Table {

    private int people;

    /**
     * Hämtar antalet personer
     * @return people
     */
    public int getPeople() {
        return people;
    }

    /**
     * Sätter antal personer med begränsningen 1-6
     * @param people antal personer i sällskapet
     */
    public void setPeople(int people) {
        if (people > 0 && people <= 6) {
            this.people = people;
        } else
            throw new IllegalArgumentException("Vi tar bara emot sällskap mellan 1-6 personer." + "\nVälkommen tillbaka!");
    }

    /**
     * En instansmetod som skriver ut vilket bord som sällskapet placerats vid
     */
    public void yourTable() {
        if (people <= 2)
            System.out.println("Här ska ni få sitta, ett fönsterbord för " + people + "." + "\nJag tänder ljuset här på bordet åt er. Här har ni menyn.");
        else if (people == 3 || people == 4)
            System.out.println("Varsågod, en soffhörna ska ni " + people + " få sitta i. Mysigt!" + "\nHär har ni varsin meny att kika på.");
        else if (people == 5)
            System.out.println("Här har vi ett rymligt bord till er " + people + "." + " Varsågoda, här har ni varsin meny.");
        else
            System.out.println("Vilket gäng! Ni " + people + " ska få sitta i sidorummet." + "\nVarsågoda här har ni menyn.");
    }

}
