package cl.sustantiva.sakila.repos;

import cl.sustantiva.sakila.entitys.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * JPAddress
 * cl.sustantiva.sakila.repos
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 16-06-22
 */
@Repository
public interface CityRepo  extends JpaRepository<City, Integer> {

    List<City> findByCountryId(int country_id);

}
