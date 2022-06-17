package cl.sustantiva.sakila.services;

import cl.sustantiva.sakila.entitys.City;
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
public interface CityService {

    public void create(City c);
    public List<City> read();
    public City read(int city_id);
    public void update(City c);
    public void delete(int city_id);
}
