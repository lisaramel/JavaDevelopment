package Projects.Elevator;

public class Main {

    /**
     * Ett testprogram med två instanser av klassen Elevator
     * @param args
     */
    public static void main(String[] args) {

        Elevator e1 = new Elevator(10);
        Elevator e2 = new Elevator(-2);

        System.out.println("Du befinner dig på våning: " + e1.where());
        e1.goTo(-1);
        e1.goTo(5);
        e1.goTo(5);

        System.out.println();

        System.out.println("Du befinner dig på våning: " + e2.where());
        e2.goTo(3);

    }
}
