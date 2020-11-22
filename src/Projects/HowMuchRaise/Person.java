package Projects.HowMuchRaise;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-14
 * Time: 11:28
 * Project: Lektion10
 * Copywrite: MIT
 */

public class Person {
    private String name;
    private String adress;
    private String socialSecurityNr;

    /***************************************
     *
     * Getters and setters
     *
     ***************************************/

    /**
     * Hämtar namnet
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null)
            this.name = name;
        else
            throw new NullPointerException();
    }

    /**
     * Hämtar adressen
     * @return adress
     */
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        if (adress != null)
            this.adress = adress;
        else
            throw new NullPointerException();
    }

    /**
     * Hämtar personnumret
     * @return socialSecurityNumber
     */
    public String getSocialSecurityNr() {
        return socialSecurityNr;
    }

    public void setSocialSecurityNr(String socialSecurityNr) {
        if (socialSecurityNr != null)
            this.socialSecurityNr = socialSecurityNr;
        else
            throw new NullPointerException();
    }
}

