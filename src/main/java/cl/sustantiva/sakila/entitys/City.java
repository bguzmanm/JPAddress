package cl.sustantiva.sakila.entitys;

import javax.persistence.*;

/**
 * JPAddress
 * cl.sustantiva.sakila.entitys
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 16-06-22
 */

@Entity
@Table(name = "city")
@NamedQuery(name="City.findByCountryId", query = "Select c from City c where c.country = ?1")
public class City {

    @Id
    private int city_id;

    private String city;
    @OneToOne()
    @JoinColumn(name="country_id")
    private Country country;

    public City() {
        super();
    }

    public City(int city_id, String city, Country country) {
        this.city_id = city_id;
        this.city = city;
        this.country = country;
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

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
