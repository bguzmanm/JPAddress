package cl.sustantiva.sakila.controllers;

import cl.sustantiva.sakila.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
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
 * @since 17-06-22
 */
@Controller
@RequestMapping(path = "/citys")
public class CityController {

    @Autowired
    CityService cs;

    @GetMapping
    public String getAll(Model model){

        model.addAttribute("citys", cs.read());

        return "citys";
    }
}
