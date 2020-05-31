package es.fantasymanager.parser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class DemoRestController {

    @GetMapping("/hello")
    public String index() {
        return "Hello World!";
    }
}