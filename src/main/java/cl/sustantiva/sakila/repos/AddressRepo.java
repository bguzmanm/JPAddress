package cl.sustantiva.sakila.repos;

import cl.sustantiva.sakila.entitys.Address;
import cl.sustantiva.sakila.entitys.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
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
public interface AddressRepo extends JpaRepository<Address, Integer> {

    // JPQL para traer las direcciones de una ciudad
    @Query("Select a from Address a where a.city =:city")
    public List<Address> findAddressByCity(City city);
}
