package cl.sustantiva.sakila.services;

import cl.sustantiva.sakila.entitys.Country;
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
public interface CountryService {
    public void create(Country c);
    public List<Country> read();
    public Country read(int country_id);
    public void update(Country c);
    public void delete(int country_id);
}
