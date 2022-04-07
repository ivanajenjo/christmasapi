package com.ivajenjo.christmasapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChristmasController {

    @GetMapping("/")
    public String index() {
        return "Hello World!";
    }

    @GetMapping("/christmas")
    public String christmas() {
        return "Happy Christmas!";
    }

    @GetMapping("/christmas/{name}")
    public String christmas(@PathVariable String name) {
        return "Happy Christmas " + name + "!";
    }
}
