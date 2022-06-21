package cl.sustantiva.sakila.services;

import cl.sustantiva.sakila.entitys.City;
import cl.sustantiva.sakila.repos.CityRepo;
import org.hibernate.Criteria;
import org.hibernate.internal.CriteriaImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * JPAddress
 * cl.sustantiva.sakila.services
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 16-06-22
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityRepo cr;

    @Override
    public void create(City c) {
        cr.save(c);
    }

    @Override
    public List<City> read() {
        return cr.findAll();
    }

    @Override
    public City read(int city_id) {
        return cr.findById(city_id).orElse(new City());
    }

    @Override
    public void update(City c) {
        cr.save(c);
    }

    @Override
    public void delete(int city_id) {
        cr.deleteById(city_id);
    }

    @Override
    public List<City> readByCountry(int country_id) {

        return cr.findByCountryId(country_id);
    }
}
