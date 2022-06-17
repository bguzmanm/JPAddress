package cl.sustantiva.sakila.entitys;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * JPAddress
 * cl.sustantiva.sakila.entitys
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 16-06-22
 */

@Entity
public class Country {

    @Id
    private int country_id;
    private String country;

    public Country(){
        super();
    }

    public Country(int country_id, String country) {
        this.country_id = country_id;
        this.country = country;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
