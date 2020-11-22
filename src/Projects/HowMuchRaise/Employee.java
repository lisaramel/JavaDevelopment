package Projects.HowMuchRaise;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-14
 * Time: 11:31
 * Project: Lektion10
 * Copywrite: MIT
 */
public class Employee extends Person {

    // Scanner scan = new Scanner(System.in);

    private int hours;
    private double salary;

    public int getBefattning() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours != 0)
            this.hours = hours;
        else
            throw new IllegalArgumentException();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0)
            this.salary = salary;
        else
            throw new IllegalArgumentException();
    }

    public void raise(){
        salary = this.salary * 1.1;
    }
}



