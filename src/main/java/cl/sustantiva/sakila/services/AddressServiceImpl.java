package cl.sustantiva.sakila.services;

import cl.sustantiva.sakila.entitys.Address;
import cl.sustantiva.sakila.repos.AddressRepo;
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
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressRepo ar;

    @Override
    public void create(Address a) {
        ar.save(a);
    }

    @Override
    public List<Address> read() {
        return ar.findAll();
    }

    @Override
    public Address read(int address_id) {
        return ar.findById(address_id).orElse(new Address());
    }

    @Override
    public void update(Address a) {
        ar.save(a);
    }

    @Override
    public void delete(int address_id) {
        ar.deleteById(address_id);
    }
}
