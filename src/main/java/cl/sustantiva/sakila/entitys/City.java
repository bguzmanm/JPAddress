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
public class City {

    @Id
    private int city_id;

    private String city;
    private int country_id;

    public City() {
        super();
    }

    public City(int city_id, String city, int country_id) {
        this.city_id = city_id;
        this.city = city;
        this.country_id = country_id;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }
}
