package cl.sustantiva.sakila.controllers;

import org.springframework.stereotype.Controller;
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
@RequestMapping(path = "/")
public class HomeController {

    @GetMapping
    public String inicio(){
        return "index";
    }
}
