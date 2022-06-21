package cl.sustantiva.sakila.controllers;

import cl.sustantiva.sakila.entitys.Address;
import cl.sustantiva.sakila.services.AddressService;
import cl.sustantiva.sakila.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * JPAddress
 * cl.sustantiva.sakila.controllers
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 17-06-22
 */

@Controller
@RequestMapping(path = "/address")
public class AddressController {

    @Autowired
    AddressService as;

    @Autowired
    CityService cs;

    @GetMapping()
    public String getAddress(Model model){

        model.addAttribute("address", as.read());

        return "address";
    }

    @GetMapping("/edit/{id}")
    public String updateAddress(@PathVariable("id") int id,
                                Model model){

        Address a = as.read(id);

        model.addAttribute("address", as.read(id));
        model.addAttribute("citys", cs.readByCountry(a.getCity().getCountry().getCountry_id()));

        return "editAddress";

    }
}
