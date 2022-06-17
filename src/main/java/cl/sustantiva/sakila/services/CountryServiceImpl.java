package cl.sustantiva.sakila.services;

import cl.sustantiva.sakila.entitys.Country;
import cl.sustantiva.sakila.repos.CountryRepo;
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
public class CountryServiceImpl implements CountryService {

    @Autowired
    CountryRepo cr;

    @Override
    public void create(Country c) {
        cr.save(c);
    }

    @Override
    public List<Country> read() {
        return cr.findAll();
    }

    @Override
    public Country read(int country_id) {
        return cr.findById(country_id).orElse(new Country());
    }

    @Override
    public void update(Country c) {
        cr.save(c);
    }

    @Override
    public void delete(int country_id) {
        cr.deleteById(country_id);
    }
}
