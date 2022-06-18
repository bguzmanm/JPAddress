package cl.sustantiva.sakila.entitys;

import javax.persistence.*;
import java.awt.*;

/**
 * JPAddress
 * cl.sustantiva.sakila.entitys
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 16-06-22
 */
@Entity
@Table(name = "address")
public class Address {

    @Id
    private int address_id;
    private String address;
    private String address2;
    private String district;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "city_id")
    private City city;

    private String postal_code;

    //@Column(columnDefinition = "geometry(Point,4326)")
    //private Point location;

    public Address() {
        super();
    }

/*    public Address(int address_id, String address, String address2, String district, City city, String postal_code, Point location) {
        this.address_id = address_id;
        this.address = address;
        this.address2 = address2;
        this.district = district;
        this.city = city;
        this.postal_code = postal_code;
        this.location = location;
    }*/

    public Address(int address_id, String address, String address2, String district, City city, String postal_code) {
        this.address_id = address_id;
        this.address = address;
        this.address2 = address2;
        this.district = district;
        this.city = city;
        this.postal_code = postal_code;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

/*    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }*/
}
