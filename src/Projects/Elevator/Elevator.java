package Projects.Elevator;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-11
 * Time: 11:11
 * Project: Assignment3
 * Copywrite: MIT
 */

/**
 * En klass som beskriver en hiss
 */
public class Elevator {

    int level;

    /**
     * Konstruktor som bestämmer aktuellt våningsplan
     * @param level
     */
    public Elevator(int level) {
        if (level <= 10 && level >= -2)
            this.level = level;
        else
            throw new IllegalArgumentException("Denna våning finns inte. Ange en våning mellan -2 och 10.");
    }

    /**
     * En instansmetod som ändrar våningsplan. Metoden skriver ut om man åker
     * upp, ner eller står still med hissen.
     * @param newLevel
     */
    public void goTo(int newLevel) {
        if (newLevel <= 10 && newLevel >= -2){
            if (this.level < newLevel) {
                System.out.println("Hissen åker upp till våning " + newLevel);
            } else if (this.level > newLevel) {
                System.out.println("Hissen åker ner till våning " + newLevel);
            } else
                System.out.println("Hissen står redan på våning " + newLevel);
            this.level = newLevel;
        }
        else
            throw new IllegalArgumentException("Denna våning finns inte. Ange en ny våning att åka till.");
    }

    /**
     * En instansmetod som returnerar det aktuella våningsnumret
     * @return this.level
     */
    public int where() {
        return this.level;
    }
}
