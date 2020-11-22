package Projects.TheRestaurant;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-15
 * Time: 15:26
 * Project: Assignment3.3
 * Copywrite: MIT
 *
 *
 * En klass som beskriver en meny
 */
public class Menu {

    private int menuNr;
    private String course;
    private int price;

    /**
     * En default konstruktor för att skapa upp nya objekt
     */
    public Menu() {

    }

    /**
     * En instansmetod som skriver ut en vald rätt från menyn till användaren
     * @param order avseer nummer på rätten användaren valt
     */
    public void chooseCourse(int order) {

        if (order > 0 && order <= 3) {
            if (menuNr == order) {
                System.out.println("Middagen är serverad!");
                System.out.println(getCourse());
                System.out.println("Bon apetit! ");
            }
        } else
            throw new IllegalArgumentException("Det har vi inte på menyn idag.");
    }

    /**
     * Hämtar rättens namn
     * @return course
     */
    public String getCourse() {
        return course;
    }

    /**
     * Sätter rättens namn
     * @param course rättens namn
     */
    public void setCourse(String course) {
        if (course != null)
            this.course = course;
        else
            throw new IllegalArgumentException();
    }

    /**
     * Hämtar priset
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sätter priset på rätten
     * @param price priset på rätten
     */
    public void setPrice(int price) {
        if (price > 0)
            this.price = price;
        else
            throw new IllegalArgumentException();
    }

    /**
     * Hämtar numret på rätten
     * @return menuNr
     */
    public int getMenuNr() {
        return menuNr;
    }

    /**
     * Sätter numret på rätten
     * @param menuNr numret på rätten
     */
    public void setMenuNr(int menuNr) {
        if (menuNr > 0)
            this.menuNr = menuNr;
        else
            throw new IllegalArgumentException();
    }

    /**
     * Skriver ut de olika Menu-objektens innehåll på en rad
     * @return menuNr, course, price
     */
    @Override
    public String toString() {
        return
                menuNr + ". " + course + " " + price + ":-";
    }
}

