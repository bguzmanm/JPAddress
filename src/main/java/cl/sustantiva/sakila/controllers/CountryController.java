package cl.sustantiva.sakila.controllers;

import cl.sustantiva.sakila.entitys.Country;
import cl.sustantiva.sakila.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * JPAddress
 * cl.sustantiva.sakila.controllers
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 16-06-22
 */
@Controller
@RequestMapping(path = "/countrys")
public class CountryController {


    @Autowired
    CountryService cs;

    @GetMapping
    public String getCountrys(Model model){

        model.addAttribute("countrys", cs.read());
        return "countrys";
    }
    @GetMapping(value = "/edit/{id}")
    public String updateCountry(
            @PathVariable("id") int id,
            Model model){

        model.addAttribute("country", cs.read(id));

        return "editCountry";

    }
    @PostMapping(value="/edit/")
    public String saveCountry(
            @RequestParam(name="country_id") int country_id,
            @RequestParam(name="country") String country) {

        Country c = cs.read(country_id);
        c.setCountry(country);
        cs.update(c);

        return "redirect:/countrys";

    }
}
