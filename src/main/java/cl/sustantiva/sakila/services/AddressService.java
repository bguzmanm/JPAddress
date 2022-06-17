package cl.sustantiva.sakila.services;


import cl.sustantiva.sakila.entitys.Address;
import cl.sustantiva.sakila.repos.AddressRepo;
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
public interface AddressService {
    public void create(Address a);
    public List<Address> read();
    public Address read(int address_id);
    public void update(Address a);
    public void delete(int address_id);
}
