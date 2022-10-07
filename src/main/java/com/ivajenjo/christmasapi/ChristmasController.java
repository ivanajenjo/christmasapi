package com.ivajenjo.christmasapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;

@RestController
public class ChristmasController {

    @GetMapping("/")
    public String index() {
        return "Hello World!";
    }

    @GetMapping("/christmas")
    public String christmas() {
        boolean isChristmas = (LocalDate.now().getMonth() == Month.DECEMBER) && (LocalDate.now().getDayOfMonth() == 25);
        if (isChristmas) {
            return "Today is Christmas!";
        }
        return "Today is not Christmas";
    }
}
