package cl.sustantiva.sakila.controllers;

import cl.sustantiva.sakila.entitys.City;
import cl.sustantiva.sakila.entitys.Country;
import cl.sustantiva.sakila.services.CityService;
import cl.sustantiva.sakila.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * JPAddress
 * cl.sustantiva.sakila.controllers
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 17-06-22
 */
@Controller
@RequestMapping(path = "/citys")
public class CityController {

    @Autowired
    CityService cs;
    @Autowired
    CountryService cos;

    @GetMapping
    public String getAll(Model model){

        model.addAttribute("citys", cs.read());

        return "citys";
    }

    @GetMapping("/edit/{id}")
    public String updateCity(
            @PathVariable("id") int id,
            Model model){

        model.addAttribute("city", cs.read(id));
        model.addAttribute("countrys", cos.read());

        return "editCity";
    }

    @PostMapping("/edit/")
    public String saveCit(
            @RequestParam(name = "city_id") int city_id,
            @RequestParam(name="city") String city,
            @RequestParam(name="country") int country_id){

        City ci = cs.read(city_id);
        ci.setCity(city);
        Country co = cos.read(country_id);
        ci.setCountry(co);

        cs.update(ci);

        return "redirect:/citys";
    }
}
