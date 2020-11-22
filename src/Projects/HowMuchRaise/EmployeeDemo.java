package Projects.HowMuchRaise;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-14
 * Time: 11:39
 * Project: Lektion10
 * Copywrite: MIT
 */
public class EmployeeDemo {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setName("Lisa");
        p1.setAdress("Björkhagen");
        p1.setSocialSecurityNr("930306");


        Employee e1 = new Employee();
        e1.setName("Lisa");
        e1.setAdress("Björkhagen");
        e1.setSocialSecurityNr("930306");
        e1.setSalary(140);
        e1.setHours(40);
        e1.raise();

        System.out.println(p1.getName());
        System.out.println(e1.getAdress());
        System.out.println(e1.getSocialSecurityNr());
        System.out.println(e1.getBefattning() + " timmar i veckan.");
        System.out.println(e1.getSalary() + " kr/timma.");
        System.out.println("Din löneökning blev: " + e1.getSalary());


    }
}

