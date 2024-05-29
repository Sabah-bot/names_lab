package com.example.greeting.controllers;
import com.example.greeting.models.Celebration;
import com.example.greeting.models.Greeting;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {

    @GetMapping
    public Greeting greeting(){
        return new Greeting("Sabah", "Good Morning");
    }

//    Extensions Attempt

    @PostMapping
    public Greeting greeting(
    @RequestParam String timeOfDay) {
        return new Greeting(timeOfDay);
    }

    @GetMapping("/summer")
    public Celebration summerGreeting() {
        String message = "Happy summer solstice!";
        return new Celebration(message);
    }

}