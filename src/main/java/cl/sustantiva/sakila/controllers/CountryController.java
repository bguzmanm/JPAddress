package cl.sustantiva.sakila.controllers;

import cl.sustantiva.sakila.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
